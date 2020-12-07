package gebhardt;

/**
 * Permutation group.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
class PermGrp {

  // Original header:

  /*
   * permgrp.c
   *
   * Created on: 23 May 2014
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

  final byte[][] mPerm = new byte[Utils.MAXN - 2][];           /* permutations for generators; DATA IS NOT CONSECUTIVE DURING CONSTRUCTION */
  final byte[][] mInvPerm = new byte[Utils.MAXN - 2][];        /* permutations for inverses of generators */
  int mInvol;                  /* invol & BIT[i] indicates whether generator i is an involution */
  int mBenesValid = 0;             /* which levels of array Benes contain valid pointers */
  final Benes[][] mBenes;  /* *(Benes[i][j]): Bene&scaron; network for the action of generator j on level i */
  int mN = 0;                      /* number of points on which the group acts */
  int mNgens = 0;                  /* number of generators */

  /*
   * Set G to the trivial permutation group on n points.
   */
  void init(final int n) {
    mN = n;
    mNgens = 0;
  }

  /** Default constructor. */
  public PermGrp() {
    mBenes = new Benes[Utils.MAXN - 2][Utils.MAXN - 2];
  }

  /*
   * Copy constructor.
   */
  PermGrp(final PermGrp g) {
    mN = g.mN;
    mNgens = g.mNgens;
//    mPerm = Arrays.copyOf(g.mPerm, g.mPerm.length);
//    mInvPerm = Arrays.copyOf(g.mInvPerm, g.mInvPerm.length);
    for (int k = 0; k < mN; ++k) { /* We need g.n instead of g.ngens to work in the general case! */
      if (g.mPerm[k] != null) {
        Permutation.copy(mN, g.mPerm[k], mPerm[k]);
        Permutation.copy(mN, g.mInvPerm[k], mInvPerm[k]);
      }
    }
    mInvol = g.mInvol;
//    mBenes = g.mBenes;
//    mBenesValid = g.mBenesValid;
    mBenes = new Benes[Utils.MAXN - 2][Utils.MAXN - 2];
  }


  /**
   * TEST FUNCTION:  Print current generators (in array notation).
   * @param g the group
   * @param offset an offset
   */
  public static void printGenerators(final PermGrp g, final int offset) {
    for (int i = 0; i < g.mNgens; ++i) {
      Permutation.print(g.mN, g.mPerm[i], offset);
    }
  }
}
