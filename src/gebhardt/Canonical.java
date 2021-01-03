package gebhardt;

import gebhardt.Globals.SiData;

final class Canonical {

  // Original header:

  /*
   * canonical.c
   *
   * Created on: 1 Jun 2014
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

  private Canonical() {
  }

  private static final class DualLong implements Comparable<DualLong> {

    final long[] mL;

    private DualLong(final long[] l) {
      mL = l;
    }

    @Override
    public int compareTo(final DualLong o) {
      return cmpP2(mL, o.mL);
    }
  }

  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));

  /*
   * Whether the antichain data given by antichain may yield a canonical antichain list.  Wrapper which dispatches
   * the work to isCanonicalP1 or isCanonicalP2.
   *
   * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
   * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
   * on any level precludes any completion of the antichain data on higher levels being canonical.
   *
   * The function checks whether the multiset of sets chosen on the current level (antichain.O[...] & antichain.cmc) is
   * minimal under the action of the current stabiliser (antichain.ST[antichain.cl+1]).  If yes, and if the antichain
   * data is not complete (that is, antichain.cl > 0]), then the new stabiliser is stored in antichain.ST[antichain.cl].  If
   * the antichain data is complete and canonical, antichain.ST[0] will instead be set to the stabiliser of the
   * new lattice obtained from the antichain data.  (The points on the lowest (new) level of the new lattice
   * correspond to the antichains in that sequence; if a permutation fixes the multiset but permutes its
   * elements, the points of the lowest level of the new lattice need to be permuted accordingly to obtain
   * an element of the stabiliser of the new lattice.  Additional generators of the stabiliser of the new
   * lattice are given by all possible permutations of identical antichains, i.e., all possible permutations
   * of points of the lowest level of the new lattice that have identical covering sets.)
   */
  static boolean isCanonical(final Antichain antichain) {
    final int bits = antichain.mLattice.mLev[antichain.mCl + 1] - antichain.mLattice.mLev[antichain.mCl];
    if (antichain.mK * bits <= Long.SIZE) {
      return isCanonicalP1(antichain, bits);
    } else {
      return isCanonicalP2(antichain, bits);
    }
  }

  /*
   * Compare in lexicographical order the packed antichain lists a and b.
   *
   * Note that the function knows nothing about the levellised ordering!  The idea is to use this
   * function on a list of antichains that only live on one level, and/or iteratively, starting at
   * the maximal level, with appropriate masking.
   *
   * Return value: <0 if a < b
   *               0  if a = b
   *               >0 if a > b
   */
  static int cmpP2(final long[] a, final long[] b) {
    final int c = Long.compare(a[0], b[0]);
    return c != 0 ? c : Long.compare(a[1], b[1]);
  }

// static void antichain_apply_perm(int lo, int hi, permutation p, long A, long[] R)
// /*
//  * TEST FUNCTION: Store the result of applying the permutation p to the antichain A, containing the elements
//  * lo..(hi-1) only, in *R.
//  */
// {
//   int  i;

//   for (*R=0UL, i=lo; i<hi; i++)
//     if (A & Utils.bit(i))
//       *R |= Utils.bit(p[i]);
// }


// static void antichainList_apply_perm_p1(int n, int lo, int hi, permutation p, int k,  long L, long[] R)
// /*
//  * TEST FUNCTION: Store the result of applying the permutation p to the packed antichain list L containing
//  * k antichains, involving only the elements lo..(hi-1), in the packed antichain list *R.  The action on
//  * points points 0..n-1 corresponds to a permutation of the elements of the antichains; the action on points
//  * n..n+k-1 corresponds to a permutation of the antichains.
//  */
// {
//   int  i, j, bits;

//   bits = hi-lo;
//   *R = 0UL;
//   for (i=0; i<k; i++)
//     for (j=0; j<bits; j++)
//       if (L & (Utils.bit(j) << (bits*(k-1-i))))
//         *R |= Utils.bit(p[lo+j]-lo) << (bits*(k-1-(p[n+i]-n)));
// }


// static void antichainList_apply_perm_p2(int n, int lo, int hi, permutation p, int k,  long L[2], long R[2])
// /*
//  * TEST FUNCTION: Store the result of applying the permutation p to the packed antichain list L containing
//  * k antichains, involving only the elements lo..(hi-1), in the packed antichain list *R.  The action on
//  * points points 0..n-1 corresponds to a permutation of the elements of the antichains; the action on points
//  * n..n+k-1 corresponds to a permutation of the antichains.
//  */
// {
//   int  i, j, bits, apf, fi, oi, fpi, opi;

//   bits = hi-lo;
//   apf = Utils.bitSPERLONG/bits;
//   R[0] = R[1] = 0UL;
//   for (i=0; i<k; i++) {
//     fi = 1 - (k-1-i)/apf;
//     oi = (k-1-i) % apf;
//     fpi = 1 - (k-1-(p[n+i]-n))/apf;
//     opi = (k-1-(p[n+i]-n)) % apf;
//     for (j=0; j<bits; j++)
//       if (L[fi] & (Utils.bit(j) << (bits*oi)))
//         R[fpi] |= Utils.bit(p[lo+j]-lo) << (bits*opi);
//   }
// }

  /*
   * Sort the packed antichain list *l containing k antichains of size m in ascending order, subject to the
   * permitted swaps of adjacent antichains indicated by bl.  The permutation sorting l is also applied to
   * p[offset]..p[offset+k-1].  The array mask should contain ((1<<m)-1)<<((k-1)*m),..,((1<<m)-1).
   */
  static long sortP1(final int m, final long[] mask, final int bl, long l, final byte[] p, final int offset) {
    if (bl == 0) {
      return l;
    }
    final int lo = Integer.numberOfTrailingZeros(bl);
    int n = 32 - Integer.numberOfLeadingZeros(bl);
    do {
      int newn = 0;
      for (int i = lo; i < n; ++i) {
        long t1;
        final long t2;
        if ((bl & Utils.bit(i)) != 0 && (t1 = (l & mask[i - 1]) >>> m) > (t2 = l & mask[i])) {
          t1 ^= t2;
          l ^= (t1 << m) | t1;
          final byte tp = p[offset + i - 1];
          p[offset + i - 1] = p[offset + i];
          p[offset + i] = tp;
          newn = i;
        }
      }
      n = newn;
    } while (n != 0);
    return l;
  }

  /*
   * Sort the packed antichain list l containing k antichains of size m in ascending order, with l[0] containing
   * k0 antichains and l[1] containing k-k0 antichains, subject to the permitted swaps of adjacent antichains
   * indicated by bl.  The permutation sorting l is also applied to p[offset]..p[offset+k-1].  The arrays M0 and m1
   * should contain ((1<<m)-1)<<((k0-1)*m),..,((1<<m)-1) and ((1<<m)-1)<<((k-k0-1)*m),..,((1<<m)-1) respectively.
   */
  static void sortP2(final int k, final int m, final int k0, final int offsetM, final long[] m1, final int bl, final long[] l, final byte[] p, final int offset) {
    if (bl == 0) {
      return;
    }
    final int lo = Integer.numberOfTrailingZeros(bl);
    int n = 32 - Integer.numberOfLeadingZeros(bl);
    long t1, t2;
    do {
      int newn = 0;
      if (lo < k0) {
        final int n0 = Math.min(k0, n);
        for (int i = lo; i < n0; ++i) {
          if ((bl & Utils.bit(i)) != 0 && (t1 = (l[0] & m1[offsetM + i - 1]) >>> m) > (t2 = l[0] & m1[offsetM + i])) {
            t1 ^= t2;
            l[0] ^= (t1 << m) | t1;
            final byte tp = p[offset + i - 1];
            p[offset + i - 1] = p[offset + i];
            p[offset + i] = tp;
            newn = i;
          }
        }
      }
      if (lo <= k0 && k0 < n) {
        final int shift = (k - k0 - 1) * m;
        if ((bl & Utils.bit(k0)) != 0 && (t1 = (l[0] & m1[offsetM + k0 - 1]) << shift) > (t2 = l[1] & m1[0])) {
          t1 ^= t2;
          l[0] ^= t1 >>> shift;
          l[1] ^= t1;
          final byte tp = p[offset + k0 - 1];
          p[offset + k0 - 1] = p[offset + k0];
          p[offset + k0] = tp;
          newn = k0;
        }
      }
      if (k0 + 1 < n) {
        for (int i = lo > k0 ? lo : k0 + 1; i < n; ++i) {
          if ((bl & Utils.bit(i)) != 0 && (t1 = (l[1] & m1[i - k0 - 1]) >>> m) > (t2 = l[1] & m1[i - k0])) {
            t1 ^= t2;
            l[1] ^= (t1 << m) | t1;
            final byte tp = p[offset + i - 1];
            p[offset + i - 1] = p[offset + i];
            p[offset + i] = tp;
            newn = i;
          }
        }
      }
      n = newn;
    } while (n != 0);
  }

  /*
   * Minimise the packed antichain list l containing one antichain on the elements a0..(a0+m-1) under the
   * action of the implicit automorphisms given by si.  The inverse of the permutation minimising l is
   * left-multiplied to p, the rationale being to keep track of the permutation mapping l to some original
   * element.  If sic != 0, the implicit stabiliser of the minimised antichain l is returned in sic.
   */
  static long applySI1(final int a0, final int m, final long l, int si, final int[] sic, final byte[] p) {
    final int[] hi = new int[1];
    final int[] lo = new int[1];

    final long mask = Utils.bit(m) - 1;
    if (sic != null) {
      sic[0] = (int) (si & ~(mask << a0));
    }
    si = (int) ((si >>> a0) & mask);
    final int[] b = {si ^ (si >>> 1)};
    long a = l & ~(si | b[0]);  /* the elements in blocks of size 1 */
    while (Utils.extractMSB32(b, hi)) {
      Utils.extractMSB32(b, lo);
      final int pmask = (int) (Utils.bit(hi[0] + 1) - Utils.bit(lo[0]));
      int sb = (int) (l & pmask);
      int ub = (int) (~l & pmask);
      while (Utils.getMSB32(sb, hi) && Utils.getLSB32(ub, lo) && hi[0] > lo[0]) {
        sb ^= Utils.bit(hi[0]) | Utils.bit(lo[0]);
        ub ^= Utils.bit(hi[0]) | Utils.bit(lo[0]);
        final byte t = p[a0 + hi[0]];  /* left-multiplication of p by the transposition (lo hi) */
        p[a0 + hi[0]] = p[a0 + lo[0]];
        p[a0 + lo[0]] = t;
      }
      a |= sb;
      if (sb != 0 && ub != 0) {
        si ^= Utils.bit(lo[0]);
      }
    }
    if (sic != null) {
      sic[0] |= si << a0;
    }
    return a;
  }

  /*
   * Minimise the packed antichain list l containing k antichains on the elements a0..(a0+m-1) under the
   * action of the implicit automorphisms given by si.  The inverse of the permutation minimising l is
   * left-multiplied to p, the rationale being to keep track of the permutation mapping l to some original
   * element.
   */
  static long listApplySIP1(final int n, final int k, final int a0, final int m, final int bl, final Globals globals, final long l, final int si, final long bigM, final byte[] p) {
    assert globals.mSi0 != null;
    assert globals.mSi0[0] != null;
    final int mask = (int) (Utils.bit(m) - 1);
    globals.mSi0[0].mRep[0] = l;
    globals.mSi0[0].mS = (si >>> a0) & mask;
    Permutation.copy(n + k, p, globals.mSi0[0].mP);
    int si0Size = 1;
    int dr;
    int dj;
    for (int r = k - 1; r >= 0; r -= dr) { /* r: position to be filled */
      int si1Size = 0;
      int aMin = mask;
      dr = 1;
      for (int i = 0; i < si0Size; ++i) { /* loop over candidates */
        boolean next = false;
        for (int j = r; !next; j -= dj) { /* j: position of the antichain under consideration */
          final int[] hi = new int[1];
          final int[] lo = new int[1];
          final byte[] q = Permutation.create();
          if (si1Size == globals.mSiSpace) {
            globals.enlargenSiSpace();
          }
          Permutation.copy(n + k, globals.mSi0[i].mP, q);
          int s = globals.mSi0[i].mS;
          long bigP = globals.mSi0[i].mRep[0];
          final int a = (int) ((bigP >>> (j * m)) & mask);  /* j: antichain under consideration */
          final int[] b = {(s >>> 1) ^ s};
          int ac = a & ~(s | b[0]);  /* the elements in blocks of size 1 */
          while (a != ac && Utils.extractMSB32(b, hi)) {  /* get an orbit lo..hi ... */
            Utils.extractMSB32(b, lo);
            final int pmask = (int) (Utils.bit(hi[0] + 1) - Utils.bit(lo[0]));
            int sb = a & pmask;
            int ub = ~a & pmask;
            while (Utils.getMSB32(sb, hi) && Utils.getLSB32(ub, lo) && hi[0] > lo[0]) { /* ... if highest set > lowest unset: swap them */
              sb ^= Utils.bit(hi[0]) | Utils.bit(lo[0]);
              ub ^= Utils.bit(hi[0]) | Utils.bit(lo[0]);
              final long bigT = ((bigP >>> hi[0]) ^ (bigP >>> lo[0])) & bigM;
              bigP ^= (bigT << hi[0]) | (bigT << lo[0]);
              final byte t = q[a0 + hi[0]];  /* left-multiplication by (lo hi) */
              q[a0 + hi[0]] = q[a0 + lo[0]];
              q[a0 + lo[0]] = t;
            }
            ac |= sb;
            if (sb != 0 && ub != 0) {
              s ^= Utils.bit(lo[0]);
            }
            if (ac > aMin) {
              break;
            }
          }
          dj = 0;
          do {
            if (dj >= j || (bl & Utils.bit(k - j + dj)) == 0) {
              next = true;
            }
            ++dj;
          } while (!next && ((bigP >>> (j - dj) * m) & mask) == ac);
          if (ac > aMin || (ac == aMin && dj < dr)) {
            continue;  /* not minimal */
          }
          if (ac < aMin || (ac == aMin && dj > dr)) {  /* new minimum! */
            aMin = ac;
            dr = dj;
            si1Size = 0;
          }
          Permutation.copy(n + k, q, globals.mSi1[si1Size].mP);
          if (j < r) {  /* insert antichains (j-dr+1)..j at positions (r-dr+1)..r */
            final long drm = dr * (long) m;
            final long mask1 = (Utils.bit((r - j) * (long) m) - 1) << ((j + 1) * m);
            final long mask2 = (Utils.bit(drm) - 1) << ((j - dr + 1) * m);
            bigP = (bigP & ~(mask1 | mask2)) | ((bigP & mask1) >>> drm) | ((bigP & mask2) << ((r - j) * m));
            /* left-multiply q=globals.mSi1[si1Size].p by the inverse of the applied permutation */
            final int o = n + k - 1 - j;
            final byte[] pqq = globals.mSi1[si1Size].mP;
            final int opqq = n + k - 1 - r;
            System.arraycopy(q, o, pqq, opqq, dr);
            System.arraycopy(q, o - r + j, pqq, opqq + dr, r - j);
          }
          globals.mSi1[si1Size].mS = s;
          globals.mSi1[si1Size].mRep[0] = bigP;
          ++si1Size;
        }
      }
      si0Size = si1Size;
      final SiData[] sit = globals.mSi0;
      globals.mSi0 = globals.mSi1;
      globals.mSi1 = sit;
    }
    Permutation.copy(n + k, globals.mSi0[0].mP, p);
    globals.mSi0Size = si0Size;
    return globals.mSi0[0].mRep[0];
  }

  /* access macro for the antichain in *position* i */
  private static int antichain(final long[] l, final int i, final int m, final int k1, final int mask) {
    return (int) ((i >= k1 ? (l[0] >>> ((i - k1) * m)) : (l[1] >>> (i * m))) & mask);
  }

  /*
   * Minimise the packed antichain list l containing k antichains on the elements a0..(a0+m-1), with l[0]
   * containing k-k1 antichains and l[1] containing k1 antichains,  under the action of the implicit
   * automorphisms given by si.  The inverse of the permutation minimising l is left-multiplied to p, the
   * rationale being to keep track of the permutation mapping l to some original element.
   */
  static void applySIp2(final int n, final int k, final int k1, final int a0, final int m, final int bl, final Globals globals, final long[] l, final int si, final long bigM, final byte[] p) {
    int si0Size, si1Size;
    long bigT;
    int a, aTemp, aMin, s;
    boolean next;

    final int mask = (int) (Utils.bit(m) - 1);
    globals.mSi0[0].mRep[0] = l[0];
    globals.mSi0[0].mRep[1] = l[1];
    globals.mSi0[0].mS = (si >>> a0) & mask;
    Permutation.copy(n + k, p, globals.mSi0[0].mP);
    si0Size = 1;
    for (int dr, dj, r = k - 1; r >= 0; r -= dr) { /* r: position to be filled */
      si1Size = 0;
      aMin = mask;
      dr = 1;
      for (int i = 0; i < si0Size; ++i) { /* loop over candidates */
        next = false;
        for (int j = r; !next; j -= dj) { /* j: position of the antichain under consideration */
          final int[] hi = new int[1];
          final int[] lo = new int[1];
          final byte[] q = Permutation.create();
          if (si1Size == globals.mSiSpace) {
            globals.enlargenSiSpace();
          }
          Permutation.copy(n + k, globals.mSi0[i].mP, q);
          s = globals.mSi0[i].mS;
          final long[] bigP = {globals.mSi0[i].mRep[0], globals.mSi0[i].mRep[1]};
          a = antichain(bigP, j, m, k1, mask);   /* j: antichain under consideration */
          final int[] b = {(s >>> 1) ^ s};
          aTemp = a & ~(s | b[0]);  /* the elements in blocks of size 1 */
          while (a != aTemp && Utils.extractMSB32(b, hi)) {  /* get an orbit lo..hi ... */
            Utils.extractMSB32(b, lo);
            final int pmask = (int) (Utils.bit(hi[0] + 1) - Utils.bit(lo[0]));
            int sb = a & pmask;
            int ub = ~a & pmask;
            while (Utils.getMSB32(sb, hi) && Utils.getLSB32(ub, lo) && hi[0] > lo[0]) { /* ... if highest set > lowest unset: swap them */
              sb ^= Utils.bit(hi[0]) | Utils.bit(lo[0]);
              ub ^= Utils.bit(hi[0]) | Utils.bit(lo[0]);
              bigT = ((bigP[0] >>> hi[0]) ^ (bigP[0] >>> lo[0])) & bigM;
              bigP[0] ^= (bigT << hi[0]) | (bigT << lo[0]);
              bigT = ((bigP[1] >>> hi[0]) ^ (bigP[1] >>> lo[0])) & bigM;
              bigP[1] ^= (bigT << hi[0]) | (bigT << lo[0]);
              final int t = q[a0 + hi[0]];  /* left-multiplication by (lo hi) */
              q[a0 + hi[0]] = q[a0 + lo[0]];
              q[a0 + lo[0]] = (byte) t;
            }
            aTemp |= sb;
            if (sb != 0 && ub != 0) {
              s ^= Utils.bit(lo[0]);
            }
            if (aTemp > aMin) {
              break;
            }
          }
          dj = 0;
          do {
            if (dj >= j || (bl & Utils.bit(k - j + dj)) == 0) {
              next = true;
            }
            ++dj;
          } while (!next && antichain(bigP, j - dj, m, k1, mask) == aTemp);
          if (aTemp > aMin || (aTemp == aMin && dj < dr)) {
            continue;  /* not minimal */
          }
          if (aTemp < aMin || (aTemp == aMin && dj > dr)) {  /* new minimum! */
            aMin = aTemp;
            dr = dj;
            si1Size = 0;
          }
          Permutation.copy(n + k, q, globals.mSi1[si1Size].mP);
          if (j < r) {  /* move antichains j..(j-dr+1) to positions r..(r-dr+1), shifting r..j+1 to the right
           *  - move j..(j-dr+1) by r-j positions to the left
           *  - move r..(j+1) by dr positions to the right
           */
            final byte[] pqq;
            if (j < k1) {
              if (r < k1) {
                final long ml11 = (Utils.bit(dr * m) - 1) << ((j - dr + 1) * m);
                final long mr11 = (Utils.bit((r - j) * m) - 1) << ((j + 1) * m);
                bigP[1] = (bigP[1] & ~(ml11 | mr11)) | ((bigP[1] & ml11) << ((r - j) * m)) | ((bigP[1] & mr11) >>> (dr * m));
              } else {
                final long mr00, mr01, ml10, ml11;
                if (r - dr >= k1) {
                  mr00 = (Utils.bit((r - k1 - dr + 1) * m) - 1) << (dr * m);
                  mr01 = Utils.bit(dr * m) - 1;
                } else {
                  mr00 = 0L;
                  mr01 = Utils.bit((r - k1 + 1) * m) - 1;
                }
                final long mr11 = (Utils.bit((k1 - j - 1) * m) - 1) << (j + 1) * m;
                if (r - k1 + 1 >= dr) {
                  ml10 = (Utils.bit(dr * m) - 1) << (j - dr + 1) * m;
                  ml11 = 0L;
                } else {
                  ml10 = (Utils.bit((r - k1 + 1) * m) - 1) << (j - r + k1) * m;
                  ml11 = (Utils.bit((dr - (r - k1 + 1)) * m) - 1) << (j - dr + 1) * m;
                }
                bigT = (bigP[0] & ~(mr00 | mr01))
                  | ((bigP[0] & mr00) >>> (dr * m))
                  | (r - j - k1 > 0 ? ((bigP[1] & ml10) << ((r - j - k1) * m)) : ((bigP[1] & ml10) >>> (-(r - j - k1) * m)));
                bigP[1] = (bigP[1] & ~(mr11 | ml10 | ml11))
                  | ((bigP[1] & mr11) >>> (dr * m))
                  | ((bigP[1] & ml11) << ((r - j) * m))
                  | (dr - k1 > 0 ? ((bigP[0] & mr01) >>> ((dr - k1) * m)) : ((bigP[0] & mr01) << (-(dr - k1) * m)));
                bigP[0] = bigT;
              }
            } else {
              if (j - dr + 1 < k1) {
                final long mr00 = (Utils.bit((r + 1 - k1 - dr) * m) - 1) << (dr * m);
                final long mr01 = (Utils.bit((k1 + dr - j - 1) * m) - 1) << ((j + 1 - k1) * m);
                final long ml00 = Utils.bit((j - k1 + 1) * m) - 1;
                final long ml10, ml11;
                if (r - dr + 1 - k1 >= 0) {
                  ml10 = (Utils.bit((k1 - 1 - j + dr) * m) - 1) << ((j - dr + 1) * m);
                  ml11 = 0L;
                } else {
                  ml10 = (Utils.bit((r - j) * m) - 1) << (k1 - r + j) * m;
                  ml11 = ((Utils.bit(k1 - r + dr - 1) * m) - 1) << ((j - dr + 1) * m);
                }
                bigT = (bigP[0] & ~(mr00 | mr01 | ml00))
                  | ((bigP[0] & mr00) >>> (dr * m))
                  | ((bigP[0] & ml00) << ((r - j) * m))
                  | (r - j - k1 > 0 ? ((bigP[1] & ml10) << ((r - j - k1) * m)) : ((bigP[1] & ml10) >>> (-(r - j - k1) * m)));
                bigP[1] = (bigP[1] & ~(ml10 | ml11))
                  | ((bigP[1] & ml11) << ((r - j) * m))
                  | (dr - k1 > 0 ? ((bigP[0] & mr01) >>> ((dr - k1) * m)) : ((bigP[0] & mr01) << (-(dr - k1) * m)));
                bigP[0] = bigT;
              } else {
                final long ml00 = (Utils.bit(dr * m) - 1) << ((j - dr + 1 - k1) * m);
                final long mr00 = (Utils.bit((r - j) * m) - 1) << ((j + 1 - k1) * m);
                bigP[0] = (bigP[0] & ~(ml00 | mr00)) | ((bigP[0] & ml00) << ((r - j) * m)) | ((bigP[0] & mr00) >>> (dr * m));
              }
            }
            /* left-multiply q=globals.mSi1[si1Size].p by the inverse of the applied permutation */
            int pqo = n + k - 1 - j;
            pqq = globals.mSi1[si1Size].mP;
            int pqqo = n + k - 1 - r;
            for (int t = dr; t-- != 0; ) {
              pqq[pqqo + t] = q[pqo + t];
            }
            pqo -= r - j;  /* pq = q + n+k-1-r; */
            pqqo += dr;   /* pqq = globals.mSi1[si1Size].p + n+k-1-r+dr; */
            for (int t = r - j; t-- != 0; ) {
              pqq[pqqo + t] = q[pqo + t];
            }
          }
          globals.mSi1[si1Size].mS = s;
          globals.mSi1[si1Size].mRep[0] = bigP[0];
          globals.mSi1[si1Size].mRep[1] = bigP[1];
          si1Size++;
        }
      }
      si0Size = si1Size;
      final SiData[] sIt = globals.mSi0;
      globals.mSi0 = globals.mSi1;
      globals.mSi1 = sIt;
    }
    l[0] = globals.mSi0[0].mRep[0];
    l[1] = globals.mSi0[0].mRep[1];
    Permutation.copy(n + k, globals.mSi0[0].mP, p);
    globals.mSi0Size = si0Size;
  }

  /*
   * After a call to antichainList_applySI_p1 that showed that its argument L is minimal under the action of the implicit
   * stabiliser:  Add to s any generator of the stabiliser of L that arises from different ways of reaching the minimal
   * element, and set *si to the implicit stabiliser of L.
   */
  static int extractStabiliserP1(final int n, final int k, final int lo, final int hi, final Globals globals, final PermGrpC s, int si) {
    final byte[] p = Permutation.create();
    si &= ~(Utils.bit(hi) - Utils.bit(lo));
    si |= globals.mSi0[0].mS << lo;
    for (int i = 1; i < globals.mSi0Size; ++i) {
      Permutation.leftDivide(n + k, globals.mSi0[0].mP, globals.mSi0[i].mP, p);
      if (!Permutation.isIdentity(n + k, p)) {
        if (VERBOSE) {
          System.out.print("[antichainList_extractStabiliser_p1]: adding stabiliser generator ");
          Permutation.print(s.mG.mN, p, 0);
        }
        s.addGenerator(p);
      }
    }
    return si;
  }

  /*
   * After a call to antichainList_applySI_p2 that showed that its argument L is minimal under the action of the implicit
   * stabiliser:  Add to s any generator of the stabiliser of L that arises from different ways of reaching the minimal
   * element, and set *si to the implicit stabiliser of L.  (L is only used in testing mode.)
   */
  static void extractStabiliserP2(final int n, final int k, final int lo, final int hi, final Globals globals, final PermGrpC s, final int[] si) {
    final byte[] p = Permutation.create();
    si[0] &= ~(Utils.bit(hi) - Utils.bit(lo));
    si[0] |= globals.mSi0[0].mS << lo;
    for (int i = 1; i < globals.mSi0Size; i++) {
      Permutation.leftDivide(n + k, globals.mSi0[0].mP, globals.mSi0[i].mP, p);
      if (!Permutation.isIdentity(n + k, p)) {
        if (VERBOSE) {
          System.out.print("[antichainList_extractStabiliser_p1]: adding stabiliser generator ");
          Permutation.print(s.mG.mN, p, 0);
        }
        s.addGenerator(p);
      }
    }
  }

  /*
   * Generate Bene&scaron; networks for the action of the generators on the next level (antichain.cl-1)
   * of the current lattice or, if antichain.cl==0, the lowest non-trivial level of the new lattice.
   */
  static void preprocessGenerators(final Antichain antichain) {
    final Lattice l = antichain.mLattice;
    final PermGrp g = antichain.mStabilisers[antichain.mCl].mSt;
    if (antichain.mCl != 0) {
      for (int i = 0; i < g.mNgens; ++i) {
        g.mBenes[antichain.mCl - 1][i] = Benes.get(g.mPerm[i], g.mInvPerm[i], l.mLev[antichain.mCl - 1], l.mLev[antichain.mCl]);
      }
      g.mBenesValid |= Utils.bit(antichain.mCl - 1);
    } else {
      for (int i = 0; i < g.mNgens; ++i) {
        g.mBenes[l.mNLev - 1][i] = Benes.get(g.mPerm[i], g.mInvPerm[i], l.mLev[l.mNLev - 1], l.mLev[l.mNLev]);
      }
      g.mBenesValid |= Utils.bit(l.mNLev - 1);
    }
  }

  /*
   * Generate Bene&scaron; networks for the action of the generators on the next level (antichain.cl-1)
   * of the current lattice as well as for the action on antichain.k antichains of the appropriate
   * size or, if antichain.cl==0, the lowest non-trivial level of the new lattice.
   */
  static void preprocessGeneratorsBlocked(final Antichain antichain) {
    final Lattice l = antichain.mLattice;
    final PermGrp g = antichain.mStabilisers[antichain.mCl].mSt;
    if (antichain.mCl != 0) {
      if ((g.mBenesValid & Utils.bit(l.mNLev - 1)) != 0) {
        for (int i = 0; i < g.mNgens; ++i) {
          g.mBenes[antichain.mCl - 1][i] = Benes.get(g.mPerm[i], g.mInvPerm[i], l.mLev[antichain.mCl - 1], l.mLev[antichain.mCl]);
          g.mBenes[l.mNLev - 1][i] = new Benes(g.mPerm[i], g.mInvPerm[i], l.mLev[l.mNLev - 1], l.mLev[l.mNLev], l.mLev[antichain.mCl] - l.mLev[antichain.mCl - 1]);
        }
        g.mBenesValid |= Utils.bit(antichain.mCl - 1);
      } else {
        for (int i = 0; i < g.mNgens; ++i) {
          g.mBenes[antichain.mCl - 1][i] = Benes.get(g.mPerm[i], g.mInvPerm[i], l.mLev[antichain.mCl - 1], l.mLev[antichain.mCl]);
          g.mBenes[l.mNLev - 1][i] = new Benes(g.mPerm[i], g.mInvPerm[i], l.mLev[l.mNLev - 1], l.mLev[l.mNLev], l.mLev[antichain.mCl] - l.mLev[antichain.mCl - 1]);
        }
        g.mBenesValid |= Utils.bit(antichain.mCl - 1) | Utils.bit(l.mNLev - 1);
      }
    } else {
      if ((g.mBenesValid & Utils.bit(l.mNLev - 1)) != 0) {
        for (int i = 0; i < g.mNgens; ++i) {
          g.mBenes[l.mNLev - 1][i] = Benes.get(g.mPerm[i], g.mInvPerm[i], l.mLev[l.mNLev - 1], l.mLev[l.mNLev]);
        }
      } else {
        for (int i = 0; i < g.mNgens; ++i) {
          g.mBenes[l.mNLev - 1][i] = Benes.get(g.mPerm[i], g.mInvPerm[i], l.mLev[l.mNLev - 1], l.mLev[l.mNLev]);
        }
        g.mBenesValid |= Utils.bit(l.mNLev - 1);
      }
    }
  }

  /*
   * Do the housekeeping for a newly computed orbit element.  Special case of a single antichain.
   *
   * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
   * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
   * on any level precludes any completion of the antichain data on higher levels being canonical.
   *
   * The points on the lowest level of the new lattice correspond to the antichains in that sequence; if a
   * permutation fixes the multiset but permutes its elements, the points of the lowest level of the new
   * lattice need to be permuted accordingly to obtain an element of the stabiliser of the new lattice.
   */
  static void processElement1(final Antichain antichain, final PermGrp g, final PermGrpC s, final int pos, final int gen) {
    final byte[] h = Permutation.create();
    final long a = antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mData[0];
    int aPos = antichain.mGlobals.mOrbitSize;
    /* check whether the element is new... */
    final Integer aa = antichain.mGlobals.mOrbitPos.putIfAbsent(a, aPos);
    if (aa != null) {
      if (VERBOSE) {
        System.out.println("--- hashtable query/insert " + Long.toHexString(a) + " => " + aPos);
      }
      aPos = aa;
      /* ...if not, note the new stabiliser element */
      if (pos != 0) {
        if (aPos != 0) {
          Permutation.leftDivideMultiply(s.mG.mN, antichain.mGlobals.mOrbitElements[pos].mToRoot, g.mPerm[gen], antichain.mGlobals.mOrbitElements[aPos].mToRoot, h);
        } else {
          Permutation.leftDivide(s.mG.mN, antichain.mGlobals.mOrbitElements[pos].mToRoot, g.mPerm[gen], h);
        }
      } else {
        if (aPos != 0) { /* equivalent to if (antichain.GD.orbsort[lpos]) */
          Permutation.multiply(s.mG.mN, g.mPerm[gen], antichain.mGlobals.mOrbitElements[aPos].mToRoot, h);
        } else {
          Permutation.copy(s.mG.mN, g.mPerm[gen], h);
        }
      }
      if (VERBOSE) {
        System.out.print("[processElement_1]: adding stabiliser generator ");
        Permutation.print(s.mG.mN, h, 0);
      }
      if (!Permutation.isIdentity(s.mG.mN, h)) {
        s.addGenerator(h);
      }
    } else {
      if (a == 0x1421195298L) {
        new Throwable().printStackTrace();
      }
      if (VERBOSE) {
        System.out.println("+++ hashtable query/insert " + Long.toHexString(a) + " => " + aPos);
      }
      /* ...if yes, note the permutation to the root and the applied generator */
      antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mGen = gen;
      if (pos != 0) {
        Permutation.multiply(s.mG.mN, g.mInvPerm[gen], antichain.mGlobals.mOrbitElements[pos].mToRoot, antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mToRoot);
      } else {
        Permutation.copy(s.mG.mN, g.mInvPerm[gen], antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mToRoot);
      }
      ++antichain.mGlobals.mOrbitSize;
    }
  }

  /*
   * Do the housekeeping for a newly computed orbit element.  Special case of a list of antichains that,
   * if packed, fits into one long.
   *
   * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
   * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
   * on any level precludes any completion of the antichain data on higher levels being canonical.
   *
   * The points on the lowest level of the new lattice correspond to the antichains in that sequence; if a
   * permutation fixes the multiset but permutes its elements, the points of the lowest level of the new
   * lattice need to be permuted accordingly to obtain an element of the stabiliser of the new lattice.
   */
  static void processElementP1(final Antichain antichain, final PermGrp g, final PermGrpC s, final int pos, final int gen, final byte[] p) {
    final byte[] h = Permutation.create();

    final long a = antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mData[0];
    int aPos = antichain.mGlobals.mOrbitSize;
    /* check whether the element is new... */
    final Integer aa = antichain.mGlobals.mOrbitPos.putIfAbsent(a, aPos);
    if (aa != null) {
      if (VERBOSE) {
        System.out.println("--- hashtable query/insert " + Long.toHexString(a) + " => " + aa);
      }
      aPos = aa;
      /* ...if no, note the new stabiliser element */
      if (pos != 0) {
        if (aPos != 0) {
          Permutation.multiplyLeftDivide(s.mG.mN, p, g.mInvPerm[gen], antichain.mGlobals.mOrbitElements[pos].mToRoot, antichain.mGlobals.mOrbitElements[aPos].mToRoot, h);
        } else {
          Permutation.multiplyInverse(s.mG.mN, p, g.mInvPerm[gen], antichain.mGlobals.mOrbitElements[pos].mToRoot, h);
        }
      } else {
        if (aPos != 0) {
          Permutation.multiplyLeftDivide(s.mG.mN, p, g.mInvPerm[gen], antichain.mGlobals.mOrbitElements[aPos].mToRoot, h);
        } else {
          Permutation.multiplyInverse(s.mG.mN, p, g.mInvPerm[gen], h);
        }
      }
      if (VERBOSE) {
        System.out.print("[processElement_p1]: adding stabiliser generator ");
        Permutation.print(s.mG.mN, h, 0);
      }
      if (!Permutation.isIdentity(s.mG.mN, h)) {
        s.addGenerator(h);
      }
    } else {
      if (VERBOSE) {
        System.out.println("+++ hashtable query/insert " + Long.toHexString(a) + " => " + aPos);
      }
      /* ...if yes, note the permutation to the root and the applied generator */
      antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mGen = gen;
      if (pos != 0) {
        Permutation.multiply(s.mG.mN, p, g.mInvPerm[gen], antichain.mGlobals.mOrbitElements[pos].mToRoot, antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mToRoot);
      } else {
        Permutation.multiply(s.mG.mN, p, g.mInvPerm[gen], antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mToRoot);
      }
      ++antichain.mGlobals.mOrbitSize;
    }
  }

  /*
   * Do the housekeeping for a newly computed orbit element.    Special case of a list of antichains that,
   * if packed, fits into (and requires) two long.
   *
   * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
   * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
   * on any level precludes any completion of the antichain data on higher levels being canonical.
   *
   * The points on the lowest level of the new lattice correspond to the antichains in that sequence; if a
   * permutation fixes the multiset but permutes its elements, the points of the lowest level of the new
   * lattice need to be permuted accordingly to obtain an element of the stabiliser of the new lattice.
   */
  static void processElementP2(final Antichain antichain, final PermGrp g, final PermGrpC s, final int pos, final int gen, final byte[] p) {
    final byte[] h = Permutation.create();
    final long[] a = antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mData;
    final int aPos = antichain.mGlobals.mOrbitSize;
    /* check whether the element is new... */
    final Integer aa = antichain.mGlobals.mOrbitPos.putIfAbsent(new DualLong(a), aPos);
    if (aa != null) {
      /* ...if no, note the new stabiliser element */
      if (pos != 0) {
        if (aPos != 0) {
          Permutation.multiplyLeftDivide(s.mG.mN, p, g.mInvPerm[gen], antichain.mGlobals.mOrbitElements[pos].mToRoot, antichain.mGlobals.mOrbitElements[aPos].mToRoot, h);
        } else {
          Permutation.multiplyInverse(s.mG.mN, p, g.mInvPerm[gen], antichain.mGlobals.mOrbitElements[pos].mToRoot, h);
        }
      } else {
        if (aPos != 0) {
          Permutation.multiplyLeftDivide(s.mG.mN, p, g.mInvPerm[gen], antichain.mGlobals.mOrbitElements[aPos].mToRoot, h);
        } else {
          Permutation.multiplyInverse(s.mG.mN, p, g.mInvPerm[gen], h);
        }
      }
      if (VERBOSE) {
        System.out.print("[processElement_p2]: adding stabiliser generator ");
        Permutation.print(s.mG.mN, h, 0);
      }
      if (!Permutation.isIdentity(s.mG.mN, h)) {
        s.addGenerator(h);
      }
    } else {
      /* ...if yes, note the permutation to the root and the applied generator */
      antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mGen = gen;
      if (pos != 0) {
        Permutation.multiply(s.mG.mN, p, g.mInvPerm[gen], antichain.mGlobals.mOrbitElements[pos].mToRoot, antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mToRoot);
      } else {
        Permutation.multiply(s.mG.mN, p, g.mInvPerm[gen], antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mToRoot);
      }
      antichain.mGlobals.mOrbitSize++;
    }
  }


  /*
   * Whether the antichain data given by antichain may yield a canonical antichain list.  Special case of a single
   * antichain.
   *
   * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
   * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
   * on any level precludes any completion of the antichain data on higher levels being canonical.
   *
   * The function checks whether the multiset of sets chosen on the current level (antichain.O[...] & antichain.cmc) is
   * minimal under the action of the current stabiliser (antichain.SD[antichain.cl+1].ST).  If yes, and if the antichain
   * data is not complete (that is, antichain.cl > 0]), then the new stabiliser is stored in antichain.SD[antichain.cl].ST.  If
   * the antichain data is complete and canonical, antichain.SD[0].ST will instead be set to the stabiliser of the
   * new lattice obtained from the antichain data.  (The points on the lowest (new) level of the new lattice
   * correspond to the antichains in that sequence; if a permutation fixes the multiset but permutes its
   * elements, the points of the lowest level of the new lattice need to be permuted accordingly to obtain
   * an element of the stabiliser of the new lattice.  Additional generators of the stabiliser of the new
   * lattice are given by all possible permutations of identical antichains, i.e., all possible permutations
   * of points of the lowest level of the new lattice that have identical covering sets.)
   */
  static boolean isCanonical1(final Antichain antichain) {
    if (VERBOSE) {
      System.out.println("[entering antichaindata_isCanonical_1]: " + antichain.mCl + " " + antichain.mStabilisers[antichain.mCl + 1].mSt.mN);
      antichain.mLattice.print();
      antichain.printCounters();
    }
    final PermGrp g = antichain.mStabilisers[antichain.mCl + 1].mSt;
    assert g.mNgens == 0 || (g.mBenesValid & Utils.bit(antichain.mCl)) != 0 : "Attempts to use invalid Benes networks [antichaindata_isCanonical_1]: level " + antichain.mCl;
    if (g.mNgens > 0) {
      if ((antichain.mGlobals.mOrbitElements[0].mData[0] = (antichain.mO[0] & antichain.mCmc) >>> antichain.mLattice.mLev[antichain.mCl]) != 0) {
        final byte[] p = Permutation.create();
        if (antichain.mStabilisers[antichain.mCl + 1].mSi != 0) {
          /* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
          Permutation.init(antichain.mLattice.mN + antichain.mK, p);
          final int[] ugly = {antichain.mStabilisers[antichain.mCl].mSi};
          final long l = applySI1(antichain.mLattice.mLev[antichain.mCl], antichain.mLattice.mLev[antichain.mCl + 1] - antichain.mLattice.mLev[antichain.mCl], antichain.mGlobals.mOrbitElements[0].mData[0], antichain.mStabilisers[antichain.mCl + 1].mSi, ugly, p);
          antichain.mStabilisers[antichain.mCl].mSi = ugly[0];
          if (l != antichain.mGlobals.mOrbitElements[0].mData[0]) {
            return false;
          }
          final PermGrpC s = antichain.ensureStabiliser(antichain.mCl);
          antichain.mStabilisers[antichain.mCl].mSt = s.mG;
          s.init(antichain.mLattice.mN + antichain.mK);
          /* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
          antichain.mGlobals.mOrbitSize = 1;
          antichain.mGlobals.mOrbitElements[0].mGen = -1;
          antichain.mGlobals.mOrbitPos.clear();
          antichain.mGlobals.mOrbitPos.put(l, 0);
          if (VERBOSE) {
            System.out.println("### hashtable cleared");
            System.out.println("+++ hashtable insert (" + Long.toHexString(l) + ",0)");
          }
          if (s.mG.mN > g.mN) {
            for (int gen = 0; gen < g.mNgens; ++gen) {
              Permutation.resize(g.mN, s.mG.mN, g.mPerm[gen]);
              Permutation.resize(g.mN, s.mG.mN, g.mInvPerm[gen]);
            }
          }
          for (int pos = 0; pos < antichain.mGlobals.mOrbitSize; ++pos) {
            for (int gen = 0; gen < g.mNgens; ++gen) {
              if ((g.mInvol & Utils.bit(gen)) != 0 && antichain.mGlobals.mOrbitElements[pos].mGen == gen) {
                continue;
              }
              /* apply generator gen to orbit element pos... */
              if (antichain.mGlobals.mOrbitSpace == antichain.mGlobals.mOrbitSize) {
                antichain.mGlobals.enlargenOrbitSpace();
              }
              long a = g.mBenes[antichain.mCl][gen].applyP1(antichain.mGlobals.mOrbitElements[pos].mData[0]);
              Permutation.init(antichain.mLattice.mN + antichain.mK, p);
              a = applySI1(antichain.mLattice.mLev[antichain.mCl], antichain.mLattice.mLev[antichain.mCl + 1] - antichain.mLattice.mLev[antichain.mCl], a, antichain.mStabilisers[antichain.mCl + 1].mSi, null, p);
              /* ...we're done if the result is smaller than the original element */
              if (l > a) {
                if (VERBOSE) {
                  System.out.println("                                       NOT canonical");
                }
                return false;
              }
              /* ...otherwise, do the necessary housekeeping */
              antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mData[0] = a;
              processElementP1(antichain, g, s, pos, gen, p);
            }
          }
          s.compactGenerators();
        } else {
          /* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
          final long l = antichain.mGlobals.mOrbitElements[0].mData[0];
          Permutation.init(antichain.mLattice.mN + antichain.mK, p);
          antichain.mStabilisers[antichain.mCl].mSi = 0;
          final PermGrpC s = antichain.ensureStabiliser(antichain.mCl);
          antichain.mStabilisers[antichain.mCl].mSt = s.mG;
          s.init(antichain.mLattice.mN + antichain.mK);
          /* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
          antichain.mGlobals.mOrbitSize = 1;
          antichain.mGlobals.mOrbitElements[0].mGen = -1;
          antichain.mGlobals.mOrbitPos.clear();
          antichain.mGlobals.mOrbitPos.put(l, 0);
          if (VERBOSE) {
            System.out.println("### hashtable cleared");
            System.out.println("+++ hashtable insert (" + Long.toHexString(l) + ",0)");
          }
          if (s.mG.mN > g.mN) {
            for (int gen = 0; gen < g.mNgens; ++gen) {
              Permutation.resize(g.mN, s.mG.mN, g.mPerm[gen]);
              Permutation.resize(g.mN, s.mG.mN, g.mInvPerm[gen]);
            }
          }
          for (int pos = 0; pos < antichain.mGlobals.mOrbitSize; ++pos) {
            for (int gen = 0; gen < g.mNgens; ++gen) {
              if ((g.mInvol & Utils.bit(gen)) != 0 && antichain.mGlobals.mOrbitElements[pos].mGen == gen) {
                continue;
              }
              /* apply generator gen to orbit element pos... */
              if (antichain.mGlobals.mOrbitSpace == antichain.mGlobals.mOrbitSize) {
                antichain.mGlobals.enlargenOrbitSpace();
              }
              final long a = g.mBenes[antichain.mCl][gen].applyP1(antichain.mGlobals.mOrbitElements[pos].mData[0]);
              Permutation.init(antichain.mLattice.mN + antichain.mK, p);
              /* ...we're done if the result is smaller than the original element */
              if (l > a) {
                if (VERBOSE) {
                  System.out.println("                                       NOT canonical");
                }
                return false;
              }
              /* ...otherwise, do the necessary housekeeping */
              antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mData[0] = a;
              if (antichain.mStabilisers[antichain.mCl + 1].mSi != 0) {
                processElementP1(antichain, g, s, pos, gen, p);
              } else {
                processElement1(antichain, g, s, pos, gen);
              }
            }
          }
          s.compactGenerators();
        }
      } else {
        /* as the antichains must intersect the lowest level, antichain.cl < antichain.L.nLev-2, so g.n == S.n */
        antichain.mStabilisers[antichain.mCl].mSt = antichain.mStabilisers[antichain.mCl + 1].mSt;
        antichain.mStabilisers[antichain.mCl].mSi = antichain.mStabilisers[antichain.mCl + 1].mSi;
      }
    } else if (antichain.mStabilisers[antichain.mCl + 1].mSi != 0) {
      if ((antichain.mGlobals.mOrbitElements[0].mData[0] = (antichain.mO[0] & antichain.mCmc) >>> antichain.mLattice.mLev[antichain.mCl]) != 0) {
        /* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
        final byte[] p = Permutation.create();
        Permutation.init(antichain.mLattice.mN + antichain.mK, p);
        final int[] ugly = {antichain.mStabilisers[antichain.mCl].mSi};
        final long l = applySI1(antichain.mLattice.mLev[antichain.mCl], antichain.mLattice.mLev[antichain.mCl + 1] - antichain.mLattice.mLev[antichain.mCl], antichain.mGlobals.mOrbitElements[0].mData[0], antichain.mStabilisers[antichain.mCl + 1].mSi, ugly, p);
        antichain.mStabilisers[antichain.mCl].mSi = ugly[0];
        if (l != antichain.mGlobals.mOrbitElements[0].mData[0]) {
          return false;
        }
        final PermGrpC s = antichain.ensureStabiliser(antichain.mCl);
        antichain.mStabilisers[antichain.mCl].mSt = s.mG;
        s.init(antichain.mLattice.mN + antichain.mK);
      } else { /* as the antichains must intersect the lowest level, antichain.cl < antichain.L.nLev-2, so g.n == S.n */
        antichain.mStabilisers[antichain.mCl].mSt = antichain.mStabilisers[antichain.mCl + 1].mSt;
        antichain.mStabilisers[antichain.mCl].mSi = antichain.mStabilisers[antichain.mCl + 1].mSi;
      }
    } else {
      if (antichain.mCl == antichain.mLattice.mNLev - 2) {
        final PermGrpC s = antichain.ensureStabiliser(antichain.mCl);
        antichain.mStabilisers[antichain.mCl].mSt = s.mG;
        s.init(antichain.mLattice.mN + antichain.mK);
      } else {
        antichain.mStabilisers[antichain.mCl].mSt = antichain.mStabilisers[antichain.mCl + 1].mSt;
      }
      antichain.mStabilisers[antichain.mCl].mSi = antichain.mStabilisers[antichain.mCl + 1].mSi;
    }
    preprocessGenerators(antichain);
    if (VERBOSE) {
      System.out.println("***** level " + antichain.mCl + ":");
      PermGrp.printGenerators(antichain.mStabilisers[antichain.mCl].mSt, 0);
      System.out.println("                                       canonical");
    }
    return true;
  }

  /*
   * Whether the antichain data given by antichain may yield a canonical antichain list.  Special case of a list
   * that, if packed, fits into one long.
   *
   * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
   * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
   * on any level precludes any completion of the antichain data on higher levels being canonical.
   *
   * The function checks whether the multiset of sets chosen on the current level (antichain.O[...] & antichain.cmc) is
   * minimal under the action of the current stabiliser (antichain.SD[antichain.cl+1].ST and antichain.SD[antichain.cl+1].mSi).  If yes,
   * and if the antichain data is not complete (that is, antichain.cl > 0]), then the new stabiliser is stored in
   * antichain.SD[antichain.cl].ST and antichain.SD[antichain.cl].mSi.  If the antichain data is complete and canonical, antichain.SD[0].ST and
   * antichain.SD[0].mSi will instead be set to the stabiliser of the new lattice obtained from the antichain data.
   * (The points on the lowest (new) level of the new lattice correspond to the antichains in that sequence;
   * if a permutation fixes the multiset but permutes its elements, the points of the lowest level of the
   * new lattice need to be permuted accordingly to obtain an element of the stabiliser of the new lattice.
   * Additional generators of the stabiliser of the new lattice are given by all possible permutations of
   * identical antichains, i.e., all possible permutations of points of the lowest level of the new lattice
   * that have identical covering sets.  The latter may be handled by "implicit" stabilisers.)
   */
  static boolean isCanonicalP1(final Antichain antichain, final int bits) {
    if (VERBOSE) {
      System.out.println("[entering antichaindata_isCanonical_p1]:");
      antichain.mLattice.print();
      antichain.printCounters();
    }
    final long[] bigM = new long[Utils.MAXN - 2];
    long mask = Utils.bit(bits) - 1;
    for (int i = antichain.mK; i-- != 0; mask <<= bits) {
      bigM[i] = mask;
    }
    final PermGrp g = antichain.mStabilisers[antichain.mCl + 1].mSt;
    final byte[] p = Permutation.create();
    if (g.mNgens > 0) {
      antichain.mGlobals.mOrbitElements[0].mData[0] = 0;
      for (int i = 0; i < antichain.mK; ++i) {
        antichain.mGlobals.mOrbitElements[0].mData[0] <<= bits;
        antichain.mGlobals.mOrbitElements[0].mData[0] |= (antichain.mO[i] & antichain.mCmc) >>> antichain.mLattice.mLev[antichain.mCl];
      }
      if (antichain.mGlobals.mOrbitElements[0].mData[0] != 0) {
        if (antichain.mStabilisers[antichain.mCl + 1].mSi != 0) {
          /* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
          long l = antichain.mGlobals.mOrbitElements[0].mData[0];
          Permutation.init(antichain.mLattice.mN + antichain.mK, p);
          long pmask = 1;
          for (int i = antichain.mK; i-- != 0; ) {
            pmask = (pmask << bits) | 1;
          }
          l = listApplySIP1(antichain.mLattice.mN, antichain.mK, antichain.mLattice.mLev[antichain.mCl], bits, antichain.mStabilisers[antichain.mCl + 1].mBl, antichain.mGlobals, l, antichain.mStabilisers[antichain.mCl + 1].mSi, pmask, p);
          if (l != antichain.mGlobals.mOrbitElements[0].mData[0]) {
            /* determine the position up to which we can backtrack */
            int m = 0;
            int i = 0;
            final long d = l ^ antichain.mGlobals.mOrbitElements[0].mData[0];
            do {
              final int pi = p[antichain.mLattice.mN + i] - antichain.mLattice.mN;
              if (pi > m) {
                m = pi;
              }
            } while ((d & bigM[i++]) == 0);
            antichain.mFpos += m - antichain.mCp;
            antichain.mCp = m;
            if (VERBOSE) {
              Permutation.print(antichain.mLattice.mN + antichain.mK, p, 0);
              System.out.println("                                       NOT canonical --> " + antichain.mCp);
            }
            return false;
          }
          final PermGrpC s = antichain.ensureStabiliser(antichain.mCl);
          antichain.mStabilisers[antichain.mCl].mSt = s.mG;
          s.init(antichain.mLattice.mN + antichain.mK);
          antichain.mStabilisers[antichain.mCl].mSi = antichain.mStabilisers[antichain.mCl + 1].mSi;
          antichain.mStabilisers[antichain.mCl].mSi = extractStabiliserP1(antichain.mLattice.mN, antichain.mK, antichain.mLattice.mLev[antichain.mCl], antichain.mLattice.mLev[antichain.mCl + 1], antichain.mGlobals, s, antichain.mStabilisers[antichain.mCl].mSi);
          /* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
          antichain.mGlobals.mOrbitSize = 1;
          antichain.mGlobals.mOrbitElements[0].mGen = -1;
          Permutation.init(s.mG.mN, antichain.mGlobals.mOrbitElements[0].mToRoot);
          antichain.mGlobals.mOrbitPos.clear();
          antichain.mGlobals.mOrbitPos.put(l, 0);
          if (VERBOSE) {
            System.out.println("### hashtable cleared");
            System.out.println("+++ hashtable insert (" + Long.toHexString(l) + ",0)");
          }
          if (s.mG.mN > g.mN) {
            for (int gen = 0; gen < g.mNgens; ++gen) {
              Permutation.resize(g.mN, s.mG.mN, g.mPerm[gen]);
              Permutation.resize(g.mN, s.mG.mN, g.mInvPerm[gen]);
            }
          }
          for (int pos = 0; pos < antichain.mGlobals.mOrbitSize; ++pos) {
            for (int gen = 0; gen < g.mNgens; ++gen) {
              if ((g.mInvol & Utils.bit(gen)) != 0 && antichain.mGlobals.mOrbitElements[pos].mGen == gen) {
                continue;
              }
              /* apply generator gen to orbit element pos... */
              if (antichain.mGlobals.mOrbitSpace == antichain.mGlobals.mOrbitSize) {
                antichain.mGlobals.enlargenOrbitSpace();
              }
              long a = g.mBenes[antichain.mCl][gen].applyP1(antichain.mGlobals.mOrbitElements[pos].mData[0]);
              if (antichain.mCl < antichain.mLattice.mNLev - 2) {
                a = g.mBenes[antichain.mLattice.mNLev - 1][gen].applyBlockedP1(a);
              }
              Permutation.init(s.mG.mN, p);
              a = listApplySIP1(antichain.mLattice.mN, antichain.mK, antichain.mLattice.mLev[antichain.mCl], bits, antichain.mStabilisers[antichain.mCl + 1].mBl, antichain.mGlobals, a, antichain.mStabilisers[antichain.mCl + 1].mSi, pmask, p);
              /* ...we're done if the result is smaller than the original element */
              if (l > a) {
                /* determine the position up to which we can backtrack */
                int m = 0;
                int i = 0;
                final long d = l ^ a;
                do {
                  final int pi = antichain.mGlobals.mOrbitElements[pos].mToRoot[g.mInvPerm[gen][p[antichain.mLattice.mN + i]]] - antichain.mLattice.mN;
                  if (pi > m) {
                    m = pi;
                  }
                } while ((d & bigM[i++]) == 0);
                antichain.mFpos += m - antichain.mCp;
                antichain.mCp = m;
                if (VERBOSE) {
                  Permutation.print(s.mG.mN, p, 0);
                  System.out.println("                                       NOT canonical --> " + antichain.mCp);
                }
                return false;
              }
              /* ...otherwise, do the necessary housekeeping */
              antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mData[0] = a;
              processElementP1(antichain, g, s, pos, gen, p);
            }
          }
          s.compactGenerators();
        } else {
          /* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
          final long l = antichain.mGlobals.mOrbitElements[0].mData[0];
          Permutation.init(antichain.mLattice.mN + antichain.mK, p);
          final PermGrpC s = antichain.ensureStabiliser(antichain.mCl);
          antichain.mStabilisers[antichain.mCl].mSt = s.mG;
          s.init(antichain.mLattice.mN + antichain.mK);
          antichain.mStabilisers[antichain.mCl].mSi = 0;
          /* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
          antichain.mGlobals.mOrbitSize = 1;
          antichain.mGlobals.mOrbitElements[0].mGen = -1;
          Permutation.init(s.mG.mN, antichain.mGlobals.mOrbitElements[0].mToRoot);
          antichain.mGlobals.mOrbitPos.clear();
          antichain.mGlobals.mOrbitPos.put(l, 0);
          if (VERBOSE) {
            System.out.println("### hashtable cleared");
            System.out.println("+++ hashtable insert (" + Long.toHexString(l) + ",0)");
          }
          if (s.mG.mN > g.mN) {
            for (int gen = 0; gen < g.mNgens; ++gen) {
              Permutation.resize(g.mN, s.mG.mN, g.mPerm[gen]);
              Permutation.resize(g.mN, s.mG.mN, g.mInvPerm[gen]);
            }
          }
          for (int pos = 0; pos < antichain.mGlobals.mOrbitSize; ++pos) {
            for (int gen = 0; gen < g.mNgens; ++gen) {
              if ((g.mInvol & Utils.bit(gen)) != 0 && antichain.mGlobals.mOrbitElements[pos].mGen == gen) {
                continue;
              }
              /* apply generator gen to orbit element pos... */
              if (antichain.mGlobals.mOrbitSpace == antichain.mGlobals.mOrbitSize) {
                antichain.mGlobals.enlargenOrbitSpace();
              }
              long a = g.mBenes[antichain.mCl][gen].applyP1(antichain.mGlobals.mOrbitElements[pos].mData[0]);
              if (antichain.mCl < antichain.mLattice.mNLev - 2) {
                a = g.mBenes[antichain.mLattice.mNLev - 1][gen].applyBlockedP1(a);
              }
              Permutation.init(s.mG.mN, p);
              a = sortP1(bits, bigM, antichain.mStabilisers[antichain.mCl + 1].mBl, a, p, antichain.mLattice.mN);
              /* ...we're done if the result is smaller than the original element */
              if (l > a) {
                /* determine the position up to which we can backtrack */
                int m = 0;
                int i = 0;
                final long d = l ^ a;
                do {
                  final int pi = antichain.mGlobals.mOrbitElements[pos].mToRoot[g.mInvPerm[gen][p[antichain.mLattice.mN + i]]] - antichain.mLattice.mN;
                  if (pi > m) {
                    m = pi;
                  }
                } while ((d & bigM[i++]) == 0);
                antichain.mFpos += m - antichain.mCp;
                antichain.mCp = m;
                if (VERBOSE) {
                  Permutation.print(s.mG.mN, p, 0);
                  System.out.println("                                       NOT canonical --> " + antichain.mCp);
                }
                return false;
              }
              /* ...otherwise, do the necessary housekeeping */
              antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mData[0] = a;
              processElementP1(antichain, g, s, pos, gen, p);
            }
          }
          s.compactGenerators();
        }
      } else { /* as the antichains must intersect the lowest level, antichain.cl < antichain.L.nLev-2 */
        antichain.mStabilisers[antichain.mCl].mSt = antichain.mStabilisers[antichain.mCl + 1].mSt;
        antichain.mStabilisers[antichain.mCl].mSi = antichain.mStabilisers[antichain.mCl + 1].mSi;
      }
    } else if (antichain.mStabilisers[antichain.mCl + 1].mSi != 0) {
      antichain.mGlobals.mOrbitElements[0].mData[0] = 0;
      for (int i = 0; i < antichain.mK; ++i) {
        antichain.mGlobals.mOrbitElements[0].mData[0] <<= bits;
        antichain.mGlobals.mOrbitElements[0].mData[0] |= (antichain.mO[i] & antichain.mCmc) >>> antichain.mLattice.mLev[antichain.mCl];
      }
      if (antichain.mGlobals.mOrbitElements[0].mData[0] != 0) {
        /* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
        long l = antichain.mGlobals.mOrbitElements[0].mData[0];
        Permutation.init(antichain.mLattice.mN + antichain.mK, p);
        long pmask = 1;
        for (int i = antichain.mK; i-- != 0; ) {
          pmask = (pmask << bits) | 1;
        }
        l = listApplySIP1(antichain.mLattice.mN, antichain.mK, antichain.mLattice.mLev[antichain.mCl], bits, antichain.mStabilisers[antichain.mCl + 1].mBl, antichain.mGlobals, l, antichain.mStabilisers[antichain.mCl + 1].mSi, pmask, p);
        if (l != antichain.mGlobals.mOrbitElements[0].mData[0]) {
          /* determine the position up to which we can backtrack */
          int m = 0;
          int i = 0;
          final long d = l ^ antichain.mGlobals.mOrbitElements[0].mData[0];
          do {
            final int pi = p[antichain.mLattice.mN + i] - antichain.mLattice.mN;
            if (pi > m) {
              m = pi;
            }
          } while ((d & bigM[i++]) == 0);
          antichain.mFpos += m - antichain.mCp;
          antichain.mCp = m;
          if (VERBOSE) {
            Permutation.print(antichain.mLattice.mN + antichain.mK, p, 0);
            System.out.println("                                       NOT canonical --> " + antichain.mCp);
          }
          return false;
        }
        final PermGrpC s = antichain.ensureStabiliser(antichain.mCl);
        antichain.mStabilisers[antichain.mCl].mSt = s.mG;
        s.init(antichain.mLattice.mN + antichain.mK);
        antichain.mStabilisers[antichain.mCl].mSi = antichain.mStabilisers[antichain.mCl + 1].mSi;
        antichain.mStabilisers[antichain.mCl].mSi = extractStabiliserP1(antichain.mLattice.mN, antichain.mK, antichain.mLattice.mLev[antichain.mCl], antichain.mLattice.mLev[antichain.mCl + 1], antichain.mGlobals, s, antichain.mStabilisers[antichain.mCl].mSi);
        s.compactGenerators();
      } else { /* as the antichains must intersect the lowest level, antichain.cl < antichain.L.nLev-2 */
        antichain.mStabilisers[antichain.mCl].mSt = antichain.mStabilisers[antichain.mCl + 1].mSt;
        antichain.mStabilisers[antichain.mCl].mSi = antichain.mStabilisers[antichain.mCl + 1].mSi;
      }
    } else {
      if (antichain.mCl == antichain.mLattice.mNLev - 2) {
        final PermGrpC s = antichain.ensureStabiliser(antichain.mCl);
        antichain.mStabilisers[antichain.mCl].mSt = s.mG;
        s.init(antichain.mLattice.mN + antichain.mK);
      } else {
        antichain.mStabilisers[antichain.mCl].mSt = antichain.mStabilisers[antichain.mCl + 1].mSt;
      }
      antichain.mStabilisers[antichain.mCl].mSi = antichain.mStabilisers[antichain.mCl + 1].mSi;
    }
    if (antichain.mCl == 0) {
      final int[] ugly = {antichain.mStabilisers[0].mBl}; // todo yuck
      antichain.updateBlocks(antichain.mStabilisers[1].mBl, ugly);
      antichain.mStabilisers[0].mBl = ugly[0];
      antichain.mStabilisers[0].mSi |= antichain.mStabilisers[0].mBl << antichain.mLattice.mN;
    }
    preprocessGeneratorsBlocked(antichain);
    if (VERBOSE) {
      System.out.println("***** level " + antichain.mCl + ":");
      PermGrp.printGenerators(antichain.mStabilisers[antichain.mCl].mSt, 0);
      System.out.println("                                       canonical");
    }
    return true;
  }

  /*
   * Whether the antichain data given by antichain may yield a canonical antichain list.  Special case of a list
   * that, if packed, fits into (and requires) two long.
   *
   * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
   * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
   * on any level precludes any completion of the antichain data on higher levels being canonical.
   *
   * The function checks whether the multiset of sets chosen on the current level (antichain.mO[...] & antichain.mCmc) is
   * minimal under the action of the current stabiliser (antichain.mStabilisers[antichain.mCl+1].ST and antichain.mStabilisers[antichain.mCl+1].mSi).  If yes,
   * and if the antichain data is not complete (that is, antichain.mCl > 0]), then the new stabiliser is stored in
   * antichain.mStabilisers[antichain.mCl].ST and antichain.mStabilisers[antichain.mCl].mSi.  If the antichain data is complete and canonical, antichain.mStabilisers[0].ST and
   * antichain.mStabilisers[0].mSi will instead be set to the stabiliser of the new lattice obtained from the antichain data.
   * (The points on the lowest (new) level of the new lattice correspond to the antichains in that sequence;
   * if a permutation fixes the multiset but permutes its elements, the points of the lowest level of the
   * new lattice need to be permuted accordingly to obtain an element of the stabiliser of the new lattice.
   * Additional generators of the stabiliser of the new lattice are given by all possible permutations of
   * identical antichains, i.e., all possible permutations of points of the lowest level of the new lattice
   * that have identical covering sets.  The latter may be handled by "implicit" stabilisers.)
   */
  static boolean isCanonicalP2(final Antichain antichain, final int bits) {
    final long[] m1 = new long[Utils.MAXN - 2];

    if (VERBOSE) {
      System.out.println("[entering antichaindata_isCanonical_p2]:");
      antichain.mLattice.print();
      antichain.printCounters();
    }
    int apf = Long.SIZE / bits;
    int i = apf;
    for (long mask = Utils.bit(bits) - 1; i-- != 0; mask <<= bits) {
      m1[i] = mask;
    }
    final int offset = 2 * apf - antichain.mK;
    final PermGrp g = antichain.mStabilisers[antichain.mCl + 1].mSt;
    if (g.mNgens > 0) {
      antichain.mGlobals.mOrbitElements[0].mData[0] = antichain.mGlobals.mOrbitElements[0].mData[1] = 0;
      for (i = 0; i < antichain.mK - apf; i++) {
        antichain.mGlobals.mOrbitElements[0].mData[0] <<= bits;
        antichain.mGlobals.mOrbitElements[0].mData[0] |= (antichain.mO[i] & antichain.mCmc) >>> antichain.mLattice.mLev[antichain.mCl];
      }
      for (; i < antichain.mK; i++) {
        antichain.mGlobals.mOrbitElements[0].mData[1] <<= bits;
        antichain.mGlobals.mOrbitElements[0].mData[1] |= (antichain.mO[i] & antichain.mCmc) >>> antichain.mLattice.mLev[antichain.mCl];
      }
      if (antichain.mGlobals.mOrbitElements[0].mData[0] != 0 || antichain.mGlobals.mOrbitElements[0].mData[1] != 0) {
        if (antichain.mStabilisers[antichain.mCl + 1].mSi != 0) {
          /* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
          final byte[] p = Permutation.create();
          final long[] l = {antichain.mGlobals.mOrbitElements[0].mData[0], antichain.mGlobals.mOrbitElements[0].mData[1]};
          Permutation.init(antichain.mLattice.mN + antichain.mK, p);
          long pmask;
          for (pmask = 1, i = apf; i-- != 0; ) {
            pmask = (pmask << bits) | 1;
          }
          applySIp2(antichain.mLattice.mN, antichain.mK, apf, antichain.mLattice.mLev[antichain.mCl], bits, antichain.mStabilisers[antichain.mCl + 1].mBl, antichain.mGlobals, l, antichain.mStabilisers[antichain.mCl + 1].mSi, pmask, p);
          if (cmpP2(l, antichain.mGlobals.mOrbitElements[0].mData) != 0) {
            /* determine the position up to which we can backtrack */
            int pi;
            boolean found;
            int m = i = 0;
            long d = l[0] ^ antichain.mGlobals.mOrbitElements[0].mData[0];
            do {
              pi = p[antichain.mLattice.mN + i] - antichain.mLattice.mN;
              if (pi > m) {
                m = pi;
              }
            } while (!((found = (d & m1[offset + i]) != 0)) && (++i < antichain.mK - apf));
            if (!found) {
              d = l[1] ^ antichain.mGlobals.mOrbitElements[0].mData[1];
              do {
                pi = p[antichain.mLattice.mN + i] - antichain.mLattice.mN;
                if (pi > m) {
                  m = pi;
                }
              } while ((d & m1[i++ - (antichain.mK - apf)]) == 0);
            }
            antichain.mFpos += m - antichain.mCp;
            antichain.mCp = m;
            if (VERBOSE) {
              Permutation.print(antichain.mLattice.mN + antichain.mK, p, 0);
              System.out.printf("                                       NOT canonical --> %d%n", antichain.mCp);
            }
            return false;
          }
          final PermGrpC s = antichain.ensureStabiliser(antichain.mCl);
          antichain.mStabilisers[antichain.mCl].mSt = s.mG;
          s.init(antichain.mLattice.mN + antichain.mK);
          antichain.mStabilisers[antichain.mCl].mSi = antichain.mStabilisers[antichain.mCl + 1].mSi;
          final int[] ugly = {antichain.mStabilisers[antichain.mCl].mSi};
          extractStabiliserP2(antichain.mLattice.mN, antichain.mK, antichain.mLattice.mLev[antichain.mCl], antichain.mLattice.mLev[antichain.mCl + 1], antichain.mGlobals, s, ugly);
          antichain.mStabilisers[antichain.mCl].mSi = ugly[0];
          /* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
          antichain.mGlobals.mOrbitSize = 1;
          antichain.mGlobals.mOrbitElements[0].mGen = -1;
          Permutation.init(s.mG.mN, antichain.mGlobals.mOrbitElements[0].mToRoot);
          antichain.mGlobals.mOrbitPos.clear();
          antichain.mGlobals.mOrbitPos.putIfAbsent(new DualLong(l), 0);
          if (s.mG.mN > g.mN) {
            for (int gen = 0; gen < g.mNgens; ++gen) {
              Permutation.resize(g.mN, s.mG.mN, g.mPerm[gen]);
              Permutation.resize(g.mN, s.mG.mN, g.mInvPerm[gen]);
            }
          }
          for (int pos = 0; pos < antichain.mGlobals.mOrbitSize; ++pos) {
            for (int gen = 0; gen < g.mNgens; gen++) {
              final long[] a = new long[2];
              if ((g.mInvol & Utils.bit(gen)) != 0 && antichain.mGlobals.mOrbitElements[pos].mGen == gen) {
                continue;
              }
              /* apply generator gen to orbit element pos... */
              if (antichain.mGlobals.mOrbitSpace == antichain.mGlobals.mOrbitSize) {
                antichain.mGlobals.enlargenOrbitSpace();
              }
              a[0] = l[0];
              a[1] = l[1];
              g.mBenes[antichain.mCl][gen].applyP2(a);
              if (antichain.mCl < antichain.mLattice.mNLev - 2) {
                g.mBenes[antichain.mLattice.mNLev - 1][gen].applyBlockedP2(a, apf * bits);
              }
              Permutation.init(s.mG.mN, p);
              applySIp2(antichain.mLattice.mN, antichain.mK, apf, antichain.mLattice.mLev[antichain.mCl], bits, antichain.mStabilisers[antichain.mCl + 1].mBl, antichain.mGlobals, a, antichain.mStabilisers[antichain.mCl + 1].mSi, pmask, p);
              /* ...we're done if the result is smaller than the original element */
              if (cmpP2(l, a) > 0) {
                /* determine the position up to which we can backtrack */
                int pi;
                boolean found;
                int m = i = 0;
                long d = l[0] ^ a[0];
                do {
                  pi = antichain.mGlobals.mOrbitElements[pos].mToRoot[g.mInvPerm[gen][p[antichain.mLattice.mN + i]]] - antichain.mLattice.mN;
                  if (pi > m) {
                    m = pi;
                  }
                } while (!((found = (d & m1[offset + i]) != 0)) && (++i < antichain.mK - apf));
                if (!found) {
                  d = l[1] ^ a[1];
                  do {
                    pi = antichain.mGlobals.mOrbitElements[pos].mToRoot[g.mInvPerm[gen][p[antichain.mLattice.mN + i]]] - antichain.mLattice.mN;
                    if (pi > m) {
                      m = pi;
                    }
                  } while ((d & m1[(i++) - (antichain.mK - apf)]) == 0);
                }
                antichain.mFpos += m - antichain.mCp;
                antichain.mCp = m;
                if (VERBOSE) {
                  System.out.println("                                       NOT canonical");
                }
                return false;
              }
              /* ...otherwise, do the necessary housekeeping */
              antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mData[0] = a[0];
              antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mData[1] = a[1];
              processElementP2(antichain, g, s, pos, gen, p);
            }
          }
          s.compactGenerators();
        } else {
          /* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
          final byte[] p = Permutation.create();
          final long[] l = {antichain.mGlobals.mOrbitElements[0].mData[0], antichain.mGlobals.mOrbitElements[0].mData[1]};
          Permutation.init(antichain.mLattice.mN + antichain.mK, p);

          final PermGrpC s = antichain.ensureStabiliser(antichain.mCl);
          antichain.mStabilisers[antichain.mCl].mSt = s.mG;
          s.init(antichain.mLattice.mN + antichain.mK);
          antichain.mStabilisers[antichain.mCl].mSi = 0;
          /* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
          antichain.mGlobals.mOrbitSize = 1;
          antichain.mGlobals.mOrbitElements[0].mGen = -1;
          Permutation.init(s.mG.mN, antichain.mGlobals.mOrbitElements[0].mToRoot);
          antichain.mGlobals.mOrbitPos.clear();
          antichain.mGlobals.mOrbitPos.putIfAbsent(new DualLong(l), 0);
          if (s.mG.mN > g.mN) {
            for (int gen = 0; gen < g.mNgens; ++gen) {
              Permutation.resize(g.mN, s.mG.mN, g.mPerm[gen]);
              Permutation.resize(g.mN, s.mG.mN, g.mInvPerm[gen]);
            }
          }
          for (int pos = 0; pos < antichain.mGlobals.mOrbitSize; ++pos) {
            for (int gen = 0; gen < g.mNgens; ++gen) {
              final long[] a = new long[2];
              if ((g.mInvol & Utils.bit(gen)) != 0 && antichain.mGlobals.mOrbitElements[pos].mGen == gen) {
                continue;
              }
              /* apply generator gen to orbit element pos... */
              if (antichain.mGlobals.mOrbitSpace == antichain.mGlobals.mOrbitSize) {
                antichain.mGlobals.enlargenOrbitSpace();
              }
              a[0] = l[0];
              a[1] = l[1];
              g.mBenes[antichain.mCl][gen].applyP2(a);
              if (antichain.mCl < antichain.mLattice.mNLev - 2) {
                g.mBenes[antichain.mLattice.mNLev - 1][gen].applyBlockedP2(a, apf * bits);
              }
              Permutation.init(s.mG.mN, p);
              sortP2(antichain.mK, bits, antichain.mK - apf, offset, m1, antichain.mStabilisers[antichain.mCl + 1].mBl, a, p, antichain.mLattice.mN);
              /* ...we're done if the result is smaller than the original element */
              if (cmpP2(l, a) > 0) {
                /* determine the position up to which we can backtrack */
                int pi;
                boolean found;
                int m = i = 0;
                long d = l[0] ^ a[0];
                do {
                  pi = antichain.mGlobals.mOrbitElements[pos].mToRoot[g.mInvPerm[gen][p[antichain.mLattice.mN + i]]] - antichain.mLattice.mN;
                  if (pi > m) {
                    m = pi;
                  }
                } while (!((found = (d & m1[offset + i]) != 0)) && (++i < antichain.mK - apf));
                if (!found) {
                  d = l[1] ^ a[1];
                  do {
                    pi = antichain.mGlobals.mOrbitElements[pos].mToRoot[g.mInvPerm[gen][p[antichain.mLattice.mN + i]]] - antichain.mLattice.mN;
                    if (pi > m) {
                      m = pi;
                    }
                  } while ((d & m1[(i++) - (antichain.mK - apf)]) == 0);
                }
                antichain.mFpos += m - antichain.mCp;
                antichain.mCp = m;
                if (VERBOSE) {
                  System.out.println("                                       NOT canonical");
                }
                return false;
              }
              /* ...otherwise, do the necessary housekeeping */
              antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mData[0] = a[0];
              antichain.mGlobals.mOrbitElements[antichain.mGlobals.mOrbitSize].mData[1] = a[1];
              processElementP2(antichain, g, s, pos, gen, p);
            }
          }
          s.compactGenerators();
        }
      } else { /* as the antichains must intersect the lowest level, antichain.mCl < antichain.mLattice.mNLev-2 */
        antichain.mStabilisers[antichain.mCl].mSt = antichain.mStabilisers[antichain.mCl + 1].mSt;
        antichain.mStabilisers[antichain.mCl].mSi = antichain.mStabilisers[antichain.mCl + 1].mSi;
      }
    } else if (antichain.mStabilisers[antichain.mCl + 1].mSi != 0) {
      antichain.mGlobals.mOrbitElements[0].mData[0] = antichain.mGlobals.mOrbitElements[0].mData[1] = 0;
      apf = Long.SIZE / bits;
      for (i = 0; i < antichain.mK - apf; ++i) {
        antichain.mGlobals.mOrbitElements[0].mData[0] <<= bits;
        antichain.mGlobals.mOrbitElements[0].mData[0] |= (antichain.mO[i] & antichain.mCmc) >>> antichain.mLattice.mLev[antichain.mCl];
      }
      for (; i < antichain.mK; ++i) {
        antichain.mGlobals.mOrbitElements[0].mData[1] <<= bits;
        antichain.mGlobals.mOrbitElements[0].mData[1] |= (antichain.mO[i] & antichain.mCmc) >>> antichain.mLattice.mLev[antichain.mCl];
      }
      if (antichain.mGlobals.mOrbitElements[0].mData[0] != 0 || antichain.mGlobals.mOrbitElements[0].mData[1] != 0) {
        /* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
        final byte[] p = Permutation.create();
        final long[] l = new long[2];
        l[0] = antichain.mGlobals.mOrbitElements[0].mData[0];
        l[1] = antichain.mGlobals.mOrbitElements[0].mData[1];
        Permutation.init(antichain.mLattice.mN + antichain.mK, p);
        long pmask;
        for (pmask = 1, i = apf; i-- != 0; ) {
          pmask = (pmask << bits) | 1;
        }
        applySIp2(antichain.mLattice.mN, antichain.mK, apf, antichain.mLattice.mLev[antichain.mCl], bits, antichain.mStabilisers[antichain.mCl + 1].mBl, antichain.mGlobals, l, antichain.mStabilisers[antichain.mCl + 1].mSi, pmask, p);
        if (cmpP2(l, antichain.mGlobals.mOrbitElements[0].mData) != 0) {
          /* determine the position up to which we can backtrack */
          int pi;
          boolean found;
          int m = i = 0;
          long d = l[0] ^ antichain.mGlobals.mOrbitElements[0].mData[0];
          do {
            pi = p[antichain.mLattice.mN + i] - antichain.mLattice.mN;
            if (pi > m) {
              m = pi;
            }
          } while (!((found = (d & m1[offset + i]) != 0)) && (++i < antichain.mK - apf));
          if (!found) {
            d = l[1] ^ antichain.mGlobals.mOrbitElements[0].mData[1];
            do {
              pi = p[antichain.mLattice.mN + i] - antichain.mLattice.mN;
              if (pi > m) {
                m = pi;
              }
            } while ((d & m1[(i++) - (antichain.mK - apf)]) == 0);
          }
          antichain.mFpos += m - antichain.mCp;
          antichain.mCp = m;
          if (VERBOSE) {
            Permutation.print(antichain.mLattice.mN + antichain.mK, p, 0);
            System.out.printf("                                       NOT canonical --> %d%n", antichain.mCp);
          }
          return false;
        }
        final PermGrpC s = antichain.ensureStabiliser(antichain.mCl);
        antichain.mStabilisers[antichain.mCl].mSt = s.mG;
        s.init(antichain.mLattice.mN + antichain.mK);
        antichain.mStabilisers[antichain.mCl].mSi = antichain.mStabilisers[antichain.mCl + 1].mSi;
        final int[] ugly = {antichain.mStabilisers[antichain.mCl].mSi};
        extractStabiliserP2(antichain.mLattice.mN, antichain.mK, antichain.mLattice.mLev[antichain.mCl], antichain.mLattice.mLev[antichain.mCl + 1], antichain.mGlobals, s, ugly);
        antichain.mStabilisers[antichain.mCl].mSi = ugly[0];
        s.compactGenerators();
      } else { /* as the antichains must intersect the lowest level, antichain.mCl < antichain.mLattice.mNLev-2 */
        antichain.mStabilisers[antichain.mCl].mSt = antichain.mStabilisers[antichain.mCl + 1].mSt;
        antichain.mStabilisers[antichain.mCl].mSi = antichain.mStabilisers[antichain.mCl + 1].mSi;
      }
    } else {
      if (antichain.mCl == antichain.mLattice.mNLev - 2) {
        final PermGrpC s = antichain.ensureStabiliser(antichain.mCl);
        antichain.mStabilisers[antichain.mCl].mSt = s.mG;
        s.init(antichain.mLattice.mN + antichain.mK);
      } else {
        antichain.mStabilisers[antichain.mCl].mSt = antichain.mStabilisers[antichain.mCl + 1].mSt;
      }
      antichain.mStabilisers[antichain.mCl].mSi = antichain.mStabilisers[antichain.mCl + 1].mSi;
    }
    if (antichain.mCl == 0) {
      final int[] ugly = {antichain.mStabilisers[0].mBl};
      antichain.updateBlocks(antichain.mStabilisers[1].mBl, ugly);
      antichain.mStabilisers[0].mBl = ugly[0];
      antichain.mStabilisers[0].mSi |= antichain.mStabilisers[0].mBl << antichain.mLattice.mN;
    }
    preprocessGeneratorsBlocked(antichain);
    if (VERBOSE) {
      System.out.printf("***** level %d:%n", antichain.mCl);
      PermGrp.printGenerators(antichain.mStabilisers[antichain.mCl].mSt, 0);
      System.out.println("                                       canonical");
    }
    return true;
  }
}
