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

  byte[][] mPerm = new byte[Utils.MAXN - 2][];           /* permutations for generators; DATA IS NOT CONSECUTIVE DURING CONSTRUCTION */
  byte[][] mInvPerm = new byte[Utils.MAXN - 2][];        /* permutations for inverses of generators */
  int mInvol;                  /* invol & BIT[i] indicates whether generator i is an involution */
  int mBenesValid = 0;             /* which levels of array Benes contain valid pointers */
  Benes[][] mBenes = new Benes[Utils.MAXN - 2][Utils.MAXN - 2];  /* *(Benes[i][j]): Bene&scaron; network for the action of generator j on level i */
  int mN = 0;                      /* number of points on which the group acts */
  int mNgens = 0;                  /* number of generators */

  /*
   * Set G to the trivial permutation group on n points.
   */
  void init(final int n) {
    mN = n;
    mNgens = 0;
  }


//  /*
//   * Copy g to H.
//   */
//  static void permgrp_cpy(PermGrp G, PermGrp H) {
//    final int n = H.mN = G.mN;
//    H.mNgens = G.mNgens;
//    for (int i = 0; i < n; i++) { /* We need G.n instead of G.ngens for permgrpc_cpy to work in the general case! */
//      Permutation.copy(n, G.mPerm[i], H.mPerm[i]);
//      Permutation.copy(n, G.mInvPerm[i], H.mInvPerm[i]);
//    }
//    H.mInvol = G.mInvol;
//  }


  /*
   * TEST FUNCTION:  Print current generators (in array notation).
   */
  static void printGenerators(final PermGrp g, final int offset) {
    for (int i = 0; i < g.mNgens; ++i) {
      Permutation.print(g.mN, g.mPerm[i], offset);
    }
  }
}
