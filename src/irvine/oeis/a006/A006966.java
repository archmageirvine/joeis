package irvine.oeis.a006;

import gebhardt.Benes;
import gebhardt.Constants;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006966.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
public class A006966 implements Sequence {

  // Original notice:

  /*
   * main.c
   *
   * Created on: 22 Mar 2014
   * Last modified: 23 Feb 2019
   * Author: Volker Gebhardt, v.gebhardt@westernsydney.edu.au
   *
   *   Copyright (C) 2015-2019 by Volker Gebhardt
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

  //#include "build.h"
//#include "globals.h"
//#include "lattice.h"
//#include "lattEnum.h"

  /*
   * Initialise global bitmaps to size N.
   */
  private static void bitmap_init(long N) {
    long bits, a1, b1, a2, b2;

    bits = Constants.BITSPERFLAGS64;
    if (Constants.MAXN > bits) {
      throw new UnsupportedOperationException("Build problem: flags64 cannot hold MAXN bits!");
    }
    b1 = (long) Math.floor(Math.sqrt(bits));
    a1 = bits / b1;
    b2 = (long) Math.ceil(Math.sqrt(bits));
    a2 = bits / b2;
    if (Constants.MAXN > 2 * a1 + b1 + 2 || Constants.MAXN > 2 * a2 + b2 + 2) {
      throw new UnsupportedOperationException("Build problem: packed antichain lists don't fit into two flags64!");
    }
    if (N > Constants.MAXN) {
      throw new UnsupportedOperationException("The maximal number of elements with this executable is " + Constants.MAXN);
    }
    if ((Constants.MAXN_EVEN & Constants.MAXN) != 0) {
      throw new UnsupportedOperationException("Build problem: Specified parity of MAXN is wrong!");
    }
    if ((long) Math.ceil(Math.log(Constants.MAXN - 2) / Math.log(2)) != Constants.LD_MAXN_2) {
      throw new UnsupportedOperationException("Build problem: Specified value of LD_MAXN_2 is wrong!");
    }
    if (Long.compareUnsigned(Constants.FSIZE, 1L << (Long.SIZE - 1)) >= 0) {
      throw new UnsupportedOperationException("Build problem: elt cannot hold offsets in antichain.F!");
    }
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    bitmap_init(mN);
    Benes.benes_init_small();
//    lattice L;
//    globals GD;
//    globals_init(GD);
//    lattice_init_2(L);
//    lattEnum E = lattEnum_Count_create(L, mN, 3, GD);
//    lattEnum_doEnumeration(E);
//    return Z.valueOf(lattEnum_getLatticeCount(E));
    return null;

// Legacy:
//	printf("%llu\n", );
//	lattEnum_Count_free(E);
//	lattice_clearStabiliser(L);
//	globals_free(GD);
//	benes_free_small();
  }
}
