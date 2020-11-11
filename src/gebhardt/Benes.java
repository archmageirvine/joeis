package gebhardt;

import java.util.Arrays;

import irvine.math.ByteUtils;

/**
 * Benes.
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

  // struct benes_p1 {
//   long     refcount;              /* reference count; -1 = persistent */
//   long  mask[2*LD_MAXN_2-1];   /* masks for stages */
//   long      shift[2*LD_MAXN_2-1];  /* shift amounts for stages */
//   long      depth;                 /* number of stages */
// };

  //long mRefCount;              /* reference count; -1 = persistent */
  long[] mMask = new long[2 * Utils.LD_MAXN_2 - 1];   /* masks for stages */
  byte[] mShift = new byte[2 * Utils.LD_MAXN_2 - 1];  /* shift amounts for stages */
  byte mDepth;                 /* number of stages */
  long[] mMask1 = new long[2 * Utils.LD_MAXN_2 - 1];  /* masks for stages; second long */

  //typedef struct benes_p2 benes;  /* We actually use struct benes_p1 where the second long is not needed... */

//  /*
//   * Increment the reference count for b and return b.
//   */
//  static Benes incRef(Benes b) {
//    if (b.mRefCount > 0) {
//      b.mRefCount++;
//    }
//    return b;
//  }
//
//
//  /*
//   * Decrement the reference count for b, and free the allocated memory if the reference count reaches 0.
//   */
//  static void delete(Benes b) {
//    if (b.mRefCount > 0 && (--(b.mRefCount)) == 0) {
//      //free(B);
//    }
//  }

  /*
   * Set B to a pointer to a Bene&scaron;scaron; network realising the action of the permutation p on the points lo..hi-1
   * as a permutation of blocks of width m, where pi is the inverse of p.  The masks for blocked Bene&scaron;scaron;
   * networks indicate the higher bit of each pair.
   */
  Benes(final byte[] p, final byte[] pi, final int lo, final int hi, final int m) {
    Benes t;
    final int n = hi - lo;
    final byte[] src = Permutation.create();
    final byte[] invSrc = Permutation.create();
    if (n <= BENES_SMALL) {
      for (int j = 0; j < n; j++) {
        src[j] = (byte)(p[lo + j] - lo);
      }
      t = benes_small[n][(int) Permutation.toInteger(n, src)];  /* no incref: Bene&scaron;scaron; network is persistent */
    } else {
      for (int j = 0; j < n; j++) {
        src[j] = (byte)(p[lo + j] - lo);
        invSrc[j] = (byte)(pi[lo + j] - lo);
      }
      t = new Benes(n, src, invSrc);
    }
    final int apf = BITSPERLONG / m;
    long mask;
    mDepth = t.mDepth;
    if (n > apf) {
      //b.mRefCount = 1;
      for (int i = 0; i < t.mDepth; i++) {
        mShift[i] = (byte) (m * t.mShift[i]);
        mMask[i] = mMask1[i] = 0;
        mask = Utils.BIT(m) - 1;
        int j;
        for (j = n - 1; j >= n - apf; j--) {  /* this order: the lower member of a pair becomes the higher block */
          if ((t.mMask[i] & Utils.BIT(j)) != 0) {
            mMask1[i] |= mask;
          }
          mask <<= m;
        }
        mask = Utils.BIT(m) - 1;
        for (; j >= 0; j--) {  /* this order: the lower member of a pair becomes the higher block */
          if ((t.mMask[i] & Utils.BIT(j)) != 0) {
            mMask[i] |= mask;
          }
          mask <<= m;
        }
      }
    } else {
      //b.mRefCount = 1;
      for (int i = 0; i < t.mDepth; i++) {
        mShift[i] = (byte) (m * t.mShift[i]);
        mMask[i] = 0;
        mask = Utils.BIT(m) - 1;
        for (int j = n; j-- != 0; ) {  /* this order: the lower member of a pair becomes the higher block */
          if ((t.mMask[i] & Utils.BIT(j)) != 0) {
            mMask[i] |= mask;
          }
          mask <<= m;
        }
      }
    }
    //delete(t);
  }

  /*
   * Set B to a pointer to a Bene&scaron;scaron; network realising the action of the permutation p on the points lo..hi-1,
   * where pi is the inverse of p.  The masks indicate the lower bit of each pair.
   */
  static Benes get(final byte[] p, final byte[] pi, final int lo, final int hi) {
    final int n = hi - lo;
    final byte[] src = Permutation.create();
    if (n <= BENES_SMALL) {
      for (int j = 0; j < n; j++) {
        src[j] = (byte) (p[lo + j] - lo);
      }
      return benes_small[n][(int) Permutation.toInteger(n, src)];  /* no incref: Bene&scaron;scaron; network is persistent */
    } else {
      final byte[] invSrc = Permutation.create();
      for (int j = 0; j < n; j++) {
        src[j] = (byte) (p[lo + j] - lo);
        invSrc[j] = (byte)(pi[lo + j] - lo);
      }
      return new Benes(n, src, invSrc);
    }
  }

  /*
   * Apply the Bene&scaron;scaron; network b to r.  The masks indicate the lower bit of each pair.
   */
  void applyP1(final long[] r) {
    long a = r[0];
    for (int i = 0; i < mDepth; ++i) {
      long t = ((a >> mShift[i]) ^ a) & mMask[i];
      a ^= t;
      t <<= mShift[i];
      a ^= t;
    }
    r[0] = a;
  }

  /*
   * Apply the Bene&scaron;scaron; network B acting on the positions of the packed antichain list r.
   * The masks for blocked Bene&scaron;scaron; networks indicate the higher bit of each pair.
   */
  void applyBlockedP1(long[] r) {
    long a = r[0];
    for (int i = 0; i < mDepth; ++i) {
      long t = ((a << mShift[i]) ^ a) & mMask[i];
      a ^= t;
      t >>= mShift[i];
      a ^= t;
    }
    r[0] = a;
  }


  /*
   * Apply the Bene&scaron;scaron; network *B to A[0],A[1].  The masks indicate the lower bit of each pair.
   *
   */
  static void benes_apply_p2(Benes B, long[] A) {
    long sft;
    long t;

    for (int i = 0; i < B.mDepth; ++i) {
      sft = B.mShift[i];
      t = ((A[0] >> sft) ^ A[0]) & B.mMask[i];
      A[0] ^= t;
      t <<= sft;
      A[0] ^= t;
      t = ((A[1] >> sft) ^ A[1]) & B.mMask[i];
      A[1] ^= t;
      t <<= sft;
      A[1] ^= t;
    }
  }


  /*
   * Apply the Bene&scaron;scaron; network *B acting on the positions of the packed antichain list A[0],A[1], with width bits of
   * A[1] used.  The masks for blocked Bene&scaron;scaron; networks indicate the higher bit of each pair.
   */
  static void benes_apply_blocked_p2(Benes B, long[] A, long width) {
    long sft, xsft;
    long t0, t0_, t1;

    for (int i = 0; i < B.mDepth; ++i) {
      sft = B.mShift[i];
      xsft = width - sft;
      t0 = (((A[0] << sft) | (A[1] >> xsft)) ^ A[0]) & B.mMask[i];
      t1 = ((A[1] << sft) ^ A[1]) & B.mMask1[i];
      A[0] ^= t0;
      A[1] ^= t1;
      t0_ = t0;
      t0 >>= sft;
      t1 = (t1 >> sft) | (t0_ << xsft);
      A[0] ^= t0;
      A[1] ^= t1;
    }
  }


  static Benes[][] benes_small = null;  /* global storage for precomputed Bene&scaron;scaron; networks */


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
   * Return a newly created Bene&scaron;scaron; network (carrying a reference count) realising as many copies of the
   * action of the permutation p on n points as fit into one long.
   * NOTE: src AND inv_src ARE MODIFIED.
   */
  Benes(final int n, final byte[] src, final byte[] inv_src) {
    int i, stage;
    int main_idx, src_idx, tgt_idx, Fpos, Bpos;
    int mask, nmask, src_set, cfg_src, cfg_tgt;
    //b.mRefCount = 1;
    int ld_n = ceil_ld(n);
    Fpos = 0;
    Bpos = 2 * ld_n - 1;
    byte[] tgt = ByteUtils.identity(Permutation.create());
    byte[] inv_tgt = ByteUtils.identity(Permutation.create());
    for (stage = 0, mask = 1; stage < ld_n; stage++, mask <<= 1) {
      nmask = ~mask;
      src_set = cfg_src = cfg_tgt = 0;
      for (main_idx = (int) Utils.BIT(ld_n); main_idx-- != 0; ) { /* this ensures that no crossings contain padded bits */
        if ((main_idx & mask) != 0) { /* loop over pairs... */
          /* ... upper representative */
          src_idx = main_idx;
          while ((Utils.BIT(src_idx) & src_set) == 0) {
            src_set |= Utils.BIT(src_idx); /* ...mark that source index as seen... */
            tgt_idx = src_idx < n ? inv_tgt[src[src_idx]] : src_idx; /* tgt_idx maps to src_idx */
            if (((src_idx ^ tgt_idx) & mask) != 0) {
              /* cross (at the endpoint, to preserve path constructed so far) */
              cfg_tgt |= Utils.BIT(tgt_idx & nmask); /* set the appropriate bit in the Bene&scaron;scaron; network */
              int idx2 = (byte)(tgt_idx ^ mask); /* the other part of the pair; to be swapped */
              byte t = tgt[tgt_idx];                /* update the target side... */
              tgt[tgt_idx] = tgt[idx2];        /* ...configuration that the... */
              tgt[idx2] = t;                   /* ...next stage sees; */
              inv_tgt[tgt[idx2]] = (byte) idx2;       /* the other part of the reordered pair... */
              inv_tgt[tgt[tgt_idx]] = (byte) tgt_idx; /* ...on the target side is tgt_idx! */
            } else {
              /* straight */
              tgt_idx ^= mask; /* the other part of the pair on the target side */
            }
            src_idx = tgt_idx < n ? inv_src[tgt[tgt_idx]] : tgt_idx; /* src_idx maps to tgt_idx */
            if (((src_idx ^ tgt_idx) & mask) != 0) {
              /* cross (at the endpoint, to preserve path constructed so far) */
              cfg_src |= Utils.BIT(src_idx & nmask); /* set the appropriate bit in the Bene&scaron;scaron; network */
              int idx2 = src_idx ^ mask; /* the other part of the pair; to be swapped */
              src_set |= Utils.BIT(idx2);            /* mark that source index as seen... */
              byte t = src[src_idx];                /* ...and update the source side */
              src[src_idx] = src[idx2];        /* ...configuration that the */
              src[idx2] = t;                   /* ...next stage sees; */
              inv_src[src[idx2]] = (byte)idx2;       /* the other part of the reordered pair... */
              inv_src[src[src_idx]] = (byte)src_idx; /* ...on the source side is src_idx! */
            } else {
              /* straight */
              src_set |= Utils.BIT(src_idx); /* mark that source index as seen */
              src_idx ^= mask; /* the other part of the pair on the source side */
            }
          }
          /* ... lower representative */
          src_idx = main_idx ^ mask;
          while ((Utils.BIT(src_idx) & src_set) == 0) {
            src_set |= Utils.BIT(src_idx); /* ...mark that source index as seen... */
            tgt_idx = src_idx < n ? inv_tgt[src[src_idx]] : src_idx; /* tgt_idx maps to src_idx */
            if (((src_idx ^ tgt_idx) & mask) != 0) {
              /* cross (at the endpoint, to preserve path constructed so far) */
              cfg_tgt |= Utils.BIT(tgt_idx & nmask); /* set the appropriate bit in the Bene&scaron;scaron; network */
              int idx2 = tgt_idx ^ mask; /* the other part of the pair; to be swapped */
              byte t = tgt[tgt_idx];                /* update the target side... */
              tgt[tgt_idx] = tgt[idx2];        /* ...configuration that the... */
              tgt[idx2] = t;                   /* ...next stage sees; */
              inv_tgt[tgt[idx2]] = (byte) idx2;       /* the other part of the reordered pair... */
              inv_tgt[tgt[tgt_idx]] = (byte) tgt_idx; /* ...on the target side is tgt_idx! */
            } else {
              /* straight */
              tgt_idx ^= mask; /* the other part of the pair on the target side */
            }
            src_idx = tgt_idx < n ? inv_src[tgt[tgt_idx]] : tgt_idx; /* src_idx maps to tgt_idx */
            if (((src_idx ^ tgt_idx) & mask) != 0) {
              /* cross (at the endpoint, to preserve path constructed so far) */
              cfg_src |= Utils.BIT(src_idx & nmask); /* set the appropriate bit in the Bene&scaron;scaron; network */
              int idx2 = src_idx ^ mask; /* the other part of the pair; to be swapped */
              src_set |= Utils.BIT(idx2);            /* mark that source index as seen... */
              byte t = src[src_idx];                /* ...and update the source side */
              src[src_idx] = src[idx2];        /* ...configuration that the */
              src[idx2] = t;                   /* ...next stage sees; */
              inv_src[src[idx2]] = (byte)idx2;       /* the other part of the reordered pair... */
              inv_src[src[src_idx]] = (byte) src_idx; /* ...on the source side is src_idx! */
            } else {
              /* straight */
              src_set |= Utils.BIT(src_idx); /* mark that source index as seen */
              src_idx ^= mask; /* the other part of the pair on the source side */
            }
          }
        }
      }
      /* record the configurations for the current stage */
      if (cfg_src != 0) {
        long smask;
        mShift[Fpos] = (byte) Utils.BIT(stage);
        smask = 0;
        int t = n;
        for (i = BITSPERLONG / n; i-- != 0; ) {
          smask |= cfg_src;
          cfg_src = (cfg_src | (cfg_src << t)) << t;
          t <<= 1;
        }
        mMask[Fpos] = smask;
        Fpos++;
      }
      if (cfg_tgt != 0) {
        long smask;
        Bpos--;
        mShift[Bpos] = (byte) Utils.BIT(stage);
        smask = 0;
        int t = n;
        for (i = BITSPERLONG / n; i-- != 0; ) {
          smask |= cfg_tgt;
          cfg_tgt = (cfg_tgt | (cfg_tgt << t)) << t;
          t <<= 1;
        }
        mMask[Bpos] = smask;
      }
    }
    /* make sure non-trivial stages are consecutive */
    if (Bpos > Fpos) {
      for (; Bpos < 2 * ld_n - 1; Fpos++, Bpos++) {
        mShift[Fpos] = mShift[Bpos];
        mMask[Fpos] = mMask[Bpos];
      }
      mDepth = (byte) Fpos;
    } else {
      mDepth = (byte) (2 * ld_n - 1);
    }
  }


  /*
   * Return n!.
   */
  private static int factorial(int n) {
    return n <= 1 ? 1 : n * factorial(n - 1);
  }


  /**
   * Precompute Bene&scaron;scaron; networks for all permutations on at most BENES_SMALL points.
   */
  public static void initSmall() {
    benes_small = new Benes[BENES_SMALL + 1][];
    final int[] n = new int[1];
    for (n[0] = 0; n[0] <= BENES_SMALL; n[0]++) {
      benes_small[n[0]] = new Benes[factorial(n[0])];
      final byte[] p = ByteUtils.identity(Permutation.create());
      do {
        final byte[] p_ = Arrays.copyOf(p, p.length);
        final byte[] pi_ = Permutation.inverse(n[0], p);
        final Benes b = new Benes(n[0], p_, pi_);
        // b.mRefCount = -1;
        benes_small[n[0]][(int) Permutation.toInteger(n[0], p)] = b;
      } while (Permutation.next(1, n, p));  /* a single level: 0..n-1 */
    }
  }
}
