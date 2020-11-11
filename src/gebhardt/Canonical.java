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

  private Canonical() { }

	private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));

  /*
	 * Whether the antichain data given by antichain may yield a canonical antichain list.  Wrapper which dispatches
	 * the work to antichaindata_isCanonical_p1 or antichaindata_isCanonical_p2.
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
		final int bits = antichain.mLattice.lev[antichain.mCl + 1] - antichain.mLattice.lev[antichain.mCl];
		if (antichain.mK * bits <= Long.SIZE) {
			return isCanonicalP1(antichain, bits);
		} else {
			throw new UnsupportedOperationException();
			//return antichaindata_isCanonical_p2(antichain, bits);
		}
	}

//	/*
//	 * Compare in lexicographical order the packed antichain lists A and B.
//	 *
//	 * Note that the function knows nothing about the levellised ordering!  The idea is to use this
//	 * function on a list of antichains that only live on one level, and/or iteratively, starting at
//	 * the maximal level, with appropriate masking.
//	 *
//	 * Return value: <0 if A < B
//	 *               0  if A = B
//	 *               >0 if A > B
//	 */
//	static int antichainList_cmp_p2(long[] A, long[] B) {
//		if (A[0] < B[0]) {
//			return -1;
//		} else if (A[0] > B[0]) {
//			return 1;
//		} else if (A[1] < B[1]) {
//			return -1;
//		} else if (A[1] > B[1]) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}

// static void antichain_apply_perm(int lo, int hi, permutation p, long A, long[] R)
// /*
//  * TEST FUNCTION: Store the result of applying the permutation p to the antichain A, containing the elements
//  * lo..(hi-1) only, in *R.
//  */
// {
// 	int  i;

// 	for (*R=0UL, i=lo; i<hi; i++)
// 		if (A & BIT(i))
// 			*R |= BIT(p[i]);
// }


// static void antichainList_apply_perm_p1(int n, int lo, int hi, permutation p, int k,	long L, long[] R)
// /*
//  * TEST FUNCTION: Store the result of applying the permutation p to the packed antichain list L containing
//  * k antichains, involving only the elements lo..(hi-1), in the packed antichain list *R.  The action on
//  * points points 0..n-1 corresponds to a permutation of the elements of the antichains; the action on points
//  * n..n+k-1 corresponds to a permutation of the antichains.
//  */
// {
// 	int  i, j, bits;

// 	bits = hi-lo;
// 	*R = 0UL;
// 	for (i=0; i<k; i++)
// 		for (j=0; j<bits; j++)
// 			if (L & (BIT(j) << (bits*(k-1-i))))
// 				*R |= BIT(p[lo+j]-lo) << (bits*(k-1-(p[n+i]-n)));
// }


// static void antichainList_apply_perm_p2(int n, int lo, int hi, permutation p, int k,	long L[2], long R[2])
// /*
//  * TEST FUNCTION: Store the result of applying the permutation p to the packed antichain list L containing
//  * k antichains, involving only the elements lo..(hi-1), in the packed antichain list *R.  The action on
//  * points points 0..n-1 corresponds to a permutation of the elements of the antichains; the action on points
//  * n..n+k-1 corresponds to a permutation of the antichains.
//  */
// {
// 	int  i, j, bits, apf, fi, oi, fpi, opi;

// 	bits = hi-lo;
// 	apf = BITSPERLONG/bits;
// 	R[0] = R[1] = 0UL;
// 	for (i=0; i<k; i++) {
// 		fi = 1 - (k-1-i)/apf;
// 		oi = (k-1-i) % apf;
// 		fpi = 1 - (k-1-(p[n+i]-n))/apf;
// 		opi = (k-1-(p[n+i]-n)) % apf;
// 		for (j=0; j<bits; j++)
// 			if (L[fi] & (BIT(j) << (bits*oi)))
// 				R[fpi] |= BIT(p[lo+j]-lo) << (bits*opi);
// 	}
// }

	/*
	 * Sort the packed antichain list *l containing k antichains of size m in ascending order, subject to the
	 * permitted swaps of adjacent antichains indicated by bl.  The permutation sorting l is also applied to
	 * p[offset]..p[offset+k-1].  The array mask should contain ((1<<m)-1)<<((k-1)*m),..,((1<<m)-1).
	 */
	static void sortP1(final int m, final long[] mask, final int bl, final long[] l, final byte[] p, final int offset) {
		if (bl == 0) {
			return;
		}
		final int lo = Integer.numberOfTrailingZeros(bl);
		int n = 32 - Integer.numberOfLeadingZeros(bl);
		do {
      long t1, t2;
      int newn = 0;
			for (int i = lo; i < n; ++i) {
        if ((bl & Utils.BIT(i)) != 0 && (t1 = ((l[0] & mask[i - 1]) >> m)) > (t2 = (l[0] & mask[i]))) {
					t1 ^= t2;
					l[0] ^= ((t1 << m) | t1);
					final byte tp = p[offset + i - 1];
					p[offset + i - 1] = p[offset + i];
					p[offset + i] = tp;
					newn = i;
				}
			}
			n = newn;
		} while (n != 0);
	}

//	/*
//	 * Sort the packed antichain list L containing k antichains of size m in ascending order, with L[0] containing
//	 * k0 antichains and L[1] containing k-k0 antichains, subject to the permitted swaps of adjacent antichains
//	 * indicated by bl.  The permutation sorting L is also applied to p[offset]..p[offset+k-1].  The arrays M0 and M1
//	 * should contain ((1<<m)-1)<<((k0-1)*m),..,((1<<m)-1) and ((1<<m)-1)<<((k-k0-1)*m),..,((1<<m)-1) respectively.
//	 */
//	static void antichainList_sort_p2(int k, int m, int k0, long[] M0, long[] M1, int bl, long[] L, byte[] p, int offset) {
//		long t1, t2;
//		byte tp;
//		int newn, n, n0, i, lo;
//
//		if (bl == 0) {
//			return;
//		}
//		lo = Integer.numberOfTrailingZeros(bl);
//		n = 32 - Integer.numberOfLeadingZeros(bl);
//		do {
//			newn = 0;
//			if (lo < k0) {
//				n0 = k0 < n ? k0 : n;
//				for (i = lo; i < n0; i++) {
//          if ((bl & Utils.BIT(i)) != 0 && (t1 = ((L[0] & M0[i - 1]) >> m)) > (t2 = (L[0] & M0[i]))) {
//						t1 ^= t2;
//						L[0] ^= ((t1 << m) | t1);
//						tp = p[offset + i - 1];
//						p[offset + i - 1] = p[offset + i];
//						p[offset + i] = tp;
//						newn = i;
//					}
//				}
//			}
//			if (lo <= k0 && k0 < n) {
//				int shift;
//				shift = (k - k0 - 1) * m;
//        if ((bl & Utils.BIT(k0)) != 0 && (t1 = ((L[0] & M0[k0 - 1]) << shift)) > (t2 = (L[1] & M1[0]))) {
//					t1 ^= t2;
//					L[0] ^= t1 >> shift;
//					L[1] ^= t1;
//					tp = p[offset + k0 - 1];
//					p[offset + k0 - 1] = p[offset + k0];
//					p[offset + k0] = tp;
//					newn = k0;
//				}
//			}
//			if (k0 + 1 < n) {
//				for (i = lo > k0 ? lo : k0 + 1; i < n; i++) {
//          if ((bl & Utils.BIT(i)) != 0 && (t1 = ((L[1] & M1[i - k0 - 1]) >> m)) > (t2 = (L[1] & M1[i - k0]))) {
//						t1 ^= t2;
//						L[1] ^= ((t1 << m) | t1);
//						tp = p[offset + i - 1];
//						p[offset + i - 1] = p[offset + i];
//						p[offset + i] = tp;
//						newn = i;
//					}
//				}
//			}
//			n = newn;
//		} while (n != 0);
//	}


	/*
	 * Minimise the packed antichain list l containing one antichain on the elements a0..(a0+m-1) under the
	 * action of the implicit automorphisms given by si.  The inverse of the permutation minimising l is
	 * left-multiplied to p, the rationale being to keep track of the permutation mapping l to some original
	 * element.  If sic != 0, the implicit stabiliser of the minimised antichain l is returned in sic.
	 */
	static void applySI1(final int a0, final int m, final long[] l, int si, final int[] sic, final byte[] p) {
		final int[] hi = new int[1];
		final int[] lo = new int[1];

    final long mask = Utils.BIT(m) - 1;
		if (sic != null) {
			sic[0] = (int) (si & ~(mask << a0));
		}
		si = (int) ((si >> a0) & mask);
		final int[] b = new int[] {si ^ (si >> 1)};
		long a = l[0] & ~(si | b[0]);  /* the elements in blocks of size 1 */
		while (Utils.extractMSB32(b, hi)) {
			Utils.extractMSB32(b, lo);
      final int pmask = (int) (Utils.BIT(hi[0] + 1) - Utils.BIT(lo[0]));
			int sb = (int) (l[0] & pmask);
			int ub = (int) (~l[0] & pmask);
			while (Utils.getMSB32(sb, hi) && Utils.getLSB32(ub, lo) && hi[0] > lo[0]) {
        sb ^= Utils.BIT(hi[0]) | Utils.BIT(lo[0]);
        ub ^= Utils.BIT(hi[0]) | Utils.BIT(lo[0]);
				final byte t = p[a0 + hi[0]];  /* left-multiplication of p by the transposition (lo hi) */
				p[a0 + hi[0]] = p[a0 + lo[0]];
				p[a0 + lo[0]] = t;
			}
			a |= sb;
			if (sb != 0 && ub != 0) {
        si ^= Utils.BIT(lo[0]);
			}
		}
		l[0] = a;
		if (sic != null) {
			sic[0] |= si << a0;
		}
	}

	/*
	 * Minimise the packed antichain list *l containing k antichains on the elements a0..(a0+m-1) under the
	 * action of the implicit automorphisms given by si.  The inverse of the permutation minimising l is
	 * left-multiplied to p, the rationale being to keep track of the permutation mapping l to some original
	 * element.
	 */
	static void listApplySIP1(int n, int k, int a0, int m, int bl, Globals globals, long[] l, int si, long bigM, byte[] p) {
    int mask = (int) (Utils.BIT(m) - 1);
		assert globals.mSi0 != null;
		assert globals.mSi0[0] != null;
		assert l != null;
		globals.mSi0[0].mRep[0] = l[0];
		globals.mSi0[0].mS = (si >> a0) & mask;
		globals.mSi0[0].mP = Permutation.create();
		Permutation.copy(n + k, p, globals.mSi0[0].mP);
		int si0Size = 1;
		int dr, dj;
		for (int r = k - 1; r >= 0; r -= dr) { /* r: position to be filled */
			int si1Size = 0;
			int aMin = mask;
			dr = 1;
			for (int i = 0; i < si0Size; ++i) { /* loop over candidates */
				boolean next = false;
				for (int j = r; !next; j -= dj) { /* j: position of the antichain under consideration */
					int[] hi = new int[1];
					int[] lo = new int[1];
					byte[] q = Permutation.create();
					if (si1Size == globals.mSiSpace) {
						globals.enlargenSiSpace();
					}
					Permutation.copy(n + k, globals.mSi0[i].mP, q);
          int s = globals.mSi0[i].mS;
					long bigP = globals.mSi0[i].mRep[0];
					final int a = (int) ((bigP >> j * m) & mask);  /* j: antichain under consideration */
					final int[] B = new int[] {(s >> 1) ^ s};
					int ac = a & ~(s | B[0]);  /* the elements in blocks of size 1 */
					while (a != ac && Utils.extractMSB32(B, hi)) {  /* get an orbit lo..hi ... */
						Utils.extractMSB32(B, lo);
            final int pmask = (int) (Utils.BIT(hi[0] + 1) - Utils.BIT(lo[0]));
						int sb = a & pmask;
						int ub = ~a & pmask;
						while (Utils.getMSB32(sb, hi) && Utils.getLSB32(ub, lo) && hi[0] > lo[0]) { /* ... if highest set > lowest unset: swap them */
              sb ^= Utils.BIT(hi[0]) | Utils.BIT(lo[0]);
              ub ^= Utils.BIT(hi[0]) | Utils.BIT(lo[0]);
							final long bigT = ((bigP >> hi[0]) ^ (bigP >> lo[0])) & bigM;
							bigP ^= (bigT << hi[0]) | (bigT << lo[0]);
							final byte t = q[a0 + hi[0]];  /* left-multiplication by (lo hi) */
							q[a0 + hi[0]] = q[a0 + lo[0]];
							q[a0 + lo[0]] = t;
						}
						ac |= sb;
						if (sb != 0 && ub != 0) {
              s ^= Utils.BIT(lo[0]);
						}
						if (ac > aMin) {
							break;
						}
					}
					dj = 0;
					do {
            if (dj >= j || (bl & Utils.BIT(k - j + dj)) == 0) {
							next = true;
						}
						++dj;
					} while (!next && ((bigP >> (j - dj) * m) & mask) == ac);
					if (ac > aMin || (ac == aMin && dj < dr)) {
						continue;  /* not minimal */
					}
					if (ac < aMin || (ac == aMin && dj > dr)) {  /* new minimum! */
						aMin = ac;
						dr = dj;
						si1Size = 0;
					}
					globals.mSi1[si1Size].mP = Permutation.create();
					Permutation.copy(n + k, q, globals.mSi1[si1Size].mP);
					if (j < r) {  /* insert antichains (j-dr+1)..j at positions (r-dr+1)..r */
						long mask1, mask2;
						byte[] pqq;
            mask1 = (Utils.BIT((r - j) * m) - 1) << ((j + 1) * m);
            mask2 = (Utils.BIT(dr * m) - 1) << ((j - dr + 1) * m);
						bigP = (bigP & ~(mask1 | mask2)) | ((bigP & mask1) >> (dr * m)) | ((bigP & mask2) << ((r - j) * m));
						/* left-multiply q=globals.SI1[si1Size].p by the inverse of the applied permutation */
						int offset = n + k - 1 - j;
						pqq = globals.mSi1[si1Size].mP;
						int opqq = n + k - 1 - r;
						for (int t = dr; t-- != 0; ) {
							pqq[opqq + t] = q[offset + t];
						}
						offset -= (r - j);  /* pq = q + n+k-1-r; */
						opqq += dr;   /* pqq = globals.SI1[si1Size].p + n+k-1-r+dr; */
						for (int t = r - j; t-- != 0; ) {
							pqq[opqq + t] = q[offset + t];
						}
					}
					globals.mSi1[si1Size].mS = s;
					globals.mSi1[si1Size].mRep[0] = bigP;
					si1Size++;
				}
			}
			si0Size = si1Size;
			final SiData[] sit = globals.mSi0;
			globals.mSi0 = globals.mSi1;
			globals.mSi1 = sit;
		}
		l[0] = globals.mSi0[0].mRep[0];
		Permutation.copy(n + k, globals.mSi0[0].mP, p);
		globals.mSi0Size = si0Size;
	}

  /* access macro for the antichain in *position* i */
	private static int antichain(final long[] l, final int i, final int m, final int k1, final int mask) {
		return (int) ((((i) >= (k1)) ? ((l)[0] >> (((i) - (k1)) * (m))) : ((l)[1] >> ((i) * (m)))) & mask);
	}

//	/*
//	 * Minimise the packed antichain list L containing k antichains on the elements a0..(a0+m-1), with L[0]
//	 * containing k-k1 antichains and L[1] containing k1 antichains,  under the action of the implicit
//	 * automorphisms given by SI.  The inverse of the permutation minimising L is left-multiplied to p, the
//	 * rationale being to keep track of the permutation mapping L to some original element.
//	 */
//	static void antichainList_applySI_p2(int n, int k, int k1, int a0, int m, int bl, Globals GD, long[] L, int SI, long M, byte[] p) {
//		SiData[] SIt;
//		int SI0size, SI1size;
//		int i;
//		int r, dr, j, dj, t;
//		long T;
//		int A, A_, A_min, S, mask;
//		boolean next;
//
//    mask = (int) (Utils.BIT(m) - 1);
//		GD.mSi0[0].mRep[0] = L[0];
//		GD.mSi0[0].mRep[1] = L[1];
//		GD.mSi0[0].mS = (SI >> a0) & mask;
//		Permutation.copy(n + k, p, GD.mSi0[0].mP);
//		SI0size = 1;
//		for (r = k - 1; r >= 0; r -= dr) { /* r: position to be filled */
//			SI1size = 0;
//			A_min = mask;
//			dr = 1;
//			for (i = 0; i < SI0size; i++) { /* loop over candidates */
//				next = false;
//				for (j = r; !next; j -= dj) { /* j: position of the antichain under consideration */
//					int[] hi = new int[1];
//					int[] lo = new int[1];
//					long[] P = new long[2];
//					byte[] q = Permutation.create();
//					if (SI1size == GD.mSiSpace) {
//						GD.enlargenSiSpace();
//					}
//					Permutation.copy(n + k, GD.mSi0[i].mP, q);
//					S = GD.mSi0[i].mS;
//					P[0] = GD.mSi0[i].mRep[0];
//					P[1] = GD.mSi0[i].mRep[1];
//					A = antichain(P, j, m, k1, mask);   /* j: antichain under consideration */
//					final int[] B = new int[] {(S >> 1) ^ S};
//					A_ = A & ~(S | B[0]);  /* the elements in blocks of size 1 */
//					while (A != A_ && Utils.extractMSB32(B, hi)) {  /* get an orbit lo..hi ... */
//						int pmask, SB, UB;
//						Utils.extractMSB32(B, lo);
//            pmask = (int) (Utils.BIT(hi[0] + 1) - Utils.BIT(lo[0]));
//						SB = A & pmask;
//						UB = ~A & pmask;
//						while (Utils.getMSB32(SB, hi) && Utils.getLSB32(UB, lo) && hi[0] > lo[0]) { /* ... if highest set > lowest unset: swap them */
//              SB ^= Utils.BIT(hi[0]) | Utils.BIT(lo[0]);
//              UB ^= Utils.BIT(hi[0]) | Utils.BIT(lo[0]);
//							T = ((P[0] >> hi[0]) ^ (P[0] >> lo[0])) & M;
//							P[0] ^= (T << hi[0]) | (T << lo[0]);
//							T = ((P[1] >> hi[0]) ^ (P[1] >> lo[0])) & M;
//							P[1] ^= (T << hi[0]) | (T << lo[0]);
//							t = q[a0 + hi[0]];  /* left-multiplication by (lo hi) */
//							q[a0 + hi[0]] = q[a0 + lo[0]];
//							q[a0 + lo[0]] = (byte)t;
//						}
//						A_ |= SB;
//						if (SB != 0 && UB != 0) {
//              S ^= Utils.BIT(lo[0]);
//						}
//						if (A_ > A_min) {
//							break;
//						}
//					}
//					dj = 0;
//					do {
//            if (dj >= j || (bl & Utils.BIT(k - j + dj)) == 0) {
//							next = true;
//						}
//						dj++;
//					} while (!next && antichain(P, j - dj, m, k1, mask) == A_);
//					if (A_ > A_min || (A_ == A_min && dj < dr)) {
//						continue;  /* not minimal */
//					}
//					if (A_ < A_min || (A_ == A_min && dj > dr)) {  /* new minimum! */
//						A_min = A_;
//						dr = dj;
//						SI1size = 0;
//					}
//					Permutation.copy(n + k, q, GD.mSi1[SI1size].mP);
//					if (j < r) {  /* move antichains j..(j-dr+1) to positions r..(r-dr+1), shifting r..j+1 to the right
//					 *  - move j..(j-dr+1) by r-j positions to the left
//					 *  - move r..(j+1) by dr positions to the right
//					 */
//						byte[] pqq;
//						if (j < k1) {
//							if (r < k1) {
//								long MR11, ML11;
//                ML11 = (Utils.BIT(dr * m) - 1) << ((j - dr + 1) * m);
//                MR11 = (Utils.BIT((r - j) * m) - 1) << ((j + 1) * m);
//								P[1] = (P[1] & ~(ML11 | MR11)) | ((P[1] & ML11) << ((r - j) * m)) | ((P[1] & MR11) >> (dr * m));
//							} else {
//								long MR00, MR01, MR11, ML10, ML11;
//								if (r - dr >= k1) {
//                  MR00 = (Utils.BIT((r - k1 - dr + 1) * m) - 1) << (dr * m);
//                  MR01 = Utils.BIT(dr * m) - 1;
//								} else {
//									MR00 = 0L;
//                  MR01 = Utils.BIT((r - k1 + 1) * m) - 1;
//								}
//                MR11 = (Utils.BIT((k1 - j - 1) * m) - 1) << (j + 1) * m;
//								if (r - k1 + 1 >= dr) {
//                  ML10 = (Utils.BIT(dr * m) - 1) << (j - dr + 1) * m;
//									ML11 = 0L;
//								} else {
//                  ML10 = (Utils.BIT((r - k1 + 1) * m) - 1) << (j - r + k1) * m;
//                  ML11 = (Utils.BIT((dr - (r - k1 + 1)) * m) - 1) << (j - dr + 1) * m;
//								}
//								T = (P[0] & ~(MR00 | MR01))
//									| ((P[0] & MR00) >> (dr * m))
//									| (r - j - k1 > 0 ? ((P[1] & ML10) << ((r - j - k1) * m)) : ((P[1] & ML10) >> (-(r - j - k1) * m)));
//								P[1] = (P[1] & ~(MR11 | ML10 | ML11))
//									| ((P[1] & MR11) >> (dr * m))
//									| ((P[1] & ML11) << ((r - j) * m))
//									| (dr - k1 > 0 ? ((P[0] & MR01) >> ((dr - k1) * m)) : ((P[0] & MR01) << (-(dr - k1) * m)));
//								P[0] = T;
//							}
//						} else {
//							if (j - dr + 1 < k1) {
//								long MR00, MR01, ML00, ML10, ML11;
//                MR00 = (Utils.BIT((r + 1 - k1 - dr) * m) - 1) << (dr * m);
//                MR01 = (Utils.BIT((k1 + dr - j - 1) * m) - 1) << ((j + 1 - k1) * m);
//                ML00 = Utils.BIT((j - k1 + 1) * m) - 1;
//								if (r - dr + 1 - k1 >= 0) {
//                  ML10 = ((Utils.BIT((k1 - 1 - j + dr) * m) - 1) << ((j - dr + 1) * m));
//									ML11 = 0L;
//								} else {
//                  ML10 = ((Utils.BIT((r - j) * m) - 1) << (k1 - r + j) * m);
//                  ML11 = ((Utils.BIT(k1 - r + dr - 1) * m) - 1) << ((j - dr + 1) * m);
//								}
//								T = (P[0] & ~(MR00 | MR01 | ML00))
//									| ((P[0] & MR00) >> (dr * m))
//									| ((P[0] & ML00) << ((r - j) * m))
//									| (r - j - k1 > 0 ? ((P[1] & ML10) << ((r - j - k1) * m)) : ((P[1] & ML10) >> (-(r - j - k1) * m)));
//								P[1] = (P[1] & ~(ML10 | ML11))
//									| ((P[1] & ML11) << ((r - j) * m))
//									| (dr - k1 > 0 ? ((P[0] & MR01) >> ((dr - k1) * m)) : ((P[0] & MR01) << (-(dr - k1) * m)));
//								P[0] = T;
//							} else {
//								long MR00, ML00;
//                ML00 = (Utils.BIT(dr * m) - 1) << ((j - dr + 1 - k1) * m);
//                MR00 = (Utils.BIT((r - j) * m) - 1) << ((j + 1 - k1) * m);
//								P[0] = (P[0] & ~(ML00 | MR00)) | ((P[0] & ML00) << ((r - j) * m)) | ((P[0] & MR00) >> (dr * m));
//							}
//						}
//						/* left-multiply q=GD.SI1[SI1size].p by the inverse of the applied permutation */
//						int pqo = n + k - 1 - j;
//						pqq = GD.mSi1[SI1size].mP;
//						int pqqo = n + k - 1 - r;
//						for (t = dr; t-- != 0; ) {
//							pqq[pqqo + t] = q[pqo + t];
//						}
//						pqo -= (r - j);  /* pq = q + n+k-1-r; */
//						pqqo += dr;   /* pqq = GD.SI1[SI1size].p + n+k-1-r+dr; */
//						for (t = r - j; t-- != 0; ) {
//							pqq[pqqo + t] = q[pqo + t];
//						}
//					}
//					GD.mSi1[SI1size].mS = S;
//					GD.mSi1[SI1size].mRep[0] = P[0];
//					GD.mSi1[SI1size].mRep[1] = P[1];
//					SI1size++;
//				}
//			}
//			SI0size = SI1size;
//			SIt = GD.mSi0;
//			GD.mSi0 = GD.mSi1;
//			GD.mSi1 = SIt;
//		}
//		L[0] = GD.mSi0[0].mRep[0];
//		L[1] = GD.mSi0[0].mRep[1];
//		Permutation.copy(n + k, GD.mSi0[0].mP, p);
//		GD.mSi0Size = SI0size;
//	}

	/*
	 * After a call to antichainList_applySI_p1 that showed that its argument L is minimal under the action of the implicit
	 * stabiliser:  Add to s any generator of the stabiliser of L that arises from different ways of reaching the minimal
	 * element, and set *si to the implicit stabiliser of L.
	 */
	static void extractStabiliserP1(final int n, final int k, final int lo, final int hi, final Globals globals, final PermGrpC s, final int[] si) {
    final byte[] p = Permutation.create();
    si[0] &= ~(Utils.BIT(hi) - Utils.BIT(lo));
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

//	/*
//	 * After a call to antichainList_applySI_p2 that showed that its argument L is minimal under the action of the implicit
//	 * stabiliser:  Add to s any generator of the stabiliser of L that arises from different ways of reaching the minimal
//	 * element, and set *si to the implicit stabiliser of L.  (L is only used in testing mode.)
//	 */
//	static void antichainList_extractStabiliser_p2(int n, int k, int lo, int hi, Globals globals, PermGrpC s, int[] si, long[] L) {
//		int i;
//		byte[] p = Permutation.create();
//
//    si[0] &= ~(Utils.BIT(hi) - Utils.BIT(lo));
//		si[0] |= globals.mSi0[0].mS << lo;
//		for (i = 1; i < globals.mSi0Size; i++) {
//			Permutation.leftDivide(n + k, globals.mSi0[0].mP, globals.mSi0[i].mP, p);
//			if (!Permutation.isIdentity(n + k, p)) {
//        if (VERBOSE) {
//          System.out.print("[antichainList_extractStabiliser_p1]: adding stabiliser generator ");
//          Permutation.print(s.mG.mN, p, 0);
//        }
//				s.addGenerator(p);
//			}
//		}
//	}

	private static final int ALL_BITS = (1 << (Utils.MAXN - 2)) - 1;

	/*
	 * Make sure that the generators are stored consecutively in perm, and record which generators are involutions.
	 */
	static void permgrpc_compactGenerators(final PermGrpC g) {
		final int[] i = new int[1];
		final int[] j = new int[1];

		while (Utils.getLSB32(g.mFreePerm, i) && Utils.getMSB32(ALL_BITS ^ g.mFreePerm, j) && i[0] < j[0]) {
			Permutation.copy(g.mG.mN, g.mG.mPerm[j[0]], g.mG.mPerm[i[0]]);
			Permutation.copy(g.mG.mN, g.mG.mInvPerm[j[0]], g.mG.mInvPerm[i[0]]);
      g.mFreePerm ^= Utils.BIT(i[0]);  /* bit i is set, so this clears it */
      g.mFreePerm |= Utils.BIT(j[0]);
		}
		final int[] ugly = new int[] {g.mG.mNgens};
		Utils.getLSB32(g.mFreePerm, ugly);
		g.mG.mNgens = ugly[0];
		g.mG.mInvol = 0;
		for (int k = 0, biti = 1; k < g.mG.mNgens; ++k, biti <<= 1) {
			if (Permutation.compare(g.mG.mN, g.mG.mPerm[k], g.mG.mInvPerm[k]) == 0) {
				g.mG.mInvol |= biti;
			}
		}
	}

	/*
	 * Generate Bene&scaron; networks for the action of the generators on the next level (AD.cl-1)
	 * of the current lattice or, if AD.cl==0, the lowest non-trivial level of the new lattice.
	 */
	static void permgrp_preprocessGenerators(final Antichain AD) {
		final lattice L = AD.mLattice;
		final PermGrp G = AD.mStabilisers[AD.mCl].mSt;
		//#ifndef FILTER_GRADED
		if (AD.mCl != 0) {
			for (int i = 0; i < G.mNgens; i++) {
				if (VERBOSE) {
					System.out.println("SAI: ppgen " + i + "/" + G.mNgens + " " + L.lev[AD.mCl - 1] + " " + L.lev[AD.mCl]);
					Permutation.print(G.mN, G.mPerm[i], 0);
				}
				G.mBenes[AD.mCl - 1][i] = Benes.get(G.mPerm[i], G.mInvPerm[i], L.lev[AD.mCl - 1], L.lev[AD.mCl]);
			}
      G.mBenesValid |= Utils.BIT(AD.mCl - 1);
		} else {
			for (int i = 0; i < G.mNgens; i++) {
				G.mBenes[L.nLev - 1][i] = Benes.get(G.mPerm[i], G.mInvPerm[i], L.lev[L.nLev - 1], L.lev[L.nLev]);
			}
      G.mBenesValid |= Utils.BIT(L.nLev - 1);
		}
// #else
// 	for (i=0; i<G.ngens; i++)
// 		benes_get(G.perm[i], G.invperm[i], L.lev[L.nLev-1], L.lev[L.nLev], &(G.Benes[0][i]));
// 	G.BenesValid |= BIT(0);
// #endif
	}


	/*
	 * Generate Bene&scaron; networks for the action of the generators on the next level (AD.cl-1)
	 * of the current lattice as well as for the action on AD.k antichains of the appropriate
	 * size or, if AD.cl==0, the lowest non-trivial level of the new lattice.
	 */
	static void permgrp_preprocessGenerators_blocked(Antichain AD) {
		int i;
		lattice L;
		PermGrp G;

		L = AD.mLattice;
		G = AD.mStabilisers[AD.mCl].mSt;
		//#ifndef FILTER_GRADED
		if (AD.mCl != 0) {
      if ((G.mBenesValid & Utils.BIT(L.nLev - 1)) != 0) {
				for (i = 0; i < G.mNgens; i++) {
					G.mBenes[AD.mCl - 1][i] = Benes.get(G.mPerm[i], G.mInvPerm[i], L.lev[AD.mCl - 1], L.lev[AD.mCl]);
					//Benes.delete(G.benes[L.nLev - 1][i]);
					G.mBenes[L.nLev - 1][i] = new Benes(G.mPerm[i], G.mInvPerm[i], L.lev[L.nLev - 1], L.lev[L.nLev], L.lev[AD.mCl] - L.lev[AD.mCl - 1]);
				}
        G.mBenesValid |= Utils.BIT(AD.mCl - 1);
			} else {
				for (i = 0; i < G.mNgens; i++) {
					G.mBenes[AD.mCl - 1][i] = Benes.get(G.mPerm[i], G.mInvPerm[i], L.lev[AD.mCl - 1], L.lev[AD.mCl]);
					G.mBenes[L.nLev - 1][i] = new Benes(G.mPerm[i], G.mInvPerm[i], L.lev[L.nLev - 1], L.lev[L.nLev], L.lev[AD.mCl] - L.lev[AD.mCl - 1]);
				}
        G.mBenesValid |= Utils.BIT(AD.mCl - 1) | Utils.BIT(L.nLev - 1);
			}
		} else {
      if ((G.mBenesValid & Utils.BIT(L.nLev - 1)) != 0) {
				for (i = 0; i < G.mNgens; i++) {
					//Benes.delete(G.benes[L.nLev - 1][i]);
					G.mBenes[L.nLev - 1][i] = Benes.get(G.mPerm[i], G.mInvPerm[i], L.lev[L.nLev - 1], L.lev[L.nLev]);
				}
			} else {
				for (i = 0; i < G.mNgens; i++) {
					G.mBenes[L.nLev - 1][i] = Benes.get(G.mPerm[i], G.mInvPerm[i], L.lev[L.nLev - 1], L.lev[L.nLev]);
				}
        G.mBenesValid |= Utils.BIT(L.nLev - 1);
			}
		}
// #else
// 	if (G.BenesValid & BIT(0)) {
// 		for (i=0; i<G.ngens; i++) {
// 			benes_delete(G.Benes[0][i]);
// 			benes_get(G.perm[i], G.invperm[i], L.lev[L.nLev-1], L.lev[L.nLev], &(G.Benes[0][i]));
// 		}
// 	} else {
// 		for (i=0; i<G.ngens; i++)
// 			benes_get(G.perm[i], G.invperm[i], L.lev[L.nLev-1], L.lev[L.nLev], &(G.Benes[0][i]));
// 		G.BenesValid |= BIT(0);
// 	}
// #endif
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
	static void processElement_1(Antichain AD, PermGrp G, PermGrpC S, int pos, int gen) {
		final byte[] h = Permutation.create();
		final long A = AD.mGlobals.mOrbitElements[AD.mGlobals.mOrbitSize].mData[0];
		int Apos = AD.mGlobals.mOrbitSize;
		/* check whether the element is new... */
		//if (hashtable_query_insert_1(AD.GD.orbpos, A, HASH_1(A), & Apos)){
		final boolean contains = AD.mGlobals.mOrbitPos.containsKey(A);
		if (contains) {
			Apos = AD.mGlobals.mOrbitPos.get(A).intValue();
			if (VERBOSE) {
				System.out.println("--- hashtable query/insert " + A + " => " + Apos);
			}
			/* ...if not, note the new stabiliser element */
			if (pos != 0) {
				if (Apos != 0) {
					Permutation.leftDivideMultiply(S.mG.mN, AD.mGlobals.mOrbitElements[pos].mToRoot, G.mPerm[gen], AD.mGlobals.mOrbitElements[Apos].mToRoot, h);
				} else {
					Permutation.leftDivide(S.mG.mN, AD.mGlobals.mOrbitElements[pos].mToRoot, G.mPerm[gen], h);
				}
			} else {
				if (Apos != 0)  /* equivalent to if (AD.GD.orbsort[lpos]) */ {
					assert G.mPerm[gen] != null;
					assert AD.mGlobals.mOrbitElements[Apos].mToRoot != null;
					Permutation.multiply(S.mG.mN, G.mPerm[gen], AD.mGlobals.mOrbitElements[Apos].mToRoot, h);
				} else {
					Permutation.copy(S.mG.mN, G.mPerm[gen], h);
				}
			}
// #ifdef DOTEST
// 		if (AD.GD.orbspace == AD.GD.orbsize)
// 			globals_enlargen_orbitspace(AD.GD);
// 		antichain_apply_perm(AD.L.lev[AD.cl], AD.L.lev[AD.cl+1], h, AD.GD.orb[0].data[0] << AD.L.lev[AD.cl],
// 				AD.GD.orb[AD.GD.orbsize].data);
// 		if (long_cmp(AD.GD.orb[0].data[0] << AD.L.lev[AD.cl], AD.GD.orb[AD.GD.orbsize].data[0])) {
// 			/* We don't test here whether the action on the lowest level is correct; this is done
// 			 * in lattice_test after the new lattice is created.
// 			 */
// 			printf("BAD STABILISER ELEMENT [processElement_1]: ");
// 			perm_print(S.G.n, h, 0);
// 			erri(-4);
// 		}
// #endif
			if (VERBOSE) {
				System.out.print("[processElement_1]: adding stabiliser generator ");
				Permutation.print(S.mG.mN, h, 0);
			}
			if (!Permutation.isIdentity(S.mG.mN, h)) {
				S.addGenerator(h);
			}
		} else {
			AD.mGlobals.mOrbitPos.put(A, (long) Apos);
			if (VERBOSE) {
				System.out.println("+++ hashtable query/insert " + A + " => " + Apos);
			}
			/* ...if yes, note the permutation to the root and the applied generator */
			AD.mGlobals.mOrbitElements[AD.mGlobals.mOrbitSize].mGen = gen;
			if (pos != 0) {
				Permutation.multiply(S.mG.mN, G.mInvPerm[gen], AD.mGlobals.mOrbitElements[pos].mToRoot, AD.mGlobals.mOrbitElements[AD.mGlobals.mOrbitSize].mToRoot);
			} else {
				Permutation.copy(S.mG.mN, G.mInvPerm[gen], AD.mGlobals.mOrbitElements[AD.mGlobals.mOrbitSize].mToRoot);
			}
			AD.mGlobals.mOrbitSize++;
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
	static void processElement_p1(Antichain AD, PermGrp G, PermGrpC S, int pos, int gen, byte[] p) {
		long A;
		int Apos;
		byte[] h = Permutation.create();

		A = AD.mGlobals.mOrbitElements[AD.mGlobals.mOrbitSize].mData[0];
		Apos = AD.mGlobals.mOrbitSize;
		/* check whether the element is new... */
		final boolean contains = AD.mGlobals.mOrbitPos.containsKey(A);
		//if (hashtable_query_insert_1(AD.GD.orbpos, A, HASH_1(A), & Apos)){
		if (contains) {
			Apos = AD.mGlobals.mOrbitPos.get(A).intValue();
			/* ...if no, note the new stabiliser element */
			if (pos != 0) {
				if (Apos != 0) {
					Permutation.multiplyLeftDivide(S.mG.mN, p, G.mInvPerm[gen], AD.mGlobals.mOrbitElements[pos].mToRoot,AD.mGlobals.mOrbitElements[Apos].mToRoot, h);
				} else {
					Permutation.multiplyInverse(S.mG.mN, p, G.mInvPerm[gen], AD.mGlobals.mOrbitElements[pos].mToRoot, h);
				}
			} else {
				if (Apos != 0) {
					Permutation.multiplyLeftDivide(S.mG.mN, p, G.mInvPerm[gen], AD.mGlobals.mOrbitElements[Apos].mToRoot, h);
				} else {
					Permutation.multiplyInverse(S.mG.mN, p, G.mInvPerm[gen], h);
				}
			}
// #ifdef DOTEST
// 		if (AD.GD.orbspace == AD.GD.orbsize)
// 			globals_enlargen_orbitspace(AD.GD);
// 		antichainList_apply_perm_p1(AD.L.n, AD.L.lev[AD.cl], AD.L.lev[AD.cl+1], h, AD.k,
// 				AD.GD.orb[0].data[0], AD.GD.orb[AD.GD.orbsize].data);
// 		if (antichainList_cmp_p1(AD.GD.orb[0].data[0], AD.GD.orb[AD.GD.orbsize].data[0])) {
// 			/* We don't test here whether the action on the lowest level is correct; this is done
// 			 * in lattice_test after the new lattice is created.
// 			 */
// 			printf("BAD STABILISER ELEMENT [processElement_p1]: ");
// 			perm_print(S.G.n, h, 0);
// 			erri(-4);
// 		}
// #endif
// #ifdef VERBOSE
// 		printf("[processElement_p1]: adding stabiliser generator "); perm_print(S.G.n, h, 0);
// #endif
			if (!Permutation.isIdentity(S.mG.mN, h)) {
				S.addGenerator(h);
			}
		} else {
			AD.mGlobals.mOrbitPos.put(A, (long) Apos);
			/* ...if yes, note the permutation to the root and the applied generator */
			AD.mGlobals.mOrbitElements[AD.mGlobals.mOrbitSize].mGen = gen;
			if (pos != 0) {
				Permutation.multiply(S.mG.mN, p, G.mInvPerm[gen], AD.mGlobals.mOrbitElements[pos].mToRoot, AD.mGlobals.mOrbitElements[AD.mGlobals.mOrbitSize].mToRoot);
			} else {
				Permutation.multiply(S.mG.mN, p, G.mInvPerm[gen], AD.mGlobals.mOrbitElements[AD.mGlobals.mOrbitSize].mToRoot);
			}
			AD.mGlobals.mOrbitSize++;
// #ifdef DOTEST
// 		if (AD.GD.orbspace == AD.GD.orbsize)
// 			globals_enlargen_orbitspace(AD.GD);
// 		antichainList_apply_perm_p1(AD.L.n, AD.L.lev[AD.cl], AD.L.lev[AD.cl+1], AD.GD.orb[AD.GD.orbsize-1].toRoot,
// 				AD.k, AD.GD.orb[AD.GD.orbsize-1].data[0], AD.GD.orb[AD.GD.orbsize].data);
// 		if (antichainList_cmp_p1(AD.GD.orb[0].data[0], AD.GD.orb[AD.GD.orbsize].data[0])) {
// 			/* We don't test here whether the action on the lowest level is correct; this is done
// 			 * in lattice_test after the new lattice is created.
// 			 */
// 			printf("BAD ACTION [processElement_p1]: ");
// 			perm_print(S.G.n, AD.GD.orb[AD.GD.orbsize-1].toRoot, 0);
// 			erri(-4);
// 		}
// #endif
		}
	}


//	/*
//	 * Do the housekeeping for a newly computed orbit element.    Special case of a list of antichains that,
//	 * if packed, fits into (and requires) two long.
//	 *
//	 * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
//	 * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
//	 * on any level precludes any completion of the antichain data on higher levels being canonical.
//	 *
//	 * The points on the lowest level of the new lattice correspond to the antichains in that sequence; if a
//	 * permutation fixes the multiset but permutes its elements, the points of the lowest level of the new
//	 * lattice need to be permuted accordingly to obtain an element of the stabiliser of the new lattice.
//	 */
//	static void processElement_p2(antichaindata AD, permgrp G, permgrpc S, long pos, int gen, int[] p) {
//		long[] A;
//		int Apos;
//		int[] h;
//
//		A = AD.GD.orb[AD.GD.orbsize].data;
//		Apos = AD.GD.orbsize;
//		/* check whether the element is new... */
//		if (hashtable_query_insert_2(AD.GD.orbpos, A, HASH_2(A), & Apos)){
//			/* ...if no, note the new stabiliser element */
//			if (pos != 0) {
//				if (Apos != 0)
//					permutation.perm_mult3_ldiv(S.G.n, p, G.invperm[gen], AD.GD.orb[pos].toRoot,
//						AD.GD.orb[Apos].toRoot, h);
//				else
//					permutation.perm_mult3_inv(S.G.n, p, G.invperm[gen], AD.GD.orb[pos].toRoot, h);
//			} else {
//				if (Apos != 0)
//					permutation.perm_mult_ldiv(S.G.n, p, G.invperm[gen], AD.GD.orb[Apos].toRoot, h);
//				else
//					permutation.perm_mult_inv(S.G.n, p, G.invperm[gen], h);
//			}
//// #ifdef DOTEST
//// 		if (AD.GD.orbspace == AD.GD.orbsize)
//// 			globals_enlargen_orbitspace(AD.GD);
//// 		antichainList_apply_perm_p2(AD.L.n, AD.L.lev[AD.cl], AD.L.lev[AD.cl+1], h, AD.k, AD.GD.orb[0].data,
//// 				AD.GD.orb[AD.GD.orbsize].data);
//// 		if (antichainList_cmp_p2(AD.GD.orb[0].data, AD.GD.orb[AD.GD.orbsize].data)) {
//// 			/* We don't test here whether the action on the lowest level is correct; this is done
//// 			 * in lattice_test after the new lattice is created.
//// 			 */
//// 			printf("BAD STABILISER ELEMENT [processElement_p2]: ");
//// 			perm_print(S.G.n, h, 0);
//// 			erri(-4);
//// 		}
//// #endif
//// #ifdef VERBOSE
//// 		printf("[processElement_p2]: adding stabiliser generator "); perm_print(S.G.n, h, 0);
//// #endif
//			if (!perm_isId(S.G.n, h))
//				permgrpc_addGenerator(S, h);
//		} else{
//			/* ...if yes, note the permutation to the root and the applied generator */
//			AD.GD.orb[AD.GD.orbsize].gen = gen;
//			if (pos)
//				perm_mult3(S.G.n, p, G.invperm[gen], AD.GD.orb[pos].toRoot, AD.GD.orb[AD.GD.orbsize].toRoot);
//			else
//				perm_mult(S.G.n, p, G.invperm[gen], AD.GD.orb[AD.GD.orbsize].toRoot);
//			AD.GD.orbsize++;
//#ifdef DOTEST
//			if (AD.GD.orbspace == AD.GD.orbsize)
//				globals_enlargen_orbitspace(AD.GD);
//			antichainList_apply_perm_p2(AD.L.n, AD.L.lev[AD.cl], AD.L.lev[AD.cl + 1], AD.GD.orb[AD.GD.orbsize - 1].toRoot,
//				AD.k, AD.GD.orb[AD.GD.orbsize - 1].data, AD.GD.orb[AD.GD.orbsize].data);
//			if (antichainList_cmp_p2(AD.GD.orb[0].data, AD.GD.orb[AD.GD.orbsize].data)) {
//				/* We don't test here whether the action on the lowest level is correct; this is done
//				 * in lattice_test after the new lattice is created.
//				 */
//				printf("BAD ACTION [processElement_p2]: ");
//				perm_print(S.G.n, AD.GD.orb[AD.GD.orbsize - 1].toRoot, 0);
//				erri(-4);
//			}
//#endif
//		}
//	}


	/*
	 * Whether the antichain data given by AD may yield a canonical antichain list.  Special case of a single
	 * antichain.
	 *
	 * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
	 * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
	 * on any level precludes any completion of the antichain data on higher levels being canonical.
	 *
	 * The function checks whether the multiset of sets chosen on the current level (AD.O[...] & AD.cmc) is
	 * minimal under the action of the current stabiliser (AD.SD[AD.cl+1].ST).  If yes, and if the antichain
	 * data is not complete (that is, AD.cl > 0]), then the new stabiliser is stored in AD.SD[AD.cl].ST.  If
	 * the antichain data is complete and canonical, AD.SD[0].ST will instead be set to the stabiliser of the
	 * new lattice obtained from the antichain data.  (The points on the lowest (new) level of the new lattice
	 * correspond to the antichains in that sequence; if a permutation fixes the multiset but permutes its
	 * elements, the points of the lowest level of the new lattice need to be permuted accordingly to obtain
	 * an element of the stabiliser of the new lattice.  Additional generators of the stabiliser of the new
	 * lattice are given by all possible permutations of identical antichains, i.e., all possible permutations
	 * of points of the lowest level of the new lattice that have identical covering sets.)
	 */
	static boolean antichaindata_isCanonical_1(Antichain AD) {
		int pos;
		int gen;
		PermGrp G;
		PermGrpC S;

		if (VERBOSE) {
			System.out.println("[entering antichaindata_isCanonical_1]: " + AD.mCl + " " + AD.mStabilisers[AD.mCl + 1].mSt.mN);
			lattice.lattice_print(AD.mLattice);
			AD.printCounters();
		}
		G = AD.mStabilisers[AD.mCl + 1].mSt;
    assert G.mNgens == 0 || (G.mBenesValid & Utils.BIT(AD.mCl)) != 0
			: "ATTEMPTS TO USE INVALID BENEŠ NETWORKS [antichaindata_isCanonical_1]: level " + AD.mCl;
		if (G.mNgens > 0) {
			if ((AD.mGlobals.mOrbitElements[0].mData[0] = (AD.mO[0] & AD.mCmc) >> AD.mLattice.lev[AD.mCl]) != 0) {
				if (AD.mStabilisers[AD.mCl + 1].mSi != 0) {
					/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
					final byte[] p = Permutation.create();
					final long[] L = new long[] {AD.mGlobals.mOrbitElements[0].mData[0]};
					Permutation.init(AD.mLattice.n + AD.mK, p);
					final int[] ugly = new int[] {AD.mStabilisers[AD.mCl].mSi};
					final int xcl = AD.mCl;
					applySI1(AD.mLattice.lev[AD.mCl], AD.mLattice.lev[AD.mCl + 1] - AD.mLattice.lev[AD.mCl], L, AD.mStabilisers[AD.mCl + 1].mSi, ugly, p)	;
					AD.mStabilisers[xcl].mSi = ugly[0];
					if (L[0] != AD.mGlobals.mOrbitElements[0].mData[0]) {
						return false;
					}
					S = AD.ensureStabiliser(AD.mCl);
					AD.mStabilisers[AD.mCl].mSt = S.mG;
					S.init(AD.mLattice.n + AD.mK);
					/* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
					AD.mGlobals.mOrbitSize = 1;
					AD.mGlobals.mOrbitElements[0].mGen = -1;
					//hashtable_clear(AD.GD.orbpos);
					//hashtable_insert_1(AD.GD.orbpos, L, HASH_1(L), 0);
					AD.mGlobals.mOrbitPos.clear();
					AD.mGlobals.mOrbitPos.put(L[0], 0L);
					if (VERBOSE) {
						System.out.println("### hashtable cleared");
						System.out.println("+++ hashtable insert (" + L[0] + "," + 0L + ")");
					}
					//#ifndef HARDCODE_MAXN_22
					if (S.mG.mN > G.mN) {
						for (gen = 0; gen < G.mNgens; gen++) {
							Permutation.resize(G.mN, S.mG.mN, G.mPerm[gen]);
							Permutation.resize(G.mN, S.mG.mN, G.mInvPerm[gen]);
						}
					}
					//#endif
					for (pos = 0; pos < AD.mGlobals.mOrbitSize; pos++) {
						for (gen = 0; gen < G.mNgens; gen++) {
              if ((G.mInvol & Utils.BIT(gen)) != 0 && AD.mGlobals.mOrbitElements[pos].mGen == gen) {
								continue;
							}
							/* apply generator gen to orbit element pos... */
							if (AD.mGlobals.mOrbitSpace == AD.mGlobals.mOrbitSize) {
								AD.mGlobals.enlargenOrbitSpace();
							}
							long[] A = new long[] {AD.mGlobals.mOrbitElements[pos].mData[0]};
              G.mBenes[AD.mCl][gen].applyP1(A);
							Permutation.init(AD.mLattice.n + AD.mK, p);
							applySI1(AD.mLattice.lev[AD.mCl], AD.mLattice.lev[AD.mCl + 1] - AD.mLattice.lev[AD.mCl], A, AD.mStabilisers[AD.mCl + 1].mSi, null, p);
							/* ...we're done if the result is smaller than the original element */
              //	if (A < B)
//		return -1;
//	else if (A > B)
//		return 1;
//	else
//		return 0;
              if (Long.compare(L[0], A[0]) > 0) {
								if (VERBOSE) {
									System.out.println("                                       NOT canonical");
								}
// #ifdef PRINTLARGEORBITS
// 							if (AD.GD.orbsize > LARGEORBITTHRESHOLD)
// 								printf("antichaindata_isCanonical_1: %lu [false]\n", AD.GD.orbsize);
// #endif
								return false;
							}
							/* ...otherwise, do the necessary housekeeping */
							AD.mGlobals.mOrbitElements[AD.mGlobals.mOrbitSize].mData[0] = A[0];
							processElement_p1(AD, G, S, pos, gen, p);
						}
					}
					permgrpc_compactGenerators(S);
				} else {
					/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
					byte[] p = Permutation.create();
					long L;
					L = AD.mGlobals.mOrbitElements[0].mData[0];
					Permutation.init(AD.mLattice.n + AD.mK, p);
					AD.mStabilisers[AD.mCl].mSi = 0;
					S = AD.ensureStabiliser(AD.mCl);
					AD.mStabilisers[AD.mCl].mSt = S.mG;
					S.init(AD.mLattice.n + AD.mK);
					/* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
					AD.mGlobals.mOrbitSize = 1;
					AD.mGlobals.mOrbitElements[0].mGen = -1;
//					hashtable_clear(AD.GD.orbpos);
//					hashtable_insert_1(AD.GD.orbpos, L, HASH_1(L), 0);
					AD.mGlobals.mOrbitPos.clear();
					AD.mGlobals.mOrbitPos.put(L,0L);
					if (VERBOSE) {
						System.out.println("### hashtable cleared");
						System.out.println("+++ hashtable insert (" + L + "," + 0L + ")");
					}
//#ifndef HARDCODE_MAXN_22
					if (S.mG.mN > G.mN) {
						for (gen = 0; gen < G.mNgens; gen++) {
							Permutation.resize(G.mN, S.mG.mN, G.mPerm[gen]);
							Permutation.resize(G.mN, S.mG.mN, G.mInvPerm[gen]);
						}
					}
//#endif
					for (pos = 0; pos < AD.mGlobals.mOrbitSize; pos++) {
						for (gen = 0; gen < G.mNgens; gen++) {
              if ((G.mInvol & Utils.BIT(gen)) != 0 && AD.mGlobals.mOrbitElements[pos].mGen == gen) {
								continue;
							}
							/* apply generator gen to orbit element pos... */
							if (AD.mGlobals.mOrbitSpace == AD.mGlobals.mOrbitSize) {
								AD.mGlobals.enlargenOrbitSpace();
							}
							long[] A = new long[] {AD.mGlobals.mOrbitElements[pos].mData[0]};
              G.mBenes[AD.mCl][gen].applyP1(A);
							Permutation.init(AD.mLattice.n + AD.mK, p);
							/* ...we're done if the result is smaller than the original element */
              //	if (A < B)
//		return -1;
//	else if (A > B)
//		return 1;
//	else
//		return 0;
              if (Long.compare(L, A[0]) > 0) {
								if (VERBOSE) {
									System.out.println("                                       NOT canonical");
								}
// #ifdef PRINTLARGEORBITS
// 							if (AD.GD.orbsize > LARGEORBITTHRESHOLD)
// 								printf("antichaindata_isCanonical_1: %lu [false]\n", AD.GD.orbsize);
// #endif
								return false;
							}
							/* ...otherwise, do the necessary housekeeping */
							AD.mGlobals.mOrbitElements[AD.mGlobals.mOrbitSize].mData[0] = A[0];
							if (AD.mStabilisers[AD.mCl + 1].mSi != 0) {
								processElement_p1(AD, G, S, pos, gen, p);
							} else {
								processElement_1(AD, G, S, pos, gen);
							}
						}
					}
					permgrpc_compactGenerators(S);
				}
			} else { /* as the antichains must intersect the lowest level, AD.cl < AD.L.nLev-2, so G.n == S.n */
				AD.mStabilisers[AD.mCl].mSt = AD.mStabilisers[AD.mCl + 1].mSt;
				AD.mStabilisers[AD.mCl].mSi = AD.mStabilisers[AD.mCl + 1].mSi;
			}
		} else if (AD.mStabilisers[AD.mCl + 1].mSi != 0) {
			if ((AD.mGlobals.mOrbitElements[0].mData[0] = (AD.mO[0] & AD.mCmc) >> AD.mLattice.lev[AD.mCl]) != 0) {
				/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
				byte[] p = Permutation.create();
				long[] L = new long[] { AD.mGlobals.mOrbitElements[0].mData[0]};
				Permutation.init(AD.mLattice.n + AD.mK, p);
				final int[] ugly = new int[] {AD.mStabilisers[AD.mCl].mSi};
				final int xcl = AD.mCl;
				applySI1(AD.mLattice.lev[AD.mCl], AD.mLattice.lev[AD.mCl + 1] - AD.mLattice.lev[AD.mCl], L, AD.mStabilisers[AD.mCl + 1].mSi, ugly, p);
				AD.mStabilisers[xcl].mSi = ugly[0];
				if (L[0] != AD.mGlobals.mOrbitElements[0].mData[0]) {
					return false;
				}
				S = AD.ensureStabiliser(AD.mCl);
				AD.mStabilisers[AD.mCl].mSt = S.mG;
				S.init(AD.mLattice.n + AD.mK);
			} else { /* as the antichains must intersect the lowest level, AD.cl < AD.L.nLev-2, so G.n == S.n */
				AD.mStabilisers[AD.mCl].mSt = AD.mStabilisers[AD.mCl + 1].mSt;
				AD.mStabilisers[AD.mCl].mSi = AD.mStabilisers[AD.mCl + 1].mSi;
			}
		} else {
			//#ifndef FILTER_GRADED
			if (AD.mCl == AD.mLattice.nLev - 2) {
				//#endif
				S = AD.ensureStabiliser(AD.mCl);
				AD.mStabilisers[AD.mCl].mSt = S.mG;
				S.init(AD.mLattice.n + AD.mK);
				//#ifndef FILTER_GRADED
			} else {
				AD.mStabilisers[AD.mCl].mSt = AD.mStabilisers[AD.mCl + 1].mSt;
			}
			//#endif
			AD.mStabilisers[AD.mCl].mSi = AD.mStabilisers[AD.mCl + 1].mSi;
		}
		permgrp_preprocessGenerators(AD);
		if (VERBOSE) {
			System.out.printf("***** level %d:\n", AD.mCl);
			PermGrp.printGenerators(AD.mStabilisers[AD.mCl].mSt, 0);
			System.out.println("                                       canonical");
		}
// #ifdef PRINTLARGEORBITS
// 	if (AD.GD.orbsize > LARGEORBITTHRESHOLD)
// 		printf("antichaindata_isCanonical_1: %lu [true]\n", AD.GD.orbsize);
// #endif
		return true;
	}


	/*
	 * Whether the antichain data given by AD may yield a canonical antichain list.  Special case of a list
	 * that, if packed, fits into one long.
	 *
	 * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
	 * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
	 * on any level precludes any completion of the antichain data on higher levels being canonical.
	 *
	 * The function checks whether the multiset of sets chosen on the current level (AD.O[...] & AD.cmc) is
	 * minimal under the action of the current stabiliser (AD.SD[AD.cl+1].ST and AD.SD[AD.cl+1].SI).  If yes,
	 * and if the antichain data is not complete (that is, AD.cl > 0]), then the new stabiliser is stored in
	 * AD.SD[AD.cl].ST and AD.SD[AD.cl].SI.  If the antichain data is complete and canonical, AD.SD[0].ST and
	 * AD.SD[0].SI will instead be set to the stabiliser of the new lattice obtained from the antichain data.
	 * (The points on the lowest (new) level of the new lattice correspond to the antichains in that sequence;
	 * if a permutation fixes the multiset but permutes its elements, the points of the lowest level of the
	 * new lattice need to be permuted accordingly to obtain an element of the stabiliser of the new lattice.
	 * Additional generators of the stabiliser of the new lattice are given by all possible permutations of
	 * identical antichains, i.e., all possible permutations of points of the lowest level of the new lattice
	 * that have identical covering sets.  The latter may be handled by "implicit" stabilisers.)
	 */
	static boolean isCanonicalP1(Antichain AD, int bits) {
		int i, gen;
		int pos;
		long[] M = new long[Utils.MAXN - 2];
		long mask, pmask;
		PermGrp G;
		PermGrpC S;

		if (VERBOSE) {
			System.out.println("[entering antichaindata_isCanonical_p1]:");
			lattice.lattice_print(AD.mLattice);
			AD.printCounters();
		}
    for (mask = Utils.BIT(bits) - 1, i = AD.mK; i-- != 0; mask <<= bits) {
			M[i] = mask;
		}
		G = AD.mStabilisers[AD.mCl + 1].mSt;
// #ifdef DOTEST
// 	if (G.ngens && !(G.BenesValid & BIT(AD.cl))) {
// 		printf("ATTEMPTS TO USE INVALID BENEŠ NETWORKS [antichaindata_isCanonical_1]: level %d\n", AD.cl);
// 		erri(-4);
// 	}
// #endif
		if (G.mNgens > 0) {
			AD.mGlobals.mOrbitElements[0].mData[0] = 0;
			for (i = 0; i < AD.mK; i++) {
				AD.mGlobals.mOrbitElements[0].mData[0] <<= bits;
				AD.mGlobals.mOrbitElements[0].mData[0] |= (AD.mO[i] & AD.mCmc) >> AD.mLattice.lev[AD.mCl];
			}
			if (AD.mGlobals.mOrbitElements[0].mData[0] != 0) {
				if (AD.mStabilisers[AD.mCl + 1].mSi != 0) {
					/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
					byte[] p = Permutation.create();
					long[] L = new long[] {AD.mGlobals.mOrbitElements[0].mData[0]};
					Permutation.init(AD.mLattice.n + AD.mK, p);
					for (pmask = 1, i = AD.mK; i-- != 0; ) {
						pmask = (pmask << bits) | 1;
					}
					listApplySIP1(AD.mLattice.n, AD.mK, AD.mLattice.lev[AD.mCl], bits, AD.mStabilisers[AD.mCl + 1].mBl, AD.mGlobals, L, AD.mStabilisers[AD.mCl + 1].mSi, pmask, p);
          //	if (A < B)
//		return -1;
//	else if (A > B)
//		return 1;
//	else
//		return 0;
          if (Long.compare(L[0], AD.mGlobals.mOrbitElements[0].mData[0]) != 0) {
						/* determine the position up to which we can backtrack */
						int m, pi;
						long D;
						m = i = 0;
						D = L[0] ^ AD.mGlobals.mOrbitElements[0].mData[0];
						do {
							pi = p[AD.mLattice.n + i] - AD.mLattice.n;
							if (pi > m) {
								m = pi;
							}
						} while ((D & M[i++]) == 0);
						AD.mFpos += m - AD.mCp;
						AD.mCp = m;
						if (VERBOSE) {
							Permutation.print(AD.mLattice.n+AD.mK, p, 0);
							System.out.printf("                                       NOT canonical --> %d\n", AD.mCp);
						}
						return false;
					}
					S = AD.ensureStabiliser(AD.mCl);
					AD.mStabilisers[AD.mCl].mSt = S.mG;
					S.init(AD.mLattice.n + AD.mK);
					AD.mStabilisers[AD.mCl].mSi = AD.mStabilisers[AD.mCl + 1].mSi;
					final int[] ugly = {AD.mStabilisers[AD.mCl].mSi};
					final int xcl = AD.mCl;
					extractStabiliserP1(AD.mLattice.n, AD.mK, AD.mLattice.lev[AD.mCl], AD.mLattice.lev[AD.mCl + 1], AD.mGlobals, S, ugly);
					AD.mStabilisers[xcl].mSi =ugly[0];
					/* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
					AD.mGlobals.mOrbitSize = 1;
					AD.mGlobals.mOrbitElements[0].mGen = -1;
					Permutation.init(S.mG.mN, AD.mGlobals.mOrbitElements[0].mToRoot);
//					hashtable_clear(AD.GD.orbpos);
//					hashtable_insert_1(AD.GD.orbpos, L, HASH_1(L), 0);
					AD.mGlobals.mOrbitPos.clear();
					AD.mGlobals.mOrbitPos.put(L[0], 0L);
					//	#ifndef HARDCODE_MAXN_22
					if (S.mG.mN > G.mN) {
						for (gen = 0; gen < G.mNgens; gen++) {
							Permutation.resize(G.mN, S.mG.mN, G.mPerm[gen]);
							Permutation.resize(G.mN, S.mG.mN, G.mInvPerm[gen]);
						}
					}
					//	#endif
					for (pos = 0; pos < AD.mGlobals.mOrbitSize; pos++) {
						for (gen = 0; gen < G.mNgens; gen++) {
							//int[]  p;
              if ((G.mInvol & Utils.BIT(gen)) != 0 && AD.mGlobals.mOrbitElements[pos].mGen == gen) {
								continue;
							}
							/* apply generator gen to orbit element pos... */
							if (AD.mGlobals.mOrbitSpace == AD.mGlobals.mOrbitSize) {
								AD.mGlobals.enlargenOrbitSpace();
							}
							long[] A = new long[] {AD.mGlobals.mOrbitElements[pos].mData[0]};
              G.mBenes[AD.mCl][gen].applyP1(A);
							//#ifndef FILTER_GRADED
							if (AD.mCl < AD.mLattice.nLev - 2) {
                G.mBenes[AD.mLattice.nLev - 1][gen].applyBlockedP1(A);
							}
							//#endif
							Permutation.init(S.mG.mN, p);
							listApplySIP1(AD.mLattice.n, AD.mK, AD.mLattice.lev[AD.mCl], bits, AD.mStabilisers[AD.mCl + 1].mBl, AD.mGlobals, A, AD.mStabilisers[AD.mCl + 1].mSi, pmask, p);
							/* ...we're done if the result is smaller than the original element */
              //	if (A < B)
//		return -1;
//	else if (A > B)
//		return 1;
//	else
//		return 0;
              if (Long.compare(L[0], A[0]) > 0) {
								/* determine the position up to which we can backtrack */
								int m, pi;
								long D;
								m = i = 0;
								D = L[0] ^ A[0];
								do {
									pi = AD.mGlobals.mOrbitElements[pos].mToRoot[G.mInvPerm[gen][p[AD.mLattice.n + i]]] - AD.mLattice.n;
									if (pi > m) {
										m = pi;
									}
								} while ((D & M[i++]) == 0);
								AD.mFpos += m - AD.mCp;
								AD.mCp = m;
								if (VERBOSE) {
									Permutation.print(S.mG.mN, p, 0);
									System.out.printf("                                       NOT canonical --> %d\n", AD.mCp);
								}
								// #ifdef PRINTLARGEORBITS
								// 						if (AD.GD.orbsize > LARGEORBITTHRESHOLD) {
								// 							printf("antichaindata_isCanonical_p1: %lu [false]\n", AD.GD.orbsize);
								// 							lattice_print(AD.L);
								// 							antichaindata_printCounters(AD);
								// 						}
								// #endif
								return false;
							}
							/* ...otherwise, do the necessary housekeeping */
							AD.mGlobals.mOrbitElements[AD.mGlobals.mOrbitSize].mData[0] = A[0];
							processElement_p1(AD, G, S, pos, gen, p);
						}
					}
					permgrpc_compactGenerators(S);
				} else {
					/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
					byte[] p = Permutation.create();
					long L;
					L = AD.mGlobals.mOrbitElements[0].mData[0];
					Permutation.init(AD.mLattice.n + AD.mK, p);
					S = AD.ensureStabiliser(AD.mCl);
					AD.mStabilisers[AD.mCl].mSt = S.mG;
					S.init(AD.mLattice.n + AD.mK);
					AD.mStabilisers[AD.mCl].mSi = 0;
					/* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
					AD.mGlobals.mOrbitSize = 1;
					AD.mGlobals.mOrbitElements[0].mGen = -1;
					Permutation.init(S.mG.mN, AD.mGlobals.mOrbitElements[0].mToRoot);
//					hashtable_clear(AD.GD.orbpos);
//					hashtable_insert_1(AD.GD.orbpos, L, HASH_1(L), 0);
					AD.mGlobals.mOrbitPos.clear();
					AD.mGlobals.mOrbitPos.put(L, 0L);
					//	#ifndef HARDCODE_MAXN_22
					if (S.mG.mN > G.mN) {
						for (gen = 0; gen < G.mNgens; gen++) {
							Permutation.resize(G.mN, S.mG.mN, G.mPerm[gen]);
							Permutation.resize(G.mN, S.mG.mN, G.mInvPerm[gen]);
						}
					}
					//	#endif
					for (pos = 0; pos < AD.mGlobals.mOrbitSize; pos++) {
						for (gen = 0; gen < G.mNgens; gen++) {
							//int[]  p;
              if ((G.mInvol & Utils.BIT(gen)) != 0 && AD.mGlobals.mOrbitElements[pos].mGen == gen) {
								continue;
							}
							/* apply generator gen to orbit element pos... */
							if (AD.mGlobals.mOrbitSpace == AD.mGlobals.mOrbitSize) {
								AD.mGlobals.enlargenOrbitSpace();
							}
							long[] A = new long[] {AD.mGlobals.mOrbitElements[pos].mData[0]};
              G.mBenes[AD.mCl][gen].applyP1(A);
							//#ifndef FILTER_GRADED
							if (AD.mCl < AD.mLattice.nLev - 2) {
                G.mBenes[AD.mLattice.nLev - 1][gen].applyBlockedP1(A);
							}
							//#endif
							Permutation.init(S.mG.mN, p);
							sortP1(bits, M, AD.mStabilisers[AD.mCl + 1].mBl, A, p, AD.mLattice.n);
							/* ...we're done if the result is smaller than the original element */
              //	if (A < B)
//		return -1;
//	else if (A > B)
//		return 1;
//	else
//		return 0;
              if (Long.compare(L, A[0]) > 0) {
								/* determine the position up to which we can backtrack */
								int m, pi;
								long D;
								m = i = 0;
								D = L ^ A[0];
								do {
									pi = AD.mGlobals.mOrbitElements[pos].mToRoot[G.mInvPerm[gen][p[AD.mLattice.n + i]]] - AD.mLattice.n;
									if (pi > m) {
										m = pi;
									}
								} while ((D & M[i++]) == 0);
								AD.mFpos += m - AD.mCp;
								AD.mCp = m;
								if (VERBOSE) {
									Permutation.print(S.mG.mN, p, 0);
									System.out.printf("                                       NOT canonical --> %d\n", AD.mCp);
								}
								// #ifdef PRINTLARGEORBITS
								// 						if (AD.GD.orbsize > LARGEORBITTHRESHOLD) {
								// 							printf("antichaindata_isCanonical_p1: %lu [false]\n", AD.GD.orbsize);
								// 							lattice_print(AD.L);
								// 							antichaindata_printCounters(AD);
								// 						}
								// #endif
								return false;
							}
							/* ...otherwise, do the necessary housekeeping */
							AD.mGlobals.mOrbitElements[AD.mGlobals.mOrbitSize].mData[0] = A[0];
							processElement_p1(AD, G, S, pos, gen, p);
						}
					}
					permgrpc_compactGenerators(S);
				}
			} else { /* as the antichains must intersect the lowest level, AD.cl < AD.L.nLev-2 */
				AD.mStabilisers[AD.mCl].mSt = AD.mStabilisers[AD.mCl + 1].mSt;
				AD.mStabilisers[AD.mCl].mSi = AD.mStabilisers[AD.mCl + 1].mSi;
			}
		} else if (AD.mStabilisers[AD.mCl + 1].mSi != 0) {
			AD.mGlobals.mOrbitElements[0].mData[0] = 0;
			for (i = 0; i < AD.mK; i++) {
				AD.mGlobals.mOrbitElements[0].mData[0] <<= bits;
				AD.mGlobals.mOrbitElements[0].mData[0] |= (AD.mO[i] & AD.mCmc) >> AD.mLattice.lev[AD.mCl];
			}
			if (AD.mGlobals.mOrbitElements[0].mData[0] != 0) {
				/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
				byte[] p = Permutation.create();
				long[] L = new long[] {AD.mGlobals.mOrbitElements[0].mData[0]};
				Permutation.init(AD.mLattice.n + AD.mK, p);
				for (pmask = 1, i = AD.mK; i-- != 0; ) {
					pmask = (pmask << bits) | 1;
				}
				listApplySIP1(AD.mLattice.n, AD.mK, AD.mLattice.lev[AD.mCl], bits, AD.mStabilisers[AD.mCl + 1].mBl, AD.mGlobals, L, AD.mStabilisers[AD.mCl + 1].mSi, pmask, p);
        //	if (A < B)
//		return -1;
//	else if (A > B)
//		return 1;
//	else
//		return 0;
        if (Long.compare(L[0], AD.mGlobals.mOrbitElements[0].mData[0]) != 0) {
					/* determine the position up to which we can backtrack */
					int m, pi;
					long D;
					m = i = 0;
					D = L[0] ^ AD.mGlobals.mOrbitElements[0].mData[0];
					do {
						pi = p[AD.mLattice.n + i] - AD.mLattice.n;
						if (pi > m) {
							m = pi;
						}
					} while ((D & M[i++]) == 0);
					AD.mFpos += m - AD.mCp;
					AD.mCp = m;
					if (VERBOSE) {
						Permutation.print(AD.mLattice.n+AD.mK, p, 0);
						System.out.printf("                                       NOT canonical --> %d\n", AD.mCp);
					}
					return false;
				}
				S = AD.ensureStabiliser(AD.mCl);
				AD.mStabilisers[AD.mCl].mSt = S.mG;
				S.init(AD.mLattice.n + AD.mK);
				AD.mStabilisers[AD.mCl].mSi = AD.mStabilisers[AD.mCl + 1].mSi;
				final int[] ugly = new int[] {AD.mStabilisers[AD.mCl].mSi};
				final int xcl = AD.mCl;
				extractStabiliserP1(AD.mLattice.n, AD.mK, AD.mLattice.lev[AD.mCl], AD.mLattice.lev[AD.mCl + 1], AD.mGlobals, S, ugly);
				AD.mStabilisers[xcl].mSi = ugly[0];
				permgrpc_compactGenerators(S);
			} else { /* as the antichains must intersect the lowest level, AD.cl < AD.L.nLev-2 */
				AD.mStabilisers[AD.mCl].mSt = AD.mStabilisers[AD.mCl + 1].mSt;
				AD.mStabilisers[AD.mCl].mSi = AD.mStabilisers[AD.mCl + 1].mSi;
			}
		} else {
			//#ifndef FILTER_GRADED
			if (AD.mCl == AD.mLattice.nLev - 2) {
				//#endif
				S = AD.ensureStabiliser(AD.mCl);
				AD.mStabilisers[AD.mCl].mSt = S.mG;
				S.init(AD.mLattice.n + AD.mK);
				//#ifndef FILTER_GRADED
			} else {
				AD.mStabilisers[AD.mCl].mSt = AD.mStabilisers[AD.mCl + 1].mSt;
			}
			//#endif
			AD.mStabilisers[AD.mCl].mSi = AD.mStabilisers[AD.mCl + 1].mSi;
		}
//#ifndef FILTER_GRADED
		if (AD.mCl == 0) {
//#endif
			final int[] ugly = new int[] {AD.mStabilisers[0].mBl}; // todo yuck
			AD.updateBlocks(AD.mStabilisers[1].mBl, ugly);
			AD.mStabilisers[0].mBl = ugly[0];
			AD.mStabilisers[0].mSi |= AD.mStabilisers[0].mBl << AD.mLattice.n;
//#ifndef FILTER_GRADED
		}
//#endif
		permgrp_preprocessGenerators_blocked(AD);
		if (VERBOSE) {
			System.out.printf("***** level %d:\n", AD.mCl);
			PermGrp.printGenerators(AD.mStabilisers[AD.mCl].mSt, 0);
			System.out.println("                                       canonical");
		}
// #ifdef PRINTLARGEORBITS
// 	if (AD.GD.orbsize > LARGEORBITTHRESHOLD) {
// 		printf("antichaindata_isCanonical_p1: %lu [true]\n", AD.GD.orbsize);
// 		lattice_print(AD.L);
// 		antichaindata_printCounters(AD);
// 	}
// #endif
		return true;
	}


//	/*
//	 * Whether the antichain data given by AD may yield a canonical antichain list.  Special case of a list
//	 * that, if packed, fits into (and requires) two long.
//	 *
//	 * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
//	 * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
//	 * on any level precludes any completion of the antichain data on higher levels being canonical.
//	 *
//	 * The function checks whether the multiset of sets chosen on the current level (AD.O[...] & AD.cmc) is
//	 * minimal under the action of the current stabiliser (AD.SD[AD.cl+1].ST and AD.SD[AD.cl+1].SI).  If yes,
//	 * and if the antichain data is not complete (that is, AD.cl > 0]), then the new stabiliser is stored in
//	 * AD.SD[AD.cl].ST and AD.SD[AD.cl].SI.  If the antichain data is complete and canonical, AD.SD[0].ST and
//	 * AD.SD[0].SI will instead be set to the stabiliser of the new lattice obtained from the antichain data.
//	 * (The points on the lowest (new) level of the new lattice correspond to the antichains in that sequence;
//	 * if a permutation fixes the multiset but permutes its elements, the points of the lowest level of the
//	 * new lattice need to be permuted accordingly to obtain an element of the stabiliser of the new lattice.
//	 * Additional generators of the stabiliser of the new lattice are given by all possible permutations of
//	 * identical antichains, i.e., all possible permutations of points of the lowest level of the new lattice
//	 * that have identical covering sets.  The latter may be handled by "implicit" stabilisers.)
//	 */
//	static boolean antichaindata_isCanonical_p2(antichaindata AD, int bits) {
//		int i, gen, apf;
//		int pos;
//		//long[]       M0;
//		long[] M1 = new long[Constants.MAXN - 2];
//		long mask, pmask;
//		permgrp G;
//		permgrpc S;
//
//// #if defined TEST_P2_16 || defined TEST_P2_32
//// 	static long hitcount = 0;
//// 	printf("antichaindata_isCanonical_p2 hitcount: %lu\n", ++hitcount);
//// #endif
//// #ifdef VERBOSE
//// 	printf("[entering antichaindata_isCanonical_p2]:\n"); lattice_print(AD.L); antichaindata_printCounters(AD);
//// #endif
//		apf = Long.SIZE / bits;
//		for (mask = BIT(bits) - 1, i = apf; i-- != 0; mask <<= bits)
//			M1[i] = mask;
//		//M0 = M1 + 2*apf-AD.k;
//		int offset = 2 * apf - AD.k;
//		G = AD.SD[AD.cl + 1].ST;
//// #ifdef DOTEST
//// 	if (G.ngens && !(G.BenesValid & BIT(AD.cl))) {
//// 		printf("ATTEMPTS TO USE INVALID BENEŠ NETWORKS [antichaindata_isCanonical_1]: level %d\n", AD.cl);
//// 		erri(-4);
//// 	}
//// #endif
//		if (G.ngens > 0) {
//			AD.GD.orb[0].data[0] = AD.GD.orb[0].data[1] = 0;
//			for (i = 0; i < AD.k - apf; i++) {
//				AD.GD.orb[0].data[0] <<= bits;
//				AD.GD.orb[0].data[0] |= (AD.O[i] & AD.cmc) >> AD.L.lev[AD.cl];
//			}
//			for (; i < AD.k; i++) {
//				AD.GD.orb[0].data[1] <<= bits;
//				AD.GD.orb[0].data[1] |= (AD.O[i] & AD.cmc) >> AD.L.lev[AD.cl];
//			}
//			if (AD.GD.orb[0].data[0] != 0 || AD.GD.orb[0].data[1] != 0) {
//				if (AD.SD[AD.cl + 1].SI != 0) {
//					/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
//					int[] p;
//					long[] L = new long[2];
//					L[0] = AD.GD.orb[0].data[0];
//					L[1] = AD.GD.orb[0].data[1];
//					permutation.perm_init(AD.L.n + AD.k, p);
//					for (pmask = 1, i = apf; i-- != 0; )
//						pmask = (pmask << bits) | 1;
//					antichainList_applySI_p2(AD.L.n, AD.k, apf, AD.L.lev[AD.cl], bits, AD.SD[AD.cl + 1].bl, AD.GD, L,
//						AD.SD[AD.cl + 1].SI, pmask, p);
//					if (antichainList_cmp_p2(L, AD.GD.orb[0].data) != 0) {
//						/* determine the position up to which we can backtrack */
//						int m, pi;
//						long D;
//						boolean found;
//						m = i = 0;
//						D = L[0] ^ AD.GD.orb[0].data[0];
//						do {
//							pi = p[AD.L.n + i] - AD.L.n;
//							if (pi > m)
//								m = pi;
//						} while (!((found = (D & M1[offset + i]) != 0)) && (++i < AD.k - apf));
//						if (!found) {
//							D = L[1] ^ AD.GD.orb[0].data[1];
//							do {
//								pi = p[AD.L.n + i] - AD.L.n;
//								if (pi > m)
//									m = pi;
//							} while ((D & M1[(i++) - (AD.k - apf)]) == 0);
//						}
//						AD.Fpos += m - AD.cp;
//						AD.cp = m;
//// #ifdef VERBOSE
//// 					perm_print(AD.L.n+AD.k, p, 0);
//// 					printf("                                       NOT canonical --> %d\n", AD.cp);
//// #endif
//						return false;
//					}
//					S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
//					AD.SD[AD.cl].ST = S.G;
//					permgrp.permgrpc_init(S, AD.L.n + AD.k);
//					AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
//					final int[] ugly = new int[] {AD.SD[AD.cl].SI};
//					antichainList_extractStabiliser_p2(AD.L.n, AD.k, AD.L.lev[AD.cl], AD.L.lev[AD.cl + 1], AD.GD, S, ugly, L);
//					AD.SD[AD.cl].SI = ugly[0];
//					/* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
//					AD.GD.orbsize = 1;
//					AD.GD.orb[0].gen = -1;
//					permutation.perm_init(S.G.n, AD.GD.orb[0].toRoot);
//					hashtable_clear(AD.GD.orbpos);
//					hashtable_insert_2(AD.GD.orbpos, L, HASH_2(L), 0);
//					//#ifndef HARDCODE_MAXN_22
//					if (S.G.n > G.n)
//						for (gen = 0; gen < G.ngens; gen++) {
//							permutation.perm_resize(G.n, S.G.n, G.perm[gen]);
//							permutation.perm_resize(G.n, S.G.n, G.invperm[gen]);
//						}
//					//#endif
//					for (pos = 0; pos < AD.GD.orbsize; pos++) {
//						for (gen = 0; gen < G.ngens; gen++) {
//							long[] A = new long[2];
//							//int[]  p;
//							if ((G.invol & BIT(gen)) != 0 && AD.GD.orb[pos].gen == gen)
//								continue;
//							/* apply generator gen to orbit element pos... */
//							if (AD.GD.orbspace == AD.GD.orbsize)
//								Globals.globals_enlargen_orbitspace(AD.GD);
//							A[0] = L[0];
//							A[1] = L[1];
//							Benes.benes_apply_p2(G.benes[AD.cl][gen], A);
//							//#ifndef FILTER_GRADED
//							if (AD.cl < AD.L.nLev - 2)
//								Benes.benes_apply_blocked_p2(G.benes[AD.L.nLev - 1][gen], A, apf * bits);
//							//#endif
//							permutation.perm_init(S.G.n, p);
//							antichainList_applySI_p2(AD.L.n, AD.k, apf, AD.L.lev[AD.cl], bits, AD.SD[AD.cl + 1].bl, AD.GD, A,
//								AD.SD[AD.cl + 1].SI, pmask, p);
//							/* ...we're done if the result is smaller than the original element */
//							if (antichainList_cmp_p2(L, A) > 0) {
//								/* determine the position up to which we can backtrack */
//								int m, pi;
//								long D;
//								boolean found;
//								m = i = 0;
//								D = L[0] ^ A[0];
//								do {
//									pi = AD.GD.orb[pos].toRoot[G.invperm[gen][p[AD.L.n + i]]] - AD.L.n;
//									if (pi > m)
//										m = pi;
//								} while (!((found = (D & M1[offset + i]) != 0)) && (++i < AD.k - apf));
//								if (!found) {
//									D = L[1] ^ A[1];
//									do {
//										pi = AD.GD.orb[pos].toRoot[G.invperm[gen][p[AD.L.n + i]]] - AD.L.n;
//										if (pi > m)
//											m = pi;
//									} while ((D & M1[(i++) - (AD.k - apf)]) == 0);
//								}
//								AD.Fpos += m - AD.cp;
//								AD.cp = m;
//// #ifdef VERBOSE
//// 							printf("                                       NOT canonical\n");
//// #endif
//// #ifdef PRINTLARGEORBITS
//// 							if (AD.GD.orbsize > LARGEORBITTHRESHOLD) {
//// 								printf("antichaindata_isCanonical_p2: %lu [false]\n", AD.GD.orbsize);
//// 								lattice_print(AD.L);
//// 								antichaindata_printCounters(AD);
//// 							}
//// #endif
//								return false;
//							}
//							/* ...otherwise, do the necessary housekeeping */
//							AD.GD.orb[AD.GD.orbsize].data[0] = A[0];
//							AD.GD.orb[AD.GD.orbsize].data[1] = A[1];
//							processElement_p2(AD, G, S, pos, gen, p);
//						}
//					}
//					permgrpc_compactGenerators(S);
//				} else {
//					/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
//					int[] p;
//					long[] L = new long[2];
//					L[0] = AD.GD.orb[0].data[0];
//					L[1] = AD.GD.orb[0].data[1];
//					permutation.perm_init(AD.L.n + AD.k, p);
//
//					S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
//					AD.SD[AD.cl].ST = S.G;
//					permgrp.permgrpc_init(S, AD.L.n + AD.k);
//					AD.SD[AD.cl].SI = 0;
//					/* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
//					AD.GD.orbsize = 1;
//					AD.GD.orb[0].gen = -1;
//					permutation.perm_init(S.G.n, AD.GD.orb[0].toRoot);
//					hashtable_clear(AD.GD.orbpos);
//					hashtable_insert_2(AD.GD.orbpos, L, HASH_2(L), 0);
//					//#ifndef HARDCODE_MAXN_22
//					if (S.G.n > G.n)
//						for (gen = 0; gen < G.ngens; gen++) {
//							permutation.perm_resize(G.n, S.G.n, G.perm[gen]);
//							permutation.perm_resize(G.n, S.G.n, G.invperm[gen]);
//						}
//					//#endif
//					for (pos = 0; pos < AD.GD.orbsize; pos++) {
//						for (gen = 0; gen < G.ngens; gen++) {
//							long[] A = new long[2];
//							//int[]  p;
//							if ((G.invol & BIT(gen)) != 0 && AD.GD.orb[pos].gen == gen)
//								continue;
//							/* apply generator gen to orbit element pos... */
//							if (AD.GD.orbspace == AD.GD.orbsize)
//								Globals.globals_enlargen_orbitspace(AD.GD);
//							A[0] = L[0];
//							A[1] = L[1];
//							Benes.benes_apply_p2(G.benes[AD.cl][gen], A);
//							//#ifndef FILTER_GRADED
//							if (AD.cl < AD.L.nLev - 2)
//								Benes.benes_apply_blocked_p2(G.benes[AD.L.nLev - 1][gen], A, apf * bits);
//							//#endif
//							permutation.perm_init(S.G.n, p);
//							// todo todo M0 below should by &M1[offset]
//							antichainList_sort_p2(AD.k, bits, AD.k - apf, M0, M1, AD.SD[AD.cl + 1].bl, A, p, AD.L.n);
//							/* ...we're done if the result is smaller than the original element */
//							if (antichainList_cmp_p2(L, A) > 0) {
//								/* determine the position up to which we can backtrack */
//								int m, pi;
//								long D;
//								boolean found;
//								m = i = 0;
//								D = L[0] ^ A[0];
//								do {
//									pi = AD.GD.orb[pos].toRoot[G.invperm[gen][p[AD.L.n + i]]] - AD.L.n;
//									if (pi > m)
//										m = pi;
//								} while (!((found = (D & M1[offset + i]) != 0)) && (++i < AD.k - apf));
//								if (!found) {
//									D = L[1] ^ A[1];
//									do {
//										pi = AD.GD.orb[pos].toRoot[G.invperm[gen][p[AD.L.n + i]]] - AD.L.n;
//										if (pi > m)
//											m = pi;
//									} while ((D & M1[(i++) - (AD.k - apf)]) == 0);
//								}
//								AD.Fpos += m - AD.cp;
//								AD.cp = m;
//// #ifdef VERBOSE
//// 							printf("                                       NOT canonical\n");
//// #endif
//// #ifdef PRINTLARGEORBITS
//// 							if (AD.GD.orbsize > LARGEORBITTHRESHOLD) {
//// 								printf("antichaindata_isCanonical_p2: %lu [false]\n", AD.GD.orbsize);
//// 								lattice_print(AD.L);
//// 								antichaindata_printCounters(AD);
//// 							}
//// #endif
//								return false;
//							}
//							/* ...otherwise, do the necessary housekeeping */
//							AD.GD.orb[AD.GD.orbsize].data[0] = A[0];
//							AD.GD.orb[AD.GD.orbsize].data[1] = A[1];
//							processElement_p2(AD, G, S, pos, gen, p);
//						}
//					}
//					permgrpc_compactGenerators(S);
//				}
//			} else { /* as the antichains must intersect the lowest level, AD.cl < AD.L.nLev-2 */
//				AD.SD[AD.cl].ST = AD.SD[AD.cl + 1].ST;
//				AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
//			}
//		} else if (AD.SD[AD.cl + 1].SI != 0) {
//			AD.GD.orb[0].data[0] = AD.GD.orb[0].data[1] = 0;
//			apf = Long.SIZE / bits;
//			for (i = 0; i < AD.k - apf; i++) {
//				AD.GD.orb[0].data[0] <<= bits;
//				AD.GD.orb[0].data[0] |= (AD.O[i] & AD.cmc) >> AD.L.lev[AD.cl];
//			}
//			for (; i < AD.k; i++) {
//				AD.GD.orb[0].data[1] <<= bits;
//				AD.GD.orb[0].data[1] |= (AD.O[i] & AD.cmc) >> AD.L.lev[AD.cl];
//			}
//			if (AD.GD.orb[0].data[0] != 0 || AD.GD.orb[0].data[1] != 0) {
//				/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
//				int[] p;
//				long[] L = new long[2];
//				L[0] = AD.GD.orb[0].data[0];
//				L[1] = AD.GD.orb[0].data[1];
//				permutation.perm_init(AD.L.n + AD.k, p);
//				for (pmask = 1, i = apf; i-- != 0; )
//					pmask = (pmask << bits) | 1;
//				antichainList_applySI_p2(AD.L.n, AD.k, apf, AD.L.lev[AD.cl], bits, AD.SD[AD.cl + 1].bl, AD.GD, L,
//					AD.SD[AD.cl + 1].SI, pmask, p);
//				if (antichainList_cmp_p2(L, AD.GD.orb[0].data) != 0) {
//					/* determine the position up to which we can backtrack */
//					int m, pi;
//					long D;
//					boolean found;
//					m = i = 0;
//					D = L[0] ^ AD.GD.orb[0].data[0];
//					do {
//						pi = p[AD.L.n + i] - AD.L.n;
//						if (pi > m)
//							m = pi;
//					} while (!((found = (D & M1[offset + i]) != 0)) && (++i < AD.k - apf));
//					if (!found) {
//						D = L[1] ^ AD.GD.orb[0].data[1];
//						do {
//							pi = p[AD.L.n + i] - AD.L.n;
//							if (pi > m)
//								m = pi;
//						} while ((D & M1[(i++) - (AD.k - apf)]) == 0);
//					}
//					AD.Fpos += m - AD.cp;
//					AD.cp = m;
//// #ifdef VERBOSE
//// 				perm_print(AD.L.n+AD.k, p, 0);
//// 				printf("                                       NOT canonical --> %d\n", AD.cp);
//// #endif
//					return false;
//				}
//				S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
//				AD.SD[AD.cl].ST = S.G;
//				permgrp.permgrpc_init(S, AD.L.n + AD.k);
//				AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
//				antichainList_extractStabiliser_p2(AD.L.n, AD.k, AD.L.lev[AD.cl], AD.L.lev[AD.cl + 1], AD.GD,
//					S, & (AD.SD[AD.cl].SI), L);
//				permgrpc_compactGenerators(S);
//			} else { /* as the antichains must intersect the lowest level, AD.cl < AD.L.nLev-2 */
//				AD.SD[AD.cl].ST = AD.SD[AD.cl + 1].ST;
//				AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
//			}
//		} else {
//			//#ifndef FILTER_GRADED
//			if (AD.cl == AD.L.nLev - 2) {
//				//#endif
//				S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
//				AD.SD[AD.cl].ST = S.G;
//				permgrp.permgrpc_init(S, AD.L.n + AD.k);
//				//#ifndef FILTER_GRADED
//			} else {
//				AD.SD[AD.cl].ST = AD.SD[AD.cl + 1].ST;
//			}
//			//#endif
//			AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
//		}
////#ifndef FILTER_GRADED
//		if (AD.cl == 0) {
////#endif
//			final int[] ugly = new int[] {AD.SD[0].bl};
//			antichain.antichaindata_updateBlocks(AD, AD.SD[1].bl, ugly);
//			AD.SD[0].bl = ugly[0];
//			AD.SD[0].SI |= AD.SD[0].bl << AD.L.n;
////#ifndef FILTER_GRADED
//		}
////#endif
//		permgrp_preprocessGenerators_blocked(AD);
//// #ifdef VERBOSE
//// 	printf("***** level %d:\n", AD.cl);
//// 	permgrp_printGenerators(AD.SD[AD.cl].ST, 0);
//// 	printf("                                       canonical\n");
//// #endif
//// #ifdef PRINTLARGEORBITS
//// 	if (AD.GD.orbsize > LARGEORBITTHRESHOLD) {
//// 		printf("antichaindata_isCanonical_p2: %lu [false]\n", AD.GD.orbsize);
//// 		lattice_print(AD.L);
//// 		antichaindata_printCounters(AD);
//// 	}
//// #endif
//		return true;
//	}
}
