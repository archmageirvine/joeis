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
   * Set B to a pointer to a Bene&scaron; network realising the action of the permutation p on the points lo..hi-1
   * as a permutation of blocks of width m, where pi is the inverse of p.  The masks for blocked Bene&scaron;
   * networks indicate the higher bit of each pair.
   */
  Benes(final byte[] p, final byte[] pi, final int lo, final int hi, final int m) {
    final Benes t;
    final int n = hi - lo;
    final byte[] src = Permutation.create();
    final byte[] invSrc = Permutation.create();
    if (n <= BENES_SMALL) {
      for (int j = 0; j < n; ++j) {
        src[j] = (byte) (p[lo + j] - lo);
      }
      t = sBenesSmall[n][(int) Permutation.toInteger(n, src)];  /* no incref: Bene&scaron; network is persistent */
    } else {
      for (int j = 0; j < n; ++j) {
        src[j] = (byte) (p[lo + j] - lo);
        invSrc[j] = (byte) (pi[lo + j] - lo);
      }
      t = new Benes(n, src, invSrc);
    }
    final int apf = BITSPERLONG / m;
    long mask;
    mDepth = t.mDepth;
    if (n > apf) {
      for (int i = 0; i < t.mDepth; ++i) {
        mShift[i] = (byte) (m * t.mShift[i]);
        mMask[i] = mMask1[i] = 0;
        mask = Utils.bit(m) - 1;
        int j;
        for (j = n - 1; j >= n - apf; --j) {  /* this order: the lower member of a pair becomes the higher block */
          if ((t.mMask[i] & Utils.bit(j)) != 0) {
            mMask1[i] |= mask;
          }
          mask <<= m;
        }
        mask = Utils.bit(m) - 1;
        for (; j >= 0; j--) {  /* this order: the lower member of a pair becomes the higher block */
          if ((t.mMask[i] & Utils.bit(j)) != 0) {
            mMask[i] |= mask;
          }
          mask <<= m;
        }
      }
    } else {
      for (int i = 0; i < t.mDepth; ++i) {
        mShift[i] = (byte) (m * t.mShift[i]);
        mMask[i] = 0;
        mask = Utils.bit(m) - 1;
        for (int j = n; j-- != 0; ) {  /* this order: the lower member of a pair becomes the higher block */
          if ((t.mMask[i] & Utils.bit(j)) != 0) {
            mMask[i] |= mask;
          }
          mask <<= m;
        }
      }
    }
  }

  /*
   * Set B to a pointer to a Bene&scaron; network realising the action of the permutation p on the points lo..hi-1,
   * where pi is the inverse of p.  The masks indicate the lower bit of each pair.
   */
  static Benes get(final byte[] p, final byte[] pi, final int lo, final int hi) {
    final int n = hi - lo;
    final byte[] src = Permutation.create();
    if (n <= BENES_SMALL) {
      for (int j = 0; j < n; ++j) {
        src[j] = (byte) (p[lo + j] - lo);
      }
      return sBenesSmall[n][(int) Permutation.toInteger(n, src)];  /* no incref: Bene&scaron; network is persistent */
    } else {
      final byte[] invSrc = Permutation.create();
      for (int j = 0; j < n; ++j) {
        src[j] = (byte) (p[lo + j] - lo);
        invSrc[j] = (byte) (pi[lo + j] - lo);
      }
      return new Benes(n, src, invSrc);
    }
  }

  /*
   * Apply the Bene&scaron; network b to r.  The masks indicate the lower bit of each pair.
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
   * Apply the Bene&scaron; network B acting on the positions of the packed antichain list r.
   * The masks for blocked Bene&scaron; networks indicate the higher bit of each pair.
   */
  void applyBlockedP1(final long[] r) {
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
   * Apply the Bene&scaron; network *B to a[0],a[1].  The masks indicate the lower bit of each pair.
   *
   */
  void applyP2(final long[] a) {
    for (int i = 0; i < mDepth; ++i) {
      final int sft = mShift[i];
      long t = ((a[0] >> sft) ^ a[0]) & mMask[i];
      a[0] ^= t;
      t <<= sft;
      a[0] ^= t;
      t = ((a[1] >> sft) ^ a[1]) & mMask[i];
      a[1] ^= t;
      t <<= sft;
      a[1] ^= t;
    }
  }


  /*
   * Apply the Bene&scaron; network *B acting on the positions of the packed antichain list a[0],a[1], with width bits of
   * a[1] used.  The masks for blocked Bene&scaron; networks indicate the higher bit of each pair.
   */
  void applyBlockedP2(final long[] a, final long width) {
    for (int i = 0; i < mDepth; ++i) {
      final long sft = mShift[i];
      final long xsft = width - sft;
      long t0 = (((a[0] << sft) | (a[1] >> xsft)) ^ a[0]) & mMask[i];
      long t1 = ((a[1] << sft) ^ a[1]) & mMask1[i];
      a[0] ^= t0;
      a[1] ^= t1;
      final long t0a = t0;
      t0 >>= sft;
      t1 = (t1 >> sft) | (t0a << xsft);
      a[0] ^= t0;
      a[1] ^= t1;
    }
  }

  static Benes[][] sBenesSmall = null;  /* global storage for precomputed Bene&scaron; networks */

  /*
   * Return \lceil \log_2(x) \rceil, where 0 < x < 32, and return 0 for x \eq 0; this is the correct
   * semantics for benes_create.
   */
  static int ceilLd(final long x) {
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
   * Return a newly created Bene&scaron; network (carrying a reference count) realising as many copies of the
   * action of the permutation p on n points as fit into one long.
   * NOTE: src AND invSrc ARE MODIFIED.
   */
  Benes(final int n, final byte[] src, final byte[] invSrc) {
    final int ldN = ceilLd(n);
    int fPos = 0;
    int bPos = 2 * ldN - 1;
    final byte[] tgt = ByteUtils.identity(Permutation.create());
    final byte[] invTgt = ByteUtils.identity(Permutation.create());
    for (int stage = 0, mask = 1; stage < ldN; ++stage, mask <<= 1) {
      final int nmask = ~mask;
      int srcSet = 0;
      int cfgSrc = 0;
      int cfgTgt = 0;
      for (int mainIdx = (int) Utils.bit(ldN); mainIdx-- != 0; ) { /* this ensures that no crossings contain padded bits */
        if ((mainIdx & mask) != 0) { /* loop over pairs... */
          /* ... upper representative */
          int srcIdx = mainIdx;
          while ((Utils.bit(srcIdx) & srcSet) == 0) {
            srcSet |= Utils.bit(srcIdx); /* ...mark that source index as seen... */
            int tgtIdx = srcIdx < n ? invTgt[src[srcIdx]] : srcIdx; /* tgtIdx maps to srcIdx */
            if (((srcIdx ^ tgtIdx) & mask) != 0) {
              /* cross (at the endpoint, to preserve path constructed so far) */
              cfgTgt |= Utils.bit(tgtIdx & nmask); /* set the appropriate bit in the Bene&scaron; network */
              final int idx2 = (byte) (tgtIdx ^ mask); /* the other part of the pair; to be swapped */
              final byte t = tgt[tgtIdx];                /* update the target side... */
              tgt[tgtIdx] = tgt[idx2];        /* ...configuration that the... */
              tgt[idx2] = t;                   /* ...next stage sees; */
              invTgt[tgt[idx2]] = (byte) idx2;       /* the other part of the reordered pair... */
              invTgt[tgt[tgtIdx]] = (byte) tgtIdx; /* ...on the target side is tgtIdx! */
            } else {
              /* straight */
              tgtIdx ^= mask; /* the other part of the pair on the target side */
            }
            srcIdx = tgtIdx < n ? invSrc[tgt[tgtIdx]] : tgtIdx; /* srcIdx maps to tgtIdx */
            if (((srcIdx ^ tgtIdx) & mask) != 0) {
              /* cross (at the endpoint, to preserve path constructed so far) */
              cfgSrc |= Utils.bit(srcIdx & nmask); /* set the appropriate bit in the Bene&scaron; network */
              final int idx2 = srcIdx ^ mask; /* the other part of the pair; to be swapped */
              srcSet |= Utils.bit(idx2);            /* mark that source index as seen... */
              final byte t = src[srcIdx];                /* ...and update the source side */
              src[srcIdx] = src[idx2];        /* ...configuration that the */
              src[idx2] = t;                   /* ...next stage sees; */
              invSrc[src[idx2]] = (byte) idx2;       /* the other part of the reordered pair... */
              invSrc[src[srcIdx]] = (byte) srcIdx; /* ...on the source side is srcIdx! */
            } else {
              /* straight */
              srcSet |= Utils.bit(srcIdx); /* mark that source index as seen */
              srcIdx ^= mask; /* the other part of the pair on the source side */
            }
          }
          /* ... lower representative */
          srcIdx = mainIdx ^ mask;
          while ((Utils.bit(srcIdx) & srcSet) == 0) {
            srcSet |= Utils.bit(srcIdx); /* ...mark that source index as seen... */
            int tgtIdx = srcIdx < n ? invTgt[src[srcIdx]] : srcIdx; /* tgtIdx maps to srcIdx */
            if (((srcIdx ^ tgtIdx) & mask) != 0) {
              /* cross (at the endpoint, to preserve path constructed so far) */
              cfgTgt |= Utils.bit(tgtIdx & nmask); /* set the appropriate bit in the Bene&scaron; network */
              final int idx2 = tgtIdx ^ mask; /* the other part of the pair; to be swapped */
              final byte t = tgt[tgtIdx];                /* update the target side... */
              tgt[tgtIdx] = tgt[idx2];        /* ...configuration that the... */
              tgt[idx2] = t;                   /* ...next stage sees; */
              invTgt[tgt[idx2]] = (byte) idx2;       /* the other part of the reordered pair... */
              invTgt[tgt[tgtIdx]] = (byte) tgtIdx; /* ...on the target side is tgtIdx! */
            } else {
              /* straight */
              tgtIdx ^= mask; /* the other part of the pair on the target side */
            }
            srcIdx = tgtIdx < n ? invSrc[tgt[tgtIdx]] : tgtIdx; /* srcIdx maps to tgtIdx */
            if (((srcIdx ^ tgtIdx) & mask) != 0) {
              /* cross (at the endpoint, to preserve path constructed so far) */
              cfgSrc |= Utils.bit(srcIdx & nmask); /* set the appropriate bit in the Bene&scaron; network */
              final int idx2 = srcIdx ^ mask; /* the other part of the pair; to be swapped */
              srcSet |= Utils.bit(idx2);            /* mark that source index as seen... */
              final byte t = src[srcIdx];                /* ...and update the source side */
              src[srcIdx] = src[idx2];        /* ...configuration that the */
              src[idx2] = t;                   /* ...next stage sees; */
              invSrc[src[idx2]] = (byte) idx2;       /* the other part of the reordered pair... */
              invSrc[src[srcIdx]] = (byte) srcIdx; /* ...on the source side is srcIdx! */
            } else {
              /* straight */
              srcSet |= Utils.bit(srcIdx); /* mark that source index as seen */
              srcIdx ^= mask; /* the other part of the pair on the source side */
            }
          }
        }
      }
      /* record the configurations for the current stage */
      if (cfgSrc != 0) {
        long smask;
        mShift[fPos] = (byte) Utils.bit(stage);
        smask = 0;
        int t = n;
        for (int i = BITSPERLONG / n; i-- != 0; ) {
          smask |= cfgSrc;
          cfgSrc = (cfgSrc | (cfgSrc << t)) << t;
          t <<= 1;
        }
        mMask[fPos] = smask;
        fPos++;
      }
      if (cfgTgt != 0) {
        long smask;
        --bPos;
        mShift[bPos] = (byte) Utils.bit(stage);
        smask = 0;
        int t = n;
        for (int i = BITSPERLONG / n; i-- != 0; ) {
          smask |= cfgTgt;
          cfgTgt = (cfgTgt | (cfgTgt << t)) << t;
          t <<= 1;
        }
        mMask[bPos] = smask;
      }
    }
    /* make sure non-trivial stages are consecutive */
    if (bPos > fPos) {
      for (; bPos < 2 * ldN - 1; ++fPos, ++bPos) {
        mShift[fPos] = mShift[bPos];
        mMask[fPos] = mMask[bPos];
      }
      mDepth = (byte) fPos;
    } else {
      mDepth = (byte) (2 * ldN - 1);
    }
  }


  /*
   * Return n!.
   */
  private static int factorial(final int n) {
    return n <= 1 ? 1 : n * factorial(n - 1);
  }


  /**
   * Precompute Bene&scaron; networks for all permutations on at most BENES_SMALL points.
   */
  public static void initSmall() {
    sBenesSmall = new Benes[BENES_SMALL + 1][];
    final int[] n = new int[1];
    for (n[0] = 0; n[0] <= BENES_SMALL; ++n[0]) {
      sBenesSmall[n[0]] = new Benes[factorial(n[0])];
      final byte[] p = ByteUtils.identity(Permutation.create());
      do {
        final byte[] pa = Arrays.copyOf(p, p.length);
        final byte[] pia = Permutation.inverse(n[0], p);
        final Benes b = new Benes(n[0], pa, pia);
        sBenesSmall[n[0]][(int) Permutation.toInteger(n[0], p)] = b;
      } while (Permutation.next(1, n, p));  /* a single level: 0..n-1 */
    }
  }
}
