package irvine.oeis.a006;

import gebhardt.Benes;
import gebhardt.Utils;
import gebhardt.Globals;
import gebhardt.lattEnum;
import gebhardt.lattice;
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
   * Initialise global bitmaps to size n.
   */
  private static void bitmap_init(long n) {
    long bits, a1, b1, a2, b2;

    bits = Utils.BITSPERFLAGS64;
    if (Utils.MAXN > bits) {
      throw new UnsupportedOperationException("Build problem: flags64 cannot hold MAXN bits!");
    }
    b1 = (long) Math.floor(Math.sqrt(bits));
    a1 = bits / b1;
    b2 = (long) Math.ceil(Math.sqrt(bits));
    a2 = bits / b2;
    if (Utils.MAXN > 2 * a1 + b1 + 2 || Utils.MAXN > 2 * a2 + b2 + 2) {
      throw new UnsupportedOperationException("Build problem: packed antichain lists don't fit into two flags64!");
    }
    if (n > Utils.MAXN) {
      throw new UnsupportedOperationException("The maximal number of elements with this executable is " + Utils.MAXN);
    }
    if ((Utils.MAXN_EVEN & Utils.MAXN) != 0) {
      throw new UnsupportedOperationException("Build problem: Specified parity of MAXN is wrong!");
    }
    if ((long) Math.ceil(Math.log(Utils.MAXN - 2) / Math.log(2)) != Utils.LD_MAXN_2) {
      throw new UnsupportedOperationException("Build problem: Specified value of LD_MAXN_2 is wrong!");
    }
    if (Long.compareUnsigned(Utils.FSIZE, 1L << (Long.SIZE - 1)) >= 0) {
      throw new UnsupportedOperationException("Build problem: elt cannot hold offsets in antichain.F!");
    }
  }

  private int mN = -1;
  {
    Benes.initSmall();
  }
  final Globals mGlobals = new Globals();
  final lattice mLattice = lattice.lattice_init_2();

  @Override
  public Z next() {
    if (++mN <= 1) { // can make this 3
      return Z.ONE;
    }
    bitmap_init(mN);
    final lattEnum E = lattEnum.lattEnum_Count_create(mLattice, mN, 3, mGlobals);
    lattEnum.lattEnum_doEnumeration(E);
    return Z.valueOf(lattEnum.lattEnum_getLatticeCount(E));
  }
}
