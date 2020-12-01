package gebhardt;

import java.util.Arrays;

/**
 * Antichain.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
class Antichain {

  // Original header:

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
    PermGrpC mStC = null;
    PermGrp mSt = null;
    int mSi;
    int mBl;
  }

  final Lattice mLattice;
  final Globals mGlobals;
  final int[] mCop = new int[Utils.MAXN - 3];
  int mK;
  int mCl;
  int mCmc;
  int mCm;
  final Stabiliser[] mStabilisers = new Stabiliser[Utils.MAXN - 2];
  int mCp = 0;
  int mFpos = 0;
  final int[] mO = new int[Utils.MAXN - 3];
  final int[] mF = new int[Utils.FSIZE];

  /*
   * Initialise antichain data AD for the lattice lattice with k elements to be added on the new level.
   * AD should be allocated.
   */
  Antichain(final Lattice lattice, final int k, final Globals globals) {
    mLattice = lattice;
    mGlobals = globals;
    mLattice.mLev[mLattice.mNLev] = (byte) (mLattice.mN + k);  /* levels for the new lattice; for Bene&scaron; network creation */
    mK = k;
    mCl = lattice.mNLev - 2;
    for (int i = 0; i < mStabilisers.length; ++i) {
      mStabilisers[i] = new Stabiliser();
    }
    for (int i = 0, biti = 1; i < mLattice.mN - 1; ++i, biti <<= 1) {
      for (int j = i + 1; j < mLattice.mN; ++j) {
        if ((mLattice.mLo[i] & mLattice.mLo[j]) == 0) {
          mCop[i] |= Utils.bit(j);
          mCop[j] |= biti;
        }
      }
    }
    mStabilisers[mCl + 1].mSt = mLattice.mS;
    mStabilisers[mCl + 1].mSi = mLattice.mSi;
    mStabilisers[mCl + 1].mBl = (1 << k) - 2;
    mCmc = (int) (Utils.bit(lattice.mN) - Utils.bit(lattice.mLev[mCl]));
    mO[0] = mCmc;
    mCm = mCmc;
  }

  /*
   * Ensure that the stabiliser SD[lev].StC exists, and return SD[lev].StC.
   */
  PermGrpC ensureStabiliser(final int lev) {
    if (mStabilisers[lev].mStC == null) {
      mStabilisers[lev].mStC = new PermGrpC();
    }
    return mStabilisers[lev].mStC;
  }

  /*
   *  Given a partition p of elements, return in *q a refinement of p such that the optional
   *  choices on the current level of AD are constant on every element of q.
   */
  void updateBlocks(final int p, final int[] q) {
    final int[] i = new int[1];
    int b = q[0] = p;
    while (Utils.getLSB32(b, i)) {
      b ^= Utils.bit(i[0]);  /* bit i is set, so this clears it */
      if (((mO[i[0] - 1] ^ mO[i[0]]) & mCmc) != 0) {
        q[0] ^= Utils.bit(i[0]);  /* bit i is set, so this clears it */
      }
    }
  }

  /*
   * Increment the current level of
   */
  private void incrementLevel() {
    ++mCl;
    --mFpos;
    mCmc = (int) (Utils.bit(mLattice.mLev[mCl + 1]) - Utils.bit(mLattice.mLev[mCl]));
    mCm = (int) (Utils.bit(mLattice.mN) - Utils.bit(mLattice.mLev[mCl]));
    mCp = mK - 1;
  }

  /*
   * Increment the current level of
   */
  private void incrementLevel1() {
    ++mCl;
    --mFpos;
    mCmc = (int) (Utils.bit(mLattice.mLev[mCl + 1]) - Utils.bit(mLattice.mLev[mCl]));
    mCm = (int) (Utils.bit(mLattice.mN) - Utils.bit(mLattice.mLev[mCl]));
  }

  /*
   * If possible, step antichaindata counter for the current position.  The lattice-antichain condition
   * is NOT verified.
   *
   * Return value: true if success; false if there are no further useful configurations.
   */
  private boolean stepCurrentPosition() {
    if ((mO[mCp] & mCmc) == 0) {
      return false;
    }
    mO[mCp] -= Utils.bit(mLattice.mLev[mCl]);
    final int w, nW;
    final int f1Pos = mFpos - mK;
    if (f1Pos >= 0) {
      mO[mCp] &= ~(mF[f1Pos] & mCmc);
      w = (mF[f1Pos] | mO[mCp]) & mCm;
      if (mCp != 0) {
        nW = (mF[f1Pos - 1] | mO[mCp - 1]) & mCm;
      } else {
        nW = (int) (mLattice.mUp[mLattice.mN - 1] & mCm ^ Utils.bit(mLattice.mN - 1));
      }
    } else {
      w = mO[mCp];
      if (mCp != 0) {
        nW = mO[mCp - 1];
      } else {
        nW = (int) (mLattice.mUp[mLattice.mN - 1] & mCm ^ Utils.bit(mLattice.mN - 1));
      }
    }

    /*
     * We only want antichains that have a weight no less than the weight of the preceding
     * element, and that intersect the lowest level of the old lattice.
     * catches antichains not intersecting the lowest level; i.e.,
     * cl == L.nLev-2 && !(O[cp] & cm)
     */
    return w >= nW && w != 0;
  }

  /*
   * If possible, step antichaindata counter for the current position.  The lattice-antichain condition
   * is NOT verified.  Special case of a single antichain.
   *
   * Return value: true if success; false if there are no further useful configurations.
   */
  private boolean stepCurrentPosition1() {
    if ((mO[0] & mCmc) == 0) {
      return false;
    }
    final int w;
    mO[0] -= Utils.bit(mLattice.mLev[mCl]);
    if (mFpos != 0) {
      mO[0] &= ~(mF[mFpos - 1] & mCmc);
      w = (mF[mFpos - 1] | mO[0]) & mCm;
    } else {
      w = mO[0];
    }

    /* We only want antichains that have a weight no less than the weight of the preceding element. */
    final int nW = (int) (mLattice.mUp[mLattice.mN - 1] & mCm ^ Utils.bit(mLattice.mN - 1));
    /* catches antichains not intersecting the lowest level, i.e. */
    /* cl == L.nLev-2 && !(O[0] & cm)            */
    return w >= nW && w != 0;
  }

  /*
   * If possible, step antichaindata counters starting from the current on the current level.
   * The lattice-antichain conditions are NOT verified.
   *
   * Return value: true if success; false if there are no further useful configurations.
   */
  boolean step() {
    while (!stepCurrentPosition()) {
      if (mCp != 0) {
        --mCp;
        --mFpos;
      } else if (mCl < mLattice.mNLev - 2) {
        incrementLevel();
      } else {
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
  boolean step1() {
    while (!stepCurrentPosition1()) {
      if (mCl < mLattice.mNLev - 2) {
        incrementLevel1();
      } else {
        return false;
      }
    }
    return true;
  }

  /*
   * Modify antichain data AD for k elements to be added on the new level.
   * AD should be initialised.
   */
  void reset(final int k) {
    mLattice.mLev[mLattice.mNLev] = (byte) (mLattice.mN + k);  /* levels for the new lattice; for Bene&scaron; network creation */
    mK = k;
    mCp = 0;
    mCl = mLattice.mNLev - 2;
    mFpos = 0;
    mStabilisers[mCl + 1].mBl = (1 << k) - 2;
    Arrays.fill(mO, 0, k, 0);
    mCmc = (int) (Utils.bit(mLattice.mN) - Utils.bit(mLattice.mLev[mCl]));
    mO[0] = mCmc;
    mCm = mCmc;
  }

  /*
   * Decrement the current level of
   */
  void decrementLevel() {
    final int[] ugly = new int[]{mStabilisers[mCl].mBl}; // todo ugly
    updateBlocks(mStabilisers[mCl + 1].mBl, ugly);
    mStabilisers[mCl].mBl = ugly[0];
    --mCl;
    ++mFpos;
    mCmc = (int) (Utils.bit(mLattice.mLev[mCl + 1]) - Utils.bit(mLattice.mLev[mCl]));
    mCm = (int) (Utils.bit(mLattice.mN) - Utils.bit(mLattice.mLev[mCl]));
    mCp = 0;
  }

  /*
   * Decrement the current level of  Special case of a single antichain.
   */
  void decrementLevel1() {
    --mCl;
    ++mFpos;
    mCmc = (int) (Utils.bit(mLattice.mLev[mCl + 1]) - Utils.bit(mLattice.mLev[mCl]));
    mCm = (int) (Utils.bit(mLattice.mN) - Utils.bit(mLattice.mLev[mCl]));
  }

  /*
   * Initialise antichain counter for the current position.  The lattice-antichain condition
   * is NOT verified.
   */
  void initialiseCurrentPosition() {
    mO[mCp] |= mCmc;
    if (mFpos - mK >= 0) {
      mO[mCp] &= ~(mF[mFpos - mK] & mCmc);
    }
    if (VERBOSE) {
      mF[mFpos] = 0; // todo Huh? Why different in verbose?
    }
  }

  /*
   * Initialise antichain counter for the current position.  The lattice-antichain condition
   * is NOT verified.  Special case of a single antichain.
   */
  void initialiseCurrentPosition1() {
    mO[0] |= mCmc;
    if (mFpos != 0) {
      mO[0] &= ~(mF[mFpos - 1] & mCmc);
    }
    if (VERBOSE) {
      mF[mFpos] = 0;
    }
  }

  /*
   * Test whether the lattice-antichain condition holds for the currently considered antichain (cp)
   * up to the current level (cl); if successful, and if cl > 0, initialise optional elements
   * on the next lower level (cl-1).
   *
   * Return value: 1 if lattice-antichain condition holds; 0 if contradiction to choice on lower levels
   */
  boolean validateCurrentPosition() {
    assert mFpos == (mLattice.mNLev - 2 - mCl) * mK + mCp : "antichaindata: inconsistent value of fPos";

    /* start with inherited constraints from lower levels */
    final int f1Pos = mFpos - mK;
    int done = f1Pos >= 0 ? mF[f1Pos] : 0;
    int f = done;

    /* up-close optional elements added on current level */
    for (int k = mLattice.mLev[mCl]; k < mLattice.mLev[mCl + 1]; ++k) {
      if ((mO[mCp] & Utils.bit(k)) != 0) {
        f |= mLattice.mUp[k];
      }
    }

    /* meet-close new elements with everything; record constraints & test compatibility with earlier lattice-antichains */
    if (VERBOSE) {
      System.out.print("...... in antichaindata_validateCurrentPosition: meet close  ");
      printCounters();
    }
    final int[] i = new int[1];
    final int[] j = new int[1];
    final int[] todo = {f & ~done};
    while (Utils.extractMSB32(todo, i)) {
      final long biti = Utils.bit(i[0]);
      /* first test compatibility with other lattice antichains... */
      final int c = mCop[i[0]] & f;
      for (int k = Math.max(f1Pos, 0); k < mFpos; ++k) {
        if ((biti & mF[k]) != 0 && (c & mF[k]) != 0) {
          return false;
        }
      }
      /* ...now meet-close & test lattice antichain condition */
      final int[] tocheck = new int[]{done & ~(mLattice.mUp[i[0]] | mLattice.mLo[i[0]])};
      boolean allnonzero = true;
      final int loi = mLattice.mLo[i[0]];
      done |= biti;
      final int[] m = new int[1];
      while (Utils.extractMSB32(tocheck, j)) {
        if (Utils.getLSB32(loi & mLattice.mLo[j[0]], m)) {
          if ((Utils.bit(m[0]) & (done | todo[0])) == 0) {  /* m cannot equal i by choice of j, so removing i early is fine */
            if (m[0] >= mLattice.mLev[mCl]) {  /* equivalent to L.dep[m] >= cl */
              return false;
            } else {
              todo[0] |= mLattice.mUp[m[0]] & ~done;
              f |= mLattice.mUp[m[0]];
            }
          }
          tocheck[0] &= ~mLattice.mUp[j[0]];
        } else {
          allnonzero = false;
        }
      }
      if (allnonzero) {
        done |= todo[0] & mLattice.mUp[i[0]];  /* For any j we have i\meet j \ne 0 for any j, so the gcd */
        todo[0] &= ~mLattice.mUp[i[0]];          /* of j with any element in up[i] is in up[i\meet j].     */
      }
    }
    if (VERBOSE) {
      System.out.println("...... in antichaindata_validateCurrentPosition: OK");
    }
    mF[mFpos] = f;
    return true;
  }

  /*
   * Test whether the lattice-antichain condition holds for the currently considered antichain (cp)
   * up to the current level (cl); if successful, and if cl > 0, initialise optional elements
   * on the next lower level (cl-1).  Special case of a single antichain.
   *
   * Return value: 1 if lattice-antichain condition holds; 0 if contradiction to choice on lower levels
   */
  boolean validateCurrentPosition1() {
    assert mFpos == (mLattice.mNLev - 2 - mCl) * mK + mCp : "antichaindata: inconsistent value of Fpos";

    /* start with inherited constraints from lower levels */
    int done = mFpos != 0 ? mF[mFpos - 1] : 0;
    int f = done;

    /* up-close optional elements added on current level */
    for (int k = mLattice.mLev[mCl]; k < mLattice.mLev[mCl + 1]; ++k) {
      if ((mO[0] & Utils.bit(k)) != 0) {
        f |= mLattice.mUp[k];
      }
    }

    /* meet-close new elements with everything; record constraints */
    if (VERBOSE) {
      System.out.print("...... in antichaindata_validateCurrentPosition_1: meet close  ");
      printCounters();
    }
    final int[] i = new int[1];
    final int[] j = new int[1];
    final int[] todo = new int[]{f & ~done};
    final int[] m = new int[1];
    while (Utils.extractMSB32(todo, i)) {
      /* meet-close & test lattice antichain condition */
      final int[] tocheck = new int[]{done & ~(mLattice.mUp[i[0]] | mLattice.mLo[i[0]])};
      done |= Utils.bit(i[0]);
      boolean allnonzero = true;
      final int loi = mLattice.mLo[i[0]];
      while (Utils.extractMSB32(tocheck, j)) {
        if (Utils.getLSB32(loi & mLattice.mLo[j[0]], m)) {
          if ((Utils.bit(m[0]) & (done | todo[0])) == 0) {  /* m cannot equal i by choice of j, so removing i early is fine */
            if (m[0] >= mLattice.mLev[mCl]) {  /* equivalent to L.dep[m] >= cl */
              return false;
            } else {
              todo[0] |= mLattice.mUp[m[0]] & ~done;
              f |= mLattice.mUp[m[0]];
            }
          }
          tocheck[0] &= ~mLattice.mUp[j[0]];  /* gcd of i with any element in up[j] is in up[m] */
        } else {
          allnonzero = false;
        }
      }
      if (allnonzero) {
        done |= todo[0] & mLattice.mUp[i[0]];  /* For any j we have i\meet j \ne 0 for any j, so the gcd */
        todo[0] &= ~mLattice.mUp[i[0]];          /* of j with any element in up[i] is in up[i\meet j].     */
      }
    }
    if (VERBOSE) {
      System.out.println("...... in antichaindata_validateCurrentPosition_1: OK");
    }

    mF[mFpos] = f;
    return true;
  }

  /*
   * Advance AD to the next canonical configuration of lattice-antichains.
   *
   * Return value: true if successful; false if no further canonical configuration exists.
   */
  boolean next() {
    while (true) {
      if (VERBOSE) {
        System.out.print("... in antichaindata_next: ");
        printCounters();
      }
      while (!validateCurrentPosition()) {
        if (VERBOSE) {
          System.out.println("                           invalid");
        }
        if (!step()) {
          if (VERBOSE) {
            System.out.println("                                   and done!");
          }
          return false;
        }
      }
      if (mCp != mK - 1) {
        ++mCp;
        ++mFpos;
        initialiseCurrentPosition();
      } else {
        if (!Canonical.isCanonical(this)) {
          if (VERBOSE) {
            System.out.println("                           not canonical");
          }
          /* antichaindata_isCanonical has set cp and Fpos to the correct backtracking position  */
          if (!step()) {
            if (VERBOSE) {
              System.out.println("                                   and done!");
            }
            return false;
          }
        } else {
          if (mCl != 0) {
            decrementLevel();
            initialiseCurrentPosition();
          } else {
            if (VERBOSE) {
              System.out.print("                           valid --> ");
              printCountersF();
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
  boolean next1() {
    while (true) {
      if (VERBOSE) {
        System.out.print("... in antichaindata_next_1: ");
        printCounters();
      }
      while (!validateCurrentPosition1()) {
        if (VERBOSE) {
          System.out.println("                           invalid");
        }
        if (!step1()) {
          if (VERBOSE) {
            System.out.println("                                   and done!");
          }
          return false;
        }
      }
      if (!Canonical.isCanonical1(this)) {
        if (VERBOSE) {
          System.out.println("                           not canonical");
        }
        if (!step1()) {
          if (VERBOSE) {
            System.out.println("                                         and done!");
          }
          return false;
        }
      } else {
        if (mCl != 0) {
          decrementLevel1();
          initialiseCurrentPosition1();
        } else {
          if (VERBOSE) {
            System.out.print("                           valid --> ");
            printCountersF();
          }
          return true;
        }
      }
    }
  }

  /*
   * Set generic data in LA that applies to every lattice obtained from l by adding k atoms
   * covered by lattice antichains:  number of elements, levels, as well as
   *    up[i]  .....
   *   (lo[i]) lo[j]
   * for 1 < i < l.n <= j < la.n.  lo[i] may be modified in antichaindata_generateLattice.
   */
  void prepareLattice(final Lattice l, final Lattice la) {
    la.mN = (byte) (l.mN + mK);                          /* number of elements  */
    la.mNLev = l.mNLev + 1;                          /* number of levels    */
    System.arraycopy(l.mLev, 0, la.mLev, 0, l.mNLev);
    la.mLev[la.mNLev - 1] = la.mN;                   /* new level           */
    for (int j = l.mN; j < la.mN; ++j) {
      la.mLo[j] = (int) Utils.bit(j);                        /* lo[j]               */
    }
    System.arraycopy(l.mUp, 0, la.mUp, 0, l.mN);
    System.arraycopy(l.mLo, 0, la.mLo, 0, l.mN);
  }

  /*
   * Set la to the lattice obtained from l by adding k new atoms covered by the elements in the
   * lattice antichains described by AD:  stabiliser, as well as
   *   .....  up[j]
   *   lo[i]  .....
   * for 1 < i < l.n <= j < la.n.  ..... denotes data set in antichaindata_prepareLattice.
   * Note: The stabiliser of *la carries a reference count.
   */
  void generateLattice(final Lattice l, final Lattice la) {
    for (int k = mK, j = l.mN; k-- != 0; ++j) {
      /* set up[j] and lo[i] for 1 < i < l.n <= j < la.n */
      la.mUp[j] = (int) (Utils.bit(j) | mF[mFpos - k]);       /* up[j] */
      for (int i = 0; i < l.mN; ++i) {
        if ((mF[mFpos - k] & Utils.bit(i)) != 0) {
          la.mLo[i] |= Utils.bit(j);
        } else { /* lo[i] */
          la.mLo[i] &= ~Utils.bit(j);
        }
      }
    }
    /* set stabiliser */
    la.setStabiliser(mStabilisers[0].mSt, mStabilisers[0].mSi);
  }

  /*
   * Set *la to the lattice obtained from *l by adding k new atoms covered by the elements in the
   * lattice antichains described by *AD:  stabiliser, as well as
   *   .....  up[j]
   *   lo[i]  .....
   * for 1 < i < l.n <= j < la.n.  ..... denotes data set in antichaindata_prepareLattice.
   * Special case of a single antichain.
   * Note: The stabiliser of *la carries a reference count.
   */
  void generateLattice1(final Lattice l, final Lattice la) {
    /* set up[j] and lo[i] for 1 < i < l.n <= j < la.n */
    la.mUp[l.mN] = (int) (Utils.bit(l.mN) | mF[mFpos]);   /* up[j] */
    for (int i = 0; i < l.mN; ++i) {    /* lo[i] */
      if ((mF[mFpos] & Utils.bit(i)) != 0) {
        la.mLo[i] |= Utils.bit(l.mN);
      } else {   /* lo[i] */
        la.mLo[i] &= ~Utils.bit(l.mN);
      }
    }
    /* set stabiliser */
    la.setStabiliser(mStabilisers[0].mSt, mStabilisers[0].mSi);
  }

  /*
   * TEST FUNCTION: Print all set bits in each antichain in *
   */
  void printAntichains() {
    final int[] a = new int[1];
    final int[] i = new int[1];
    final StringBuilder sb = new StringBuilder();
    for (int j = mK; j-- != 0; ) {
      /* extract the j-th lattice-antichain described by *AD, i.e. the minimal elements of the up-closed set */
      a[0] = 0;
      for (i[0] = 0; i[0] < mLattice.mN; ++i[0]) {
        if ((mF[mFpos - j] & Utils.bit(i[0])) != 0 && (mF[mFpos - j] & mLattice.mLo[i[0]]) == Utils.bit(i[0])) {
          a[0] |= Utils.bit(i[0]);
        }
      }
      while (Utils.extractLSB32(a, i)) {
        sb.append(i[0]).append(' ');
      }
      sb.append(" | ");
    }
    System.out.println(sb);
  }

  /*
   * TEST FUNCTION: Print all counters for each position and each level in
   */
  void printCounters() {
    final StringBuilder sb = new StringBuilder("cl:").append(mCl).append(", cp:").append(mCp).append("   ");
    for (int j = 0; j < mK; ++j) {
      for (int m = mLattice.mNLev - 2; m >= mCl; --m) {
        final int[] a = {(int) ((j > mCp ? 0 : mF[(mLattice.mNLev - 2 - m) * mK + j]) | mO[j] & Utils.bit(mLattice.mLev[m + 1]) - Utils.bit(mLattice.mLev[m]))};
        final int[] i = new int[1];
        while (Utils.extractLSB32(a, i)) {
          sb.append(i[0]).append(' ');
        }
        sb.append("; ");
      }
      sb.append(" | ");
    }
    System.out.println(sb);
  }

  /*
   * TEST FUNCTION: Print the counters F for each position and each level in *
   */
  void printCountersF() {
    final int[] i = new int[1];
    final StringBuilder sb = new StringBuilder("cl:").append(mCl).append(", cp:").append(mCp).append("   ");
    for (int j = 0; j < mK; ++j) {
      for (int m = mLattice.mNLev - 2; m >= mCl; --m) {
        final int[] a = {j > mCp ? 0 : mF[(mLattice.mNLev - 2 - m) * mK + j]};
        while (Utils.extractLSB32(a, i)) {
          sb.append(i[0]).append(' ');
        }
        sb.append("; ");
      }
      sb.append(" | ");
    }
    System.out.println(sb);
  }

///*
// * TEST FUNCTION: Return true if every antichain in *AD is a lattice-antichain; return false otherwise.
// */
//boolean antichaindata_test(antichaindata AD)
//{
//  int      i, j, k, d;
//  int  A, upA, m;
//
//  for (k=0; k<k; k++) {
//    /* extract the k-th lattice-antichain described by *AD, i.e. the minimal elements of the up-closed set */
//    A = 0;
//    for (i=0; i<L.n; i++)
//      if ((F[Fpos-k] & BIT(i)) && ((F[Fpos-k] & L.lo[i]) == BIT(i)))
//        A |= BIT(i);
//    /* test that A is an antichain */
//    for (i=0; i<L.n; i++)
//      if (A & BIT(i))
//        for (j=i+1; j<L.n; j++)
//          if (A & BIT(j))
//            if ((BIT(i)&L.up[j]) || (BIT(j)&L.up[i]) || (BIT(i)&L.lo[j]) || (BIT(j)&L.lo[i])) {
//              printf(">>> not an antichain %d:(%d,%d)\n", k, i, j);
//              return false;
//            }
//    /* up-close */
//    upA = 0;
//    for (i=0; i<L.n; i++)
//      if (A & BIT(i))
//        upA |= L.up[i];
//    if (upA != F[Fpos-k]) {
//      printf(">>> not up-closed %d:(%d)\n", k, i);
//      return false;
//    }
//    /* test gcd condition */
//    for (i=0; i<L.n; i++)
//      if (upA & BIT(i))
//        for (j=i+1; j<L.n; j++)
//          if (upA & BIT(j)) {
//            m = L.lo[i] & L.lo[j];
//            for (d=0; d<L.n && !(m&BIT(d)); d++)
//              ;
//            if (d < L.n && !(upA&BIT(d))) {
//              printf(">>> not a lattice-antichain %d:(%d,%d) [%d]\n", k, i, j, d);
//              return false;
//            }
//
//          }
//  }
//  return true;
//}
}
