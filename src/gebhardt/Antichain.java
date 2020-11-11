package gebhardt;

import java.util.Arrays;

/**
 * Antichain.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
class Antichain {
  /*
   * antichain.c
   *
   * Created on: 22 Mar 2014
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

  /* We enumerate lists of k lattice-antichains by enumerating lists of k up-closed sets
   * satisfying the lattice-antichain condition.
   *
   * Lattice:
   *    lattice*   L            -- the underlying lattice
   *
   * Pointer to the process'/thread's global data:
   *    Globals   GD
   *
   * Additional lattice-antichain data:
   *    int         k            -- number of elements to be constructed on the new level
   *    int         cp           -- current position for construction
   *    int         cl           -- current level of construction
   *    int     cmc          -- mask for the elements on the current level
   *    int     cm           -- mask for the elements on or below the current level
   *    int     cop[MAXN-3]  -- cop[i] & BIT[j] indicates whether i \meet j = 0
   *    stabiliser  SD[MAXN-2]   -- stabiliser data for each level; see below
   *    int         Fpos         -- current position in the array F; Fpos=(nLev-2-cl)*k+cp
   *    int     O[MAXN-3]    -- O[j]: all (optional) elements chosen for antichain j (on any level!)
   *    int     F[FSIZE]     -- F[(nLev-2-i)*k+j]: all elements for antichain j forced by choice on
   *                                  levels i, i+1,...,nLev-2
   *
   * Stabiliser data:
   *    permgrpc*  ST_  -- space for constructing stabilisers of (partial) antichain configurations
   *    permgrp*   ST   -- indirection to ST_[i].G (without reference count); ST[nLev-1] points to stabiliser of L
   *    int    SI   -- SI[i] & BIT[j] iff (j-1 j) stabilises L and the antichains on levels >= i
   *    int    bl   -- bl[i] & BIT[j] indicates whether the restrictions to levels >= i of the up-closed sets
   *                          at positions j-1 and j are identical
   */

  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));

  static class Stabiliser {
    PermGrpC mStC;
    PermGrp mSt;
    int mSi;
    int mBl;
  }

  static class AntichainData {
    lattice mLattice;
    Globals mGlobals;
    final int[] mCop = new int[Utils.MAXN - 3];
    int mK;
    int mCl;
    int mCmc;
    int mCm;
    final Stabiliser[] mStabilisers = new Stabiliser[Utils.MAXN - 2];
    int mCp;
    int mFpos;
    final int[] mO = new int[Utils.MAXN - 3];
    final int[] mF = new int[Utils.FSIZE];
    {
      for (int k = 0; k < mStabilisers.length; ++k) {
        mStabilisers[k] = new Stabiliser();
      }
    }
  }


  /*
   * Ensure that the stabiliser AD.SD[lev].ST_ exists, and return AD.SD[lev].ST_.
   */
  static PermGrpC antichaindata_ensureStabiliser(AntichainData AD, int lev) {
    if (AD.mStabilisers[lev].mStC == null) {
      AD.mStabilisers[lev].mStC = new PermGrpC();
    }
    return AD.mStabilisers[lev].mStC;
  }


  /*
   * Free dynamically allocated memory; calls to antichaindata_init and antichaindata_clear should match.
   */
  static void antichaindata_clear(AntichainData AD) {
    //#ifndef FILTER_GRADED
    int i;

    for (i = 0; i < AD.mLattice.nLev - 1; i++) {
      if (i < AD.mStabilisers.length && AD.mStabilisers[i].mStC != null) {  // todo SAI added first condition BUG?
//        PermGrp.permgrpc_delete(AD.SD[i].ST_);
      }
    }
// #else
// 	if (AD.SD[0].ST_)
// 				permgrpc_delete(AD.SD[0].ST_);
// #endif
  }


  /*
   *  Given a partition P of elements, return in *Q a refinement of P such that the optional
   *  choices on the current level of AD are constant on every element of *Q.
   */
  static void antichaindata_updateBlocks(AntichainData AD, int P, int[] Q) {
    int B;
    int[] i = new int[1];

    B = Q[0] = P;
    while (Utils.getLSB32(B, i)) {
      B ^= Utils.BIT(i[0]);  /* bit i is set, so this clears it */
      if (((AD.mO[i[0] - 1] ^ AD.mO[i[0]]) & AD.mCmc) != 0) {
        Q[0] ^= Utils.BIT(i[0]);  /* bit i is set, so this clears it */
      }
    }
  }


  /*
   * Increment the current level of *AD.
   */
  static void antichaindata_incrementLevel(AntichainData AD) {
    (AD.mCl)++;
    AD.mFpos--;
    AD.mCmc = (int) (Utils.BIT(AD.mLattice.lev[AD.mCl + 1]) - Utils.BIT(AD.mLattice.lev[AD.mCl]));
    AD.mCm = (int) (Utils.BIT(AD.mLattice.n) - Utils.BIT(AD.mLattice.lev[AD.mCl]));
    AD.mCp = AD.mK - 1;
  }


  /*
   * Increment the current level of *AD.
   */
  static void antichaindata_incrementLevel_1(AntichainData AD) {
    (AD.mCl)++;
    AD.mFpos--;
    AD.mCmc = (int) (Utils.BIT(AD.mLattice.lev[AD.mCl + 1]) - Utils.BIT(AD.mLattice.lev[AD.mCl]));
    AD.mCm = (int) (Utils.BIT(AD.mLattice.n) - Utils.BIT(AD.mLattice.lev[AD.mCl]));
  }


  /*
   * If possible, step antichaindata counter for the current position.  The lattice-antichain condition
   * is NOT verified.
   *
   * Return value: true if success; false if there are no further useful configurations.
   */
  static boolean antichaindata_stepCurrentPosition(AntichainData AD) {
    int W, nW;
    int F1pos;

    if ((AD.mO[AD.mCp] & AD.mCmc) == 0) {
      return false;
    }

    AD.mO[AD.mCp] -= Utils.BIT(AD.mLattice.lev[AD.mCl]);
    if ((F1pos = AD.mFpos - AD.mK) >= 0) {
      AD.mO[AD.mCp] &= ~(AD.mF[F1pos] & AD.mCmc);
      W = (AD.mF[F1pos] | AD.mO[AD.mCp]) & AD.mCm;
      if (AD.mCp != 0) {
        nW = (AD.mF[F1pos - 1] | AD.mO[AD.mCp - 1]) & AD.mCm;
      } else {
        nW = (int) ((AD.mLattice.up[AD.mLattice.n - 1] & AD.mCm) ^ Utils.BIT(AD.mLattice.n - 1));
      }
    } else {
      W = AD.mO[AD.mCp];
      if (AD.mCp != 0) {
        nW = AD.mO[AD.mCp - 1];
      } else {
        nW = (int) ((AD.mLattice.up[AD.mLattice.n - 1] & AD.mCm) ^ Utils.BIT(AD.mLattice.n - 1));
      }
    }

    /* We only want antichains that have a weight no less than the weight of the preceding
     * element, and that intersect the lowest level of the old lattice.                    */
    if (Integer.compare(W, nW) < 0 || W == 0)  /* catches antichains not intersecting the lowest level, i.e. */ {
      return false;                   /* AD.cl == AD.L.nLev-2 && !(AD.O[AD.cp] & AD.cm)       */
    }

    return true;
  }


  /*
   * If possible, step antichaindata counter for the current position.  The lattice-antichain condition
   * is NOT verified.  Special case of a single antichain.
   *
   * Return value: true if success; false if there are no further useful configurations.
   */
  static boolean antichaindata_stepCurrentPosition_1(AntichainData AD) {
    int W, nW;

    if ((AD.mO[0] & AD.mCmc) == 0) {
      return false;
    }

    AD.mO[0] -= Utils.BIT(AD.mLattice.lev[AD.mCl]);
    if (AD.mFpos != 0) {
      AD.mO[0] &= ~(AD.mF[AD.mFpos - 1] & AD.mCmc);
      W = (AD.mF[AD.mFpos - 1] | AD.mO[0]) & AD.mCm;
    } else {
      W = AD.mO[0];
    }

    /* We only want antichains that have a weight no less than the weight of the preceding element. */
    nW = (int) ((AD.mLattice.up[AD.mLattice.n - 1] & AD.mCm) ^ Utils.BIT(AD.mLattice.n - 1));
    if (Integer.compare(W, nW) < 0 || W == 0)    /* catches antichains not intersecting the lowest level, i.e. */ {
      return false;                     /* AD.cl == AD.L.nLev-2 && !(AD.O[0] & AD.cm)            */
    }

    return true;
  }


  /*
   * If possible, step antichaindata counters starting from the current on the current level.
   * The lattice-antichain conditions are NOT verified.
   *
   * Return value: true if success; false if there are no further useful configurations.
   */
  static boolean antichaindata_step(AntichainData AD) {
    while (!antichaindata_stepCurrentPosition(AD)) {
      if (AD.mCp != 0) {
        AD.mCp--;
        AD.mFpos--;
        //#ifdef FILTER_GRADED
// 		}
// #else
      } else if (AD.mCl < AD.mLattice.nLev - 2) {
        antichaindata_incrementLevel(AD);
      }
      //#endif
      else {
        return false;
      }
    }

    return true;
  }


  /*
   * If possible, step antichaindata counters starting from the current on the current level.
   * The lattice-antichain conditions are NOT verified.  Special case of a single antichain.
   *
   * Return value: true if success; false if there are no further useful configurations.
   */
  static boolean antichaindata_step_1(AntichainData AD) {
    while (!antichaindata_stepCurrentPosition_1(AD)) {
      //#ifndef FILTER_GRADED
      if (AD.mCl < AD.mLattice.nLev - 2) {
        antichaindata_incrementLevel_1(AD);
      } else
      //#endif
      {
        return false;
      }
    }
    return true;
  }


  /*
   * Initialise antichain data *AD for the lattice L with k elements to be added on the new level.
   * AD should be allocated.
   */
  static void antichaindata_init(lattice L, int k, AntichainData AD, Globals GD) {

    //PREFETCH(AD.L.lo);
    //PREFETCH(AD.cop);

    AD.mLattice = L;
    AD.mGlobals = GD;
    AD.mLattice.lev[AD.mLattice.nLev] = (byte) (AD.mLattice.n + k);  /* levels for the new lattice; for Beneš network creation */
    AD.mK = k;
    AD.mCp = 0;
    AD.mCl = L.nLev - 2;
    AD.mFpos = 0;
    //memset(AD.cop, 0, AD.L.n*sizeof(int));
    Arrays.fill(AD.mCop, 0, AD.mLattice.n, 0);
    for (int i = 0, biti = 1; i < AD.mLattice.n - 1; i++, biti <<= 1) {
      int j;
      for (j = i + 1; j < AD.mLattice.n; j++) {
        if ((AD.mLattice.lo[i] & AD.mLattice.lo[j]) == 0) {
          AD.mCop[i] |= Utils.BIT(j);
          AD.mCop[j] |= biti;
        }
      }
    }
    for (int i = 0; i <= AD.mCl; i++) {
      AD.mStabilisers[i].mStC = null;
      AD.mStabilisers[i].mSt = null;
    }
    if (VERBOSE) {
      System.out.println("SAI: Setting SD[1].ST as " + AD.mLattice.S.mN);
    }
    AD.mStabilisers[AD.mCl + 1].mSt = AD.mLattice.S;
    AD.mStabilisers[AD.mCl + 1].mSi = AD.mLattice.SI;
    AD.mStabilisers[AD.mCl + 1].mBl = (1 << k) - 2;
    //memset(AD.O, 0, k*sizeof(int));
    Arrays.fill(AD.mO, 0, k, 0);
    AD.mO[0] = AD.mCmc = (int) (Utils.BIT(L.n) - Utils.BIT(L.lev[AD.mCl]));
    AD.mCm = AD.mCmc;
    if (VERBOSE) {
      AD.mF[0] = 0; // todo Huh? Why different behaviour in verbose?
    }
  }


  /*
   * Modify antichain data *AD for k elements to be added on the new level.
   * AD should be initialised.
   */
  static void antichaindata_reinit(AntichainData AD, int k) {
    AD.mLattice.lev[AD.mLattice.nLev] = (byte) (AD.mLattice.n + k);  /* levels for the new lattice; for Beneš network creation */
    AD.mK = k;
    AD.mCp = 0;
    AD.mCl = AD.mLattice.nLev - 2;
    AD.mFpos = 0;
    AD.mStabilisers[AD.mCl + 1].mBl = (1 << k) - 2;
    //memset(AD.O, 0, k*sizeof(int));
    Arrays.fill(AD.mO, 0, k, 0);
    AD.mO[0] = AD.mCmc = (int) (Utils.BIT(AD.mLattice.n) - Utils.BIT(AD.mLattice.lev[AD.mCl]));
    AD.mCm = AD.mCmc;
  }


  //#ifndef FILTER_GRADED
  /*
   * Decrement the current level of *AD.
   */
  static void antichaindata_decrementLevel(AntichainData AD) {
    final int[] ugly = new int[] {AD.mStabilisers[AD.mCl].mBl}; // todo ugly
    final int xcl = AD.mCl;
    antichaindata_updateBlocks(AD, AD.mStabilisers[AD.mCl + 1].mBl, ugly);
    AD.mStabilisers[xcl].mBl = ugly[0];
    (AD.mCl)--;
    AD.mFpos++;
    AD.mCmc = (int) (Utils.BIT(AD.mLattice.lev[AD.mCl + 1]) - Utils.BIT(AD.mLattice.lev[AD.mCl]));
    AD.mCm = (int) (Utils.BIT(AD.mLattice.n) - Utils.BIT(AD.mLattice.lev[AD.mCl]));
    AD.mCp = 0;
  }


  /*
   * Decrement the current level of *AD.  Special case of a single antichain.
   */
  static void antichaindata_decrementLevel_1(AntichainData AD) {
    (AD.mCl)--;
    AD.mFpos++;
    AD.mCmc = (int) (Utils.BIT(AD.mLattice.lev[AD.mCl + 1]) - Utils.BIT(AD.mLattice.lev[AD.mCl]));
    AD.mCm = (int) (Utils.BIT(AD.mLattice.n) - Utils.BIT(AD.mLattice.lev[AD.mCl]));
  }
//#endif


  /*
   * Initialise antichaindata counter for the current position.  The lattice-antichain condition
   * is NOT verified.
   */
  static void antichaindata_initialiseCurrentPosition(AntichainData AD) {
    AD.mO[AD.mCp] |= AD.mCmc;
    if (AD.mFpos - AD.mK >= 0) {
      AD.mO[AD.mCp] &= ~(AD.mF[AD.mFpos - AD.mK] & AD.mCmc);
    }
    if (VERBOSE) {
      AD.mF[AD.mFpos] = 0; // todo Huh? Why different in verbose?
    }
  }

  //#ifndef FILTER_GRADED
  /*
   * Initialise antichaindata counter for the current position.  The lattice-antichain condition
   * is NOT verified.  Special case of a single antichain.
   */
  static void antichaindata_initialiseCurrentPosition_1(AntichainData AD) {
    AD.mO[0] |= AD.mCmc;
    if (AD.mFpos != 0) {
      AD.mO[0] &= ~(AD.mF[AD.mFpos - 1] & AD.mCmc);
    }
    if (VERBOSE) {
      AD.mF[AD.mFpos] = 0;
    }
  }
//#endif


  /*
   * Test whether the lattice-antichain condition holds for the currently considered antichain (AD.cp)
   * up to the current level (AD.cl); if successful, and if AD.cl > 0, initialise optional elements
   * on the next lower level (AD.cl-1).
   *
   * Return value: 1 if lattice-antichain condition holds; 0 if contradiction to choice on lower levels
   */
  static boolean antichaindata_validateCurrentPosition(AntichainData AD) {
    int F1pos;
    int done, F;

    assert AD.mFpos == (AD.mLattice.nLev - 2 - AD.mCl) * AD.mK + AD.mCp : "antichaindata: inconsistent value of Fpos";

    /* start with inherited constraints from lower levels */
    F1pos = AD.mFpos - AD.mK;
    F = done = (F1pos >= 0 ? AD.mF[F1pos] : 0);

    /* up-close optional elements added on current level */
    final int[] i = new int[1];
    for (i[0] = AD.mLattice.lev[AD.mCl]; i[0] < AD.mLattice.lev[AD.mCl + 1]; i[0]++) {
      if ((AD.mO[AD.mCp] & Utils.BIT(i[0])) != 0) {
        F |= AD.mLattice.up[i[0]];
      }
    }

    /* meet-close new elements with everything; record constraints & test compatibility with earlier lattice-antichains */
    if (VERBOSE) {
      System.out.print("...... in antichaindata_validateCurrentPosition: meet close  ");
      antichaindata_printCounters(AD);
    }
    final int[] todo = new int[] {F & ~done};
    while (Utils.extractMSB32(todo, i)) {
      long biti;
      int loi, C;
      boolean allnonzero;
      biti = Utils.BIT(i[0]);
      /* first test compatibility with other lattice antichains... */
      C = AD.mCop[i[0]] & F;
      int[] j = new int[1];
      for (j[0] = (F1pos > 0 ? F1pos : 0); j[0] < AD.mFpos; j[0]++) {
        if ((biti & AD.mF[j[0]]) != 0 && (C & AD.mF[j[0]]) != 0) {
          return false;
        }
      }
      /* ...now meet-close & test lattice antichain condition */
      int[] tocheck = new int[] {done & ~(AD.mLattice.up[i[0]] | AD.mLattice.lo[i[0]])};
      allnonzero = true;
      loi = AD.mLattice.lo[i[0]];
      done |= biti;
      final int[] m = new int[1];
      while (Utils.extractMSB32(tocheck, j)) {
        if (Utils.getLSB32(loi & (AD.mLattice.lo[j[0]]), m)) {
          if ((Utils.BIT(m[0]) & (done | todo[0])) == 0) {  /* m cannot equal i by choice of j, so removing i early is fine */
            //#ifndef FILTER_GRADED
            if (m[0] >= AD.mLattice.lev[AD.mCl]) {  /* equivalent to AD.L.dep[m] >= AD.cl */
              return false;
            } else {
              todo[0] |= (AD.mLattice.up[m[0]] & ~done);
              F |= AD.mLattice.up[m[0]];
            }
// #else
// 					return false;  /* either contradicts choice, or adds a cover on a higher level */
// #endif
          }
          tocheck[0] &= ~AD.mLattice.up[j[0]];
        } else {
          allnonzero = false;
        }
      }
      //if (unlikely(allnonzero)) {
      if (allnonzero) {
        done |= (todo[0] & AD.mLattice.up[i[0]]);  /* For any j we have i\meet j \ne 0 for any j, so the gcd */
        todo[0] &= ~AD.mLattice.up[i[0]];          /* of j with any element in up[i] is in up[i\meet j].     */
      }
    }
    if (VERBOSE) {
      System.out.println("...... in antichaindata_validateCurrentPosition: OK");
    }
    AD.mF[AD.mFpos] = F;
    return true;
  }


  /*
   * Test whether the lattice-antichain condition holds for the currently considered antichain (AD.cp)
   * up to the current level (AD.cl); if successful, and if AD.cl > 0, initialise optional elements
   * on the next lower level (AD.cl-1).  Special case of a single antichain.
   *
   * Return value: 1 if lattice-antichain condition holds; 0 if contradiction to choice on lower levels
   */
  static boolean antichaindata_validateCurrentPosition_1(AntichainData AD) {
    int done, F;
    final int[] j = new int[1];

    assert AD.mFpos == (AD.mLattice.nLev - 2 - AD.mCl) * AD.mK + AD.mCp : "antichaindata: inconsistent value of Fpos";

    /* start with inherited constraints from lower levels */
    F = done = (AD.mFpos != 0 ? AD.mF[AD.mFpos - 1] : 0);

    /* up-close optional elements added on current level */
    final int[] i = new int[1];
    for (i[0] = AD.mLattice.lev[AD.mCl]; i[0] < AD.mLattice.lev[AD.mCl + 1]; i[0]++) {
      if ((AD.mO[0] & Utils.BIT(i[0])) != 0) {
        F |= AD.mLattice.up[i[0]];
      }
    }

    /* meet-close new elements with everything; record constraints */
    if (VERBOSE) {
      System.out.print("...... in antichaindata_validateCurrentPosition_1: meet close  ");
      antichaindata_printCounters(AD);
    }
    final int[] todo = new int[] {F & ~done};
    final int[] m = new int[1];
    while (Utils.extractMSB32(todo, i)) {
      /* meet-close & test lattice antichain condition */
      final int[] tocheck = new int[] {done & ~(AD.mLattice.up[i[0]] | AD.mLattice.lo[i[0]])};
      done |= Utils.BIT(i[0]);
      boolean allnonzero = true;
      int loi = AD.mLattice.lo[i[0]];
      while (Utils.extractMSB32(tocheck, j)) {
        if (Utils.getLSB32(loi & (AD.mLattice.lo[j[0]]), m)) {
          if ((Utils.BIT(m[0]) & (done | todo[0])) == 0) {  /* m cannot equal i by choice of j, so removing i early is fine */
            //#ifndef FILTER_GRADED
            if (m[0] >= AD.mLattice.lev[AD.mCl]) {  /* equivalent to AD.L.dep[m] >= AD.cl */
              return false;
            } else {
              todo[0] |= (AD.mLattice.up[m[0]] & ~done);
              F |= AD.mLattice.up[m[0]];
            }
// #else
// 					return false;  /* either contradicts choice, or adds a cover on a higher level */
// #endif
          }
          tocheck[0] &= ~AD.mLattice.up[j[0]];  /* gcd of i with any element in up[j] is in up[m] */
        } else {
          allnonzero = false;
        }
      }
      //if (unlikely(allnonzero)) {
      if (allnonzero) {
        done |= (todo[0] & AD.mLattice.up[i[0]]);  /* For any j we have i\meet j \ne 0 for any j, so the gcd */
        todo[0] &= ~AD.mLattice.up[i[0]];          /* of j with any element in up[i] is in up[i\meet j].     */
      }
    }
    if (VERBOSE) {
      System.out.println("...... in antichaindata_validateCurrentPosition_1: OK");
    }

    AD.mF[AD.mFpos] = F;
    return true;
  }


  /*
   * If possible, step antichaindata counters starting from the current on the current level.
   * The lattice-antichain conditions are NOT verified.
   *
   * Return value: true if success; false if there are no further useful configurations.
   */
  boolean antichaindata_step_FUNC(AntichainData AD) {
    return antichaindata_step(AD);
  }


  /*
   * If possible, step antichaindata counters starting from the current on the current level.
   * The lattice-antichain conditions are NOT verified.
   *
   * Return value: true if success; false if there are no further useful configurations.
   */
  boolean antichaindata_step_1_FUNC(AntichainData AD) {
    return antichaindata_step_1(AD);
  }


// #ifdef FILTER_GRADED
// /*
//  * Advance *AD to the next canonical configuration of lattice-antichains.
//  *
//  * Return value: true if successful; false if no further canonical configuration exists.
//  */
// boolean antichaindata_next(antichaindata AD)
// {
// #ifdef THREADED
// 	while (action) {
// #else
// 	while (true) {
// #endif
// #ifdef VERBOSE
// 		printf("... in antichaindata_next: "); antichaindata_printCounters(AD);
// #endif
// 		while (!antichaindata_validateCurrentPosition(AD)) {
// #ifdef VERBOSE
// 			printf("                           invalid\n");
// #endif
// 			if (!antichaindata_step(AD)) {
// #ifdef VERBOSE
// 				printf("                                   and done!\n");
// #endif
// 				return false;
// 			}
// 		}
// 		if (AD.cp != AD.k-1) {
// 			AD.cp++;
// 			AD.Fpos++;
// 			antichaindata_initialiseCurrentPosition(AD);
// 		} else {
// 			int  m;
// 			int      i;

// 			for (m=0, i=0; i<AD.k; i++)
// 				m |= AD.O[i];
// 			if (m != BIT(AD.L.lev[AD.cl+1])-BIT(AD.L.lev[AD.cl])) {
// #ifdef VERBOSE
// 				printf("                           not graded\n");
// #endif
// 				if (!antichaindata_step(AD)) {
// #ifdef VERBOSE
// 					printf("                                         and done!\n");
// #endif
// 					return false;
// 				}
// 			} else {
// 				if (!antichaindata_isCanonical(AD)) {
// #ifdef VERBOSE
// 					printf("                           not canonical\n");
// #endif
// 					/* antichaindata_isCanonical has set AD.cp and AD.Fpos to the correct backtracking position  */
// 					if (!antichaindata_step(AD)) {
// #ifdef VERBOSE
// 						printf("                                         and done!\n");
// #endif
// 						return false;
// 					}
// 				} else {
// #ifdef VERBOSE
// 					printf("                           valid --> "); antichaindata_printCountersF(AD);
// #endif
// 					return true;
// 				}
// 			}
// 		}
// 	}
// 	return false;
// }


  // /*
//  * Advance *AD to the next canonical configuration of lattice-antichains.  Special case of a single antichain.
//  *
//  * Return value: true if successful; false if no further canonical configuration exists.
//  */
// boolean antichaindata_next_1(antichaindata AD)
// {
// #ifdef THREADED
// 	while (action) {
// #else
// 	while (true) {
// #endif
// #ifdef VERBOSE
// 		printf("... in antichaindata_next_1: "); antichaindata_printCounters(AD);
// #endif
// 		while (!antichaindata_validateCurrentPosition_1(AD)) {
// #ifdef VERBOSE
// 			printf("                           invalid\n");
// #endif
// 			if (!antichaindata_step_1(AD)) {
// #ifdef VERBOSE
// 				printf("                                   and done!\n");
// #endif
// 				return false;
// 			}
// 		}
// 		if (AD.O[0] != BIT(AD.L.lev[AD.cl+1])-BIT(AD.L.lev[AD.cl])) {
// #ifdef VERBOSE
// 			printf("                           not graded\n");
// #endif
// 			if (!antichaindata_step_1(AD)) {
// #ifdef VERBOSE
// 				printf("                                         and done!\n");
// #endif
// 				return false;
// 			}
// 		} else {
// 			if (!antichaindata_isCanonical_1(AD)) {
// #ifdef VERBOSE
// 				printf("                           not canonical\n");
// #endif
// 				if (!antichaindata_step_1(AD)) {
// #ifdef VERBOSE
// 					printf("                                         and done!\n");
// #endif
// 					return false;
// 				}
// 			} else {
// #ifdef VERBOSE
// 				printf("                           valid --> "); antichaindata_printCountersF(AD);
// #endif
// 				return true;
// 			}
// 		}
// 	}
// 	return false;
// }
// #else
  /*
   * Advance AD to the next canonical configuration of lattice-antichains.
   *
   * Return value: true if successful; false if no further canonical configuration exists.
   */
  static boolean antichaindata_next(AntichainData AD) {
    while (true) {
      if (VERBOSE) {
        System.out.print("... in antichaindata_next: ");
        antichaindata_printCounters(AD);
      }
      while (!antichaindata_validateCurrentPosition(AD)) {
        if (VERBOSE) {
          System.out.println("                           invalid");
        }
        if (!antichaindata_step(AD)) {
          if (VERBOSE) {
            System.out.println("                                   and done!");
          }
          return false;
        }
      }
      if (AD.mCp != AD.mK - 1) {
        AD.mCp++;
        AD.mFpos++;
        antichaindata_initialiseCurrentPosition(AD);
      } else {
        if (!canonical.antichaindata_isCanonical(AD)) {
          if (VERBOSE) {
            System.out.println("                           not canonical");
          }
          /* antichaindata_isCanonical has set AD.cp and AD.Fpos to the correct backtracking position  */
          if (!antichaindata_step(AD)) {
            if (VERBOSE) {
              System.out.println("                                   and done!");
            }
            return false;
          }
        } else {
          if (AD.mCl != 0) {
            antichaindata_decrementLevel(AD);
            antichaindata_initialiseCurrentPosition(AD);
          } else {
            if (VERBOSE) {
              System.out.print("                           valid --> ");
              antichaindata_printCountersF(AD);
            }
            return true;
          }
        }
      }
    }
  }

  /*
   * Advance AD to the next canonical configuration of lattice-antichains.  Special case of a single antichain.
   *
   * Return value: true if successful; false if no further canonical configuration exists.
   */
  static boolean antichaindata_next_1(AntichainData AD) {
    while (true) {
      if (VERBOSE) {
        System.out.print("... in antichaindata_next_1: ");
        antichaindata_printCounters(AD);
      }
      while (!antichaindata_validateCurrentPosition_1(AD)) {
        if (VERBOSE) {
          System.out.println("                           invalid");
        }
        if (!antichaindata_step_1(AD)) {
          if (VERBOSE) {
            System.out.println("                                   and done!");
          }
          return false;
        }
      }
      if (!canonical.antichaindata_isCanonical_1(AD)) {
        if (VERBOSE) {
          System.out.println("                           not canonical");
        }
        if (!antichaindata_step_1(AD)) {
          if (VERBOSE) {
            System.out.println("                                         and done!");
          }
          return false;
        }
      } else {
        if (AD.mCl != 0) {
          antichaindata_decrementLevel_1(AD);
          antichaindata_initialiseCurrentPosition_1(AD);
        } else {
          if (VERBOSE) {
            System.out.print("                           valid --> ");
            antichaindata_printCountersF(AD);
          }
          return true;
        }
      }
    }
  }

  /*
   * Set generic data in LA that applies to every lattice obtained from L by adding AD.k atoms
   * covered by lattice antichains:  number of elements, levels, as well as
   *    up[i]  .....
   *   (lo[i]) lo[j]
   * for 1 < i < L.n <= j < LA.n.  lo[i] may be modified in antichaindata_generateLattice.
   */
  static void antichaindata_prepareLattice(AntichainData AD, lattice L, lattice LA) {
    LA.n = (byte) (L.n + AD.mK);                          /* number of elements  */
    if (VERBOSE) {
      System.out.println("SAI: Set LA.n to " + LA.n + " from " + L.n + " + " + AD.mK);
    }
    LA.nLev = L.nLev + 1;                          /* number of levels    */
    //memcpy(LA.lev, L.lev, L.nLev * sizeof( int));  /* old levels          */
    System.arraycopy(L.lev, 0, LA.lev, 0, L.nLev);
    LA.lev[LA.nLev - 1] = LA.n;                   /* new level           */
    for (int j = L.n; j < LA.n; j++) {
      LA.lo[j] = (int) Utils.BIT(j);                        /* lo[j]               */
    }
    //memcpy(LA.up, L.up, L.n * sizeof( int));   /* up[i]               */
    //memcpy(LA.lo, L.lo, L.n * sizeof( int));   /* lo[i] (preliminary) */
    System.arraycopy(L.up, 0, LA.up, 0, L.n);
    System.arraycopy(L.lo, 0, LA.lo, 0, L.n);
  }


  /*
   * Set LA to the lattice obtained from L by adding AD.k new atoms covered by the elements in the
   * lattice antichains described by AD:  stabiliser, as well as
   *   .....  up[j]
   *   lo[i]  .....
   * for 1 < i < L.n <= j < LA.n.  ..... denotes data set in antichaindata_prepareLattice.
   * Note: The stabiliser of *LA carries a reference count.
   */
  static void antichaindata_generateLattice(AntichainData AD, lattice L, lattice LA) {
    int i, j, k;

    //PREFETCH(AD.F);
    //PREFETCH(LA.up);
    //PREFETCH(LA.lo);

    for (k = AD.mK, j = L.n; k-- != 0; j++) {
      /* set up[j] and lo[i] for 1 < i < L.n <= j < LA.n */
      LA.up[j] = (int) (Utils.BIT(j) | AD.mF[AD.mFpos - k]);       /* up[j] */
      for (i = 0; i < L.n; i++) {
        if ((AD.mF[AD.mFpos - k] & Utils.BIT(i)) != 0) {
          LA.lo[i] |= Utils.BIT(j);
        } else                                      /* lo[i] */ {
          LA.lo[i] &= ~Utils.BIT(j);
        }
      }
    }
    /* set stabiliser */
    lattice.lattice_setStabiliser(LA, AD.mStabilisers[0].mSt, AD.mStabilisers[0].mSi);  /* stabiliser          */
  }


  /*
   * Set *LA to the lattice obtained from *L by adding AD.k new atoms covered by the elements in the
   * lattice antichains described by *AD:  stabiliser, as well as
   *   .....  up[j]
   *   lo[i]  .....
   * for 1 < i < L.n <= j < LA.n.  ..... denotes data set in antichaindata_prepareLattice.
   * Special case of a single antichain.
   * Note: The stabiliser of *LA carries a reference count.
   */
  static void antichaindata_generateLattice_1(AntichainData AD, lattice L, lattice LA) {
    //PREFETCH(AD.F);
    //PREFETCH(LA.up);
    //PREFETCH(LA.lo);
    if (VERBOSE) {
      System.out.println("SAI: lattice stab " + L.S.mN + " " + AD.mStabilisers[0].mSt.mN);
    }

    /* set up[j] and lo[i] for 1 < i < L.n <= j < LA.n */
    LA.up[L.n] = (int) (Utils.BIT(L.n) | AD.mF[AD.mFpos]);   /* up[j] */
    for (int i = 0; i < L.n; i++) {    /* lo[i] */
      if ((AD.mF[AD.mFpos] & Utils.BIT(i)) != 0) {
        LA.lo[i] |= Utils.BIT(L.n);
      } else                                      /* lo[i] */ {
        LA.lo[i] &= ~Utils.BIT(L.n);
      }
    }
    /* set stabiliser */
    lattice.lattice_setStabiliser(LA, AD.mStabilisers[0].mSt, AD.mStabilisers[0].mSi);  /* stabiliser          */
  }

  /*
   * TEST FUNCTION: Print all set bits in each antichain in *AD.
   */
  static void antichaindata_printAntichains(AntichainData AD) {
    int j;
    int[] A = new int[1];
    int[] i = new int[1];

    for (j = AD.mK; j-- != 0; ) {
      /* extract the j-th lattice-antichain described by *AD, i.e. the minimal elements of the up-closed set */
      A[0] = 0;
      for (i[0] = 0; i[0] < AD.mLattice.n; i[0]++) {
        if ((AD.mF[AD.mFpos - j] & Utils.BIT(i[0])) != 0 && ((AD.mF[AD.mFpos - j] & AD.mLattice.lo[i[0]]) == Utils.BIT(i[0]))) {
          A[0] |= Utils.BIT(i[0]);
        }
      }
      while (Utils.extractLSB32(A, i)) {
        System.out.printf("%d ", i[0]);
      }
      System.out.print(" | ");
    }
    System.out.println();
  }


  /*
   * TEST FUNCTION: Print all counters for each position and each level in *AD.
   */
  static void antichaindata_printCounters(AntichainData AD) {
    System.out.printf("cl:%d, cp:%d   ", AD.mCl, AD.mCp);
    for (int j = 0; j < AD.mK; j++) {
      for (int m = AD.mLattice.nLev - 2; m >= AD.mCl; m--) {
        final int[] A = {(int) ((j > AD.mCp ? 0 : AD.mF[(AD.mLattice.nLev - 2 - m) * AD.mK + j]) | (AD.mO[j] & (Utils.BIT(AD.mLattice.lev[m + 1]) - Utils.BIT(AD.mLattice.lev[m]))))};
        final int[] i = new int[1];
        while (Utils.extractLSB32(A, i)) {
          System.out.printf("%d ", i[0]);
        }
        System.out.print("; ");
      }
      System.out.print(" | ");
    }
    System.out.println();
  }


  /*
   * TEST FUNCTION: Print the counters F for each position and each level in *AD.
   */
  static void antichaindata_printCountersF(AntichainData AD) {
    int j, m;
    final int[] i = new int[1];
    System.out.printf("cl:%d, cp:%d   ", AD.mCl, AD.mCp);
    for (j = 0; j < AD.mK; j++) {
      for (m = AD.mLattice.nLev - 2; m >= AD.mCl; m--) {
        final int[] A = {j > AD.mCp ? 0 : AD.mF[(AD.mLattice.nLev - 2 - m) * AD.mK + j]};
        while (Utils.extractLSB32(A, i)) {
          System.out.printf("%d ", i[0]);
        }
        System.out.print("; ");
      }
      System.out.print(" | ");
    }
    System.out.println();
  }


///*
// * TEST FUNCTION: Return true if every antichain in *AD is a lattice-antichain; return false otherwise.
// */
//boolean antichaindata_test(antichaindata AD)
//{
//	int      i, j, k, d;
//	int  A, upA, m;
//
//	for (k=0; k<AD.k; k++) {
//		/* extract the k-th lattice-antichain described by *AD, i.e. the minimal elements of the up-closed set */
//		A = 0;
//		for (i=0; i<AD.L.n; i++)
//			if ((AD.F[AD.Fpos-k] & BIT(i)) && ((AD.F[AD.Fpos-k] & AD.L.lo[i]) == BIT(i)))
//				A |= BIT(i);
//		/* test that A is an antichain */
//		for (i=0; i<AD.L.n; i++)
//			if (A & BIT(i))
//				for (j=i+1; j<AD.L.n; j++)
//					if (A & BIT(j))
//						if ((BIT(i)&AD.L.up[j]) || (BIT(j)&AD.L.up[i]) || (BIT(i)&AD.L.lo[j]) || (BIT(j)&AD.L.lo[i])) {
//							printf(">>> not an antichain %d:(%d,%d)\n", k, i, j);
//							return false;
//						}
//		/* up-close */
//		upA = 0;
//		for (i=0; i<AD.L.n; i++)
//			if (A & BIT(i))
//				upA |= AD.L.up[i];
//		if (upA != AD.F[AD.Fpos-k]) {
//			printf(">>> not up-closed %d:(%d)\n", k, i);
//			return false;
//		}
//		/* test gcd condition */
//		for (i=0; i<AD.L.n; i++)
//			if (upA & BIT(i))
//				for (j=i+1; j<AD.L.n; j++)
//					if (upA & BIT(j)) {
//						m = AD.L.lo[i] & AD.L.lo[j];
//						for (d=0; d<AD.L.n && !(m&BIT(d)); d++)
//							;
//						if (d < AD.L.n && !(upA&BIT(d))) {
//							printf(">>> not a lattice-antichain %d:(%d,%d) [%d]\n", k, i, j, d);
//							return false;
//						}
//
//					}
//	}
//	return true;
//}
}
