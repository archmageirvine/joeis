package gebhardt;

import java.util.Arrays;

import irvine.math.ByteUtils;
import irvine.math.IntegerUtils;

/**
 * Permutations.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
public class Benes {

  /*
   * benes.c
   *
   * Created on: 8 Jun 2015
   * Last modified: 24 Jan 2018
   * Author: Volker Gebhardt, v.gebhardt@westernsydney.edu.au
   *
   *   Copyright (C) 2015-2018 by Volker Gebhardt
   *
   *   This program is free software; you can redistribute it and/or modify
   *   it under the terms of the GNU General Public License as published by
   *   the Free Software Foundation; either version 3 of the License, or
   *   (at your option) any later version.
   *
   *   This program is distributed in the hope that it will be useful,
   *   but WITHOUT ANY WARRANTY; without even the implied warranty of
   *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   *   GNU General Public License for more details.
   *
   *   You should have received a copy of the GNU General Public License
   *   along with this program; if not, write to the
   *   Free Software Foundation, Inc.,
   *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
   */

  private static final int BENES_SMALL = 10;
  private static final int BITSPERLONG = Long.SIZE;

  static long BIT(final long i) {
    return Constants.BIT(i); // todo inline
  }

// struct benes_p1 {
// 	long     refcount;              /* reference count; -1 = persistent */
// 	long  mask[2*LD_MAXN_2-1];   /* masks for stages */
// 	long      shift[2*LD_MAXN_2-1];  /* shift amounts for stages */
// 	long      depth;                 /* number of stages */
// };

  //struct benes_p2 {
  long refcount;              /* reference count; -1 = persistent */
  long[] mask = new long[2 * Constants.LD_MAXN_2 - 1];   /* masks for stages */
  byte[] shift = new byte[2 * Constants.LD_MAXN_2 - 1];  /* shift amounts for stages */
  byte depth;                 /* number of stages */
  long[] mask1 = new long[2 * Constants.LD_MAXN_2 - 1];  /* masks for stages; second long */
  //};

  //typedef struct benes_p2 benes;  /* We actually use struct benes_p1 where the second long is not needed... */

  /*
   * Increment the reference count for *B and return *B.
   */
  static Benes benes_incref(Benes B) {
    if (B.refcount > 0) {
      B.refcount++;
    }
    return B;
  }


  /*
   * Decrement the reference count for *B, and free the allocated memory if the reference count reaches 0.
   */
  static void benes_delete(Benes B) {
    if (B.refcount > 0 && (--(B.refcount)) == 0) {
      //free(B);
    }
  }


  /*
   * Set *B to a pointer to a Beneš network realising the action of the permutation p on the points lo..hi-1,
   * where pi is the inverse of p.  The masks indicate the lower bit of each pair.
   */
  static Benes benes_get(byte[] p, byte[] pi, int lo, int hi) {

    int n = hi - lo;
    byte[] src = new byte[n];
    byte[] inv_src = new byte[n];
    if (n <= BENES_SMALL) {
      for (int j = 0; j < n; j++) {
        src[j] = (byte) (p[lo + j] - lo);
      }
      return benes_small[n][(int) permutation.perm_toInteger(n, src)];  /* no incref: Beneš network is persistent */
    } else {
      for (int j = 0; j < n; j++) {
        src[j] = (byte) (p[lo + j] - lo);
        inv_src[j] = (byte)(pi[lo + j] - lo);
      }
      return benes_create(n, src, inv_src);
    }
// #if BENES_DOPREFETCH
// 	__builtin_prefetch((void*)*B);
// 	__builtin_prefetch((void*)*B+64);
// #endif
  }


  /*
   * Set *B to a pointer to a Beneš network realising the action of the permutation p on the points lo..hi-1
   * as a permutation of blocks of width m, where pi is the inverse of p.  The masks for blocked Beneš
   * networks indicate the higher bit of each pair.
   */
  static Benes benes_get_blocked(byte[] p, byte[] pi, int lo, int hi, int m) {
    int i, j, n, apf;
    Benes T;
    long mask;
    final Benes B = new Benes();

    n = hi - lo;
    byte[] src = new byte[n];
    byte[] inv_src = new byte[n];
    if (n <= BENES_SMALL) {
      for (j = 0; j < n; j++) {
        src[j] = (byte)(p[lo + j] - lo);
      }
      T = benes_small[n][(int) permutation.perm_toInteger(n, src)];  /* no incref: Beneš network is persistent */
// #if BENES_DOPREFETCH
// 	    __builtin_prefetch((void*)(T));
// 	    __builtin_prefetch((void*)(T+64));
// #endif
    } else {
      for (j = 0; j < n; j++) {
        src[j] = (byte)(p[lo + j] - lo);
        inv_src[j] = (byte)(pi[lo + j] - lo);
      }
      T = benes_create(n, src, inv_src);
    }
    apf = BITSPERLONG / m;
    mask = BIT(m) - 1;
    if (n > apf) {
      B.refcount = 1;
      B.depth = T.depth;
      for (i = 0; i < T.depth; i++) {
        B.shift[i] = (byte) (m * T.shift[i]);
        B.mask[i] = B.mask1[i] = 0;
        mask = BIT(m) - 1;
        for (j = n - 1; j >= n - apf; j--) {  /* this order: the lower member of a pair becomes the higher block */
          if ((T.mask[i] & BIT(j)) != 0) {
            B.mask1[i] |= mask;
          }
          mask <<= m;
        }
        mask = BIT(m) - 1;
        for (; j >= 0; j--) {  /* this order: the lower member of a pair becomes the higher block */
          if ((T.mask[i] & BIT(j)) != 0) {
            B.mask[i] |= mask;
          }
          mask <<= m;
        }
      }
// #if BENES_DOPREFETCH
//         __builtin_prefetch((void*)*B);
//         __builtin_prefetch((void*)*B+64);
// #endif
    } else {
      B.refcount = 1;
      B.depth = T.depth;
      for (i = 0; i < T.depth; i++) {
        B.shift[i] = (byte) (m * T.shift[i]);
        B.mask[i] = 0;
        mask = BIT(m) - 1;
        for (j = n; j-- != 0; ) {  /* this order: the lower member of a pair becomes the higher block */
          if ((T.mask[i] & BIT(j)) != 0) {
            B.mask[i] |= mask;
          }
          mask <<= m;
        }
      }
// #if BENES_DOPREFETCH
//         __builtin_prefetch((void*)*B);
//         __builtin_prefetch((void*)*B+64);
//         __builtin_prefetch((void*)*B+128);
// #endif
    }
    benes_delete(T);
    return B;
  }


  /*
   * Apply the Beneš network *B to *R.  The masks indicate the lower bit of each pair.
   */
  static void benes_apply_p1(Benes B, long[] R) {
    long A = R[0];
    for (int i = 0; i < B.depth; ++i) {
      long t = ((A >> B.shift[i]) ^ A) & B.mask[i];
      A ^= t;
      t <<= B.shift[i];
      A ^= t;
    }
    R[0] = A;
  }


  /*
   * Apply the Beneš network *B acting on the positions of the packed antichain list *R.
   * The masks for blocked Beneš networks indicate the higher bit of each pair.
   */
  static void benes_apply_blocked_p1(Benes B, long[] R) {
    long A = R[0];
    for (int i = 0; i < B.depth; ++i) {
      long t = ((A << B.shift[i]) ^ A) & B.mask[i];
      A ^= t;
      t >>= B.shift[i];
      A ^= t;
    }
    R[0] = A;
  }


  /*
   * Apply the Beneš network *B to A[0],A[1].  The masks indicate the lower bit of each pair.
   *
   */
  static void benes_apply_p2(Benes B, long[] A) {
    long sft;
    long t;

    for (int i = 0; i < B.depth; ++i) {
      sft = B.shift[i];
      t = ((A[0] >> sft) ^ A[0]) & B.mask[i];
      A[0] ^= t;
      t <<= sft;
      A[0] ^= t;
      t = ((A[1] >> sft) ^ A[1]) & B.mask[i];
      A[1] ^= t;
      t <<= sft;
      A[1] ^= t;
    }
  }


  /*
   * Apply the Beneš network *B acting on the positions of the packed antichain list A[0],A[1], with width bits of
   * A[1] used.  The masks for blocked Beneš networks indicate the higher bit of each pair.
   */
  static void benes_apply_blocked_p2(Benes B, long[] A, long width) {
    long sft, xsft;
    long t0, t0_, t1;

    for (int i = 0; i < B.depth; ++i) {
      sft = B.shift[i];
      xsft = width - sft;
      t0 = (((A[0] << sft) | (A[1] >> xsft)) ^ A[0]) & B.mask[i];
      t1 = ((A[1] << sft) ^ A[1]) & B.mask1[i];
      A[0] ^= t0;
      A[1] ^= t1;
      t0_ = t0;
      t0 >>= sft;
      t1 = (t1 >> sft) | (t0_ << xsft);
      A[0] ^= t0;
      A[1] ^= t1;
    }
  }


  static Benes[][] benes_small = null;  /* global storage for precomputed Beneš networks */


  /*
   * Return \lceil \log_2(x) \rceil, where 0 < x < 32, and return 0 for x \eq 0; this is the correct
   * semantics for benes_create.
   */
  static int ceil_ld(long x) {
    if (x < 9) {
      if (x < 3) {
        if (x < 2) {
          return 0;  /* x \le 1 */
        } else {
          return 1;  /* x \eq 2 */
        }
      } else {
        if (x < 5) {
          return 2;  /* x \in {3,4} */
        } else {
          return 3;  /* x \in {5,..,8} */
        }
      }
    } else {
      if (x < 17) {
        return 4;  /* x \in {9,..,16} */
      } else {
        return 5;  /* x \in {17,..,32} */
      }
    }
  }


  /*
   * Return a newly created Beneš network (carrying a reference count) realising as many copies of the
   * action of the permutation p on n points as fit into one long.
   * NOTE: src AND inv_src ARE MODIFIED.
   */
  static Benes benes_create(int n, byte[] src, byte[] inv_src) {
    Benes B;
    int i, stage;
    int main_idx, src_idx, tgt_idx, idx2, t, Fpos, Bpos;
    int mask, nmask, src_set, cfg_src, cfg_tgt;

// #ifdef DOTEST
// 	int[]  p;
// 	perm_cpy(n, src, p);
// #endif

    B = new Benes(); //(Benes)calloc(1, sizeof(struct benes_p1));
    B.refcount = 1;
    int ld_n = ceil_ld(n);
    Fpos = 0;
    Bpos = 2 * ld_n - 1;
    int[] tgt = IntegerUtils.identity(new int[n]);
    int[] inv_tgt = IntegerUtils.identity(new int[n]);
// #ifdef BENESVERBOSE
// 	printf("=== entering benes_create for ");
// 	perm_print(n, src, 0);
// #endif
    for (stage = 0, mask = 1; stage < ld_n; stage++, mask <<= 1) {
      nmask = ~mask;
// #ifdef BENESVERBOSE
// 		printf("+++ stage %d, mask=%llx\n", stage, mask);
// #endif
      src_set = cfg_src = cfg_tgt = 0;
      for (main_idx = (int) BIT(ld_n); main_idx-- != 0; ) { /* this ensures that no crossings contain padded bits */
        if ((main_idx & mask) != 0) { /* loop over pairs... */
          /* ... upper representative */
          src_idx = main_idx;
          while ((BIT(src_idx) & src_set) == 0) {
            src_set |= BIT(src_idx); /* ...mark that source index as seen... */
// #ifdef BENESVERBOSE
// 					printf(">>> [u] src_idx: %d", src_idx);
// #endif
            tgt_idx = src_idx < n ? inv_tgt[src[src_idx]] : src_idx; /* tgt_idx maps to src_idx */
// #ifdef BENESVERBOSE
// 					printf(" -. tgt_idx: %d", tgt_idx);
// #endif
            if (((src_idx ^ tgt_idx) & mask) != 0) {
              /* cross (at the endpoint, to preserve path constructed so far) */
// #ifdef BENESVERBOSE
// 						printf(" CROSS\n");
// #endif
              cfg_tgt |= BIT(tgt_idx & nmask); /* set the appropriate bit in the Beneš network */
              idx2 = tgt_idx ^ mask; /* the other part of the pair; to be swapped */
              t = tgt[tgt_idx];                /* update the target side... */
              tgt[tgt_idx] = tgt[idx2];        /* ...configuration that the... */
              tgt[idx2] = t;                   /* ...next stage sees; */
              inv_tgt[tgt[idx2]] = idx2;       /* the other part of the reordered pair... */
              inv_tgt[tgt[tgt_idx]] = tgt_idx; /* ...on the target side is tgt_idx! */
            } else {
              /* straight */
// #ifdef BENESVERBOSE
// 						printf(" straight\n");
// #endif
              tgt_idx ^= mask; /* the other part of the pair on the target side */
            }
// #ifdef BENESVERBOSE
// 					printf(">>> tgt_idx: %d", tgt_idx);
// #endif
            src_idx = tgt_idx < n ? inv_src[tgt[tgt_idx]] : tgt_idx; /* src_idx maps to tgt_idx */
// #ifdef BENESVERBOSE
// 					printf(" -. src_idx: %d", src_idx);
// #endif
            if (((src_idx ^ tgt_idx) & mask) != 0) {
              /* cross (at the endpoint, to preserve path constructed so far) */
// #ifdef BENESVERBOSE
// 						printf(" CROSS\n");
// #endif
              cfg_src |= BIT(src_idx & nmask); /* set the appropriate bit in the Beneš network */
              idx2 = src_idx ^ mask; /* the other part of the pair; to be swapped */
              src_set |= BIT(idx2);            /* mark that source index as seen... */
              t = src[src_idx];                /* ...and update the source side */
              src[src_idx] = src[idx2];        /* ...configuration that the */
              src[idx2] = (byte)t;                   /* ...next stage sees; */
              inv_src[src[idx2]] = (byte)idx2;       /* the other part of the reordered pair... */
              inv_src[src[src_idx]] = (byte)src_idx; /* ...on the source side is src_idx! */
            } else {
              /* straight */
// #ifdef BENESVERBOSE
// 						printf(" straight\n");
// #endif
              src_set |= BIT(src_idx); /* mark that source index as seen */
              src_idx ^= mask; /* the other part of the pair on the source side */
            }
          }
          /* ... lower representative */
          src_idx = main_idx ^ mask;
          while ((BIT(src_idx) & src_set) == 0) {
            src_set |= BIT(src_idx); /* ...mark that source index as seen... */
// #ifdef BENESVERBOSE
// 					printf(">>> [l] src_idx: %d", src_idx);
// #endif
            tgt_idx = src_idx < n ? inv_tgt[src[src_idx]] : src_idx; /* tgt_idx maps to src_idx */
// #ifdef BENESVERBOSE
// 					printf(" -. tgt_idx: %d", tgt_idx);
// #endif
            if (((src_idx ^ tgt_idx) & mask) != 0) {
              /* cross (at the endpoint, to preserve path constructed so far) */
// #ifdef BENESVERBOSE
// 						printf(" CROSS\n");
// #endif
              cfg_tgt |= BIT(tgt_idx & nmask); /* set the appropriate bit in the Beneš network */
              idx2 = tgt_idx ^ mask; /* the other part of the pair; to be swapped */
              t = tgt[tgt_idx];                /* update the target side... */
              tgt[tgt_idx] = tgt[idx2];        /* ...configuration that the... */
              tgt[idx2] = t;                   /* ...next stage sees; */
              inv_tgt[tgt[idx2]] = idx2;       /* the other part of the reordered pair... */
              inv_tgt[tgt[tgt_idx]] = tgt_idx; /* ...on the target side is tgt_idx! */
            } else {
              /* straight */
// #ifdef BENESVERBOSE
// 						printf(" straight\n");
// #endif
              tgt_idx ^= mask; /* the other part of the pair on the target side */
            }
// #ifdef BENESVERBOSE
// 					printf(">>> tgt_idx: %d", tgt_idx);
// #endif
            src_idx = tgt_idx < n ? inv_src[tgt[tgt_idx]] : tgt_idx; /* src_idx maps to tgt_idx */
// #ifdef VBENESERBOSE
// 					printf(" -. src_idx: %d", src_idx);
// #endif
            if (((src_idx ^ tgt_idx) & mask) != 0) {
              /* cross (at the endpoint, to preserve path constructed so far) */
// #ifdef BENESVERBOSE
// 						printf(" CROSS\n");
// #endif
              cfg_src |= BIT(src_idx & nmask); /* set the appropriate bit in the Beneš network */
              idx2 = src_idx ^ mask; /* the other part of the pair; to be swapped */
              src_set |= BIT(idx2);            /* mark that source index as seen... */
              t = src[src_idx];                /* ...and update the source side */
              src[src_idx] = src[idx2];        /* ...configuration that the */
              src[idx2] = (byte)t;                   /* ...next stage sees; */
              inv_src[src[idx2]] = (byte)idx2;       /* the other part of the reordered pair... */
              inv_src[src[src_idx]] = (byte) src_idx; /* ...on the source side is src_idx! */
            } else {
              /* straight */
// #ifdef BENESVERBOSE
// 						printf(" straight\n");
// #endif
              src_set |= BIT(src_idx); /* mark that source index as seen */
              src_idx ^= mask; /* the other part of the pair on the source side */
            }
          }
        }
      }
      /* record the configurations for the current stage */
      if (cfg_src != 0) {
        long smask;
        B.shift[Fpos] = (byte) BIT(stage);
        smask = 0;
        t = n;
        for (i = BITSPERLONG / n; i-- != 0; ) {
          smask |= cfg_src;
          cfg_src = (cfg_src | (cfg_src << t)) << t;
          t <<= 1;
        }
        B.mask[Fpos] = smask;
        Fpos++;
      }
      if (cfg_tgt != 0) {
        long smask;
        Bpos--;
        B.shift[Bpos] = (byte) BIT(stage);
        smask = 0;
        t = n;
        for (i = BITSPERLONG / n; i-- != 0; ) {
          smask |= cfg_tgt;
          cfg_tgt = (cfg_tgt | (cfg_tgt << t)) << t;
          t <<= 1;
        }
        B.mask[Bpos] = smask;
      }
    }
    /* make sure non-trivial stages are consecutive */
    if (Bpos > Fpos) {
      for (; Bpos < 2 * ld_n - 1; Fpos++, Bpos++) {
        B.shift[Fpos] = B.shift[Bpos];
        B.mask[Fpos] = B.mask[Bpos];
      }
      B.depth = (byte) Fpos;
    } else {
      B.depth = (byte) (2 * ld_n - 1);
    }
// #ifdef DOTEST
// 	if (n)
// 		for (i=0,mask=1UL; i<BITSPERLONG/n; i++,mask<<=1) {
// 			nmask = mask;
// 			benes_apply_p1(B, &nmask);
// 			if (nmask != (1UL << (p[i%n] + n*(i/n)))) {
// 				printf("BAD BENES NETWORK on level %d: ", i);
// 				perm_print(n, p, 0);
// 				for (i=0; i<B.depth; i++)
// 					printf("(%d,%lx) ", B.shift[i], (unsigned long)B.mask[i]);
// 				printf("\n");
// 				erri(-4);
// 			}
// 		}
// #endif
    return B;
  }


  /*
   * Return n!.
   */
  private static int factorial(int n) {
    return n <= 1 ? 1 : n * factorial(n - 1);
  }


  /**
   * Precompute Beneš networks for all permutations on at most BENES_SMALL points.
   */
  public static void benes_init_small() {
    benes_small = new Benes[BENES_SMALL + 1][]; //calloc(BENES_SMALL + 1, sizeof(Benes[]));
    final int[] n = new int[1];
    for (n[0] = 0; n[0] <= BENES_SMALL; n[0]++) {
      benes_small[n[0]] = new Benes[factorial(n[0])]; //(Benes[]) calloc(factorial(n), sizeof(Benes));
      final byte[] p = ByteUtils.identity(new byte[n[0]]); //perm_init(n, p);
      do {
        final byte[] p_ = Arrays.copyOf(p, n[0]);
        final byte[] pi_ = permutation.perm_inv(n[0], p);
        final Benes B = benes_create(n[0], p_, pi_);
        B.refcount = -1;
        benes_small[n[0]][(int) permutation.perm_toInteger(n[0], p)] = B;
      } while (permutation.perm_next(1, n, p));  /* a single level: 0..n-1 */
    }
  }


  /*
   * Free the memory allocated for the precomputed Beneš networks for all permutations
   * on at most BENES_SMALL points.
   */
  void benes_free_small() {
    if (benes_small != null) {
//      for (int n = 0; n <= BENES_SMALL; n++) {
//        for (int i = 0; i < factorial(n); i++)
//          free(benes_small[n][i]);
//        free(benes_small[n]);
//      }
//      free(benes_small);
      benes_small = null;
    }
  }
}
