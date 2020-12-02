package irvine.oeis.a006;

import gebhardt.Benes;
import gebhardt.Utils;
import gebhardt.Globals;
import gebhardt.LattEnum;
import gebhardt.Lattice;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006966 Number of lattices on n unlabeled nodes.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
public class A006966 implements Sequence {

  // This sequence is based on a C implementation by Volker Gebhardt.
  // If you are serious about calculating new terms for this sequence, then please
  // refer to the original implementation as it supports parallel computation and
  // other features not present here.
  // Cf. https://arxiv.org/abs/1609.08255

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

  /*
   * Initialise global bitmaps to size n.
   */
  private static void bitmapInit(final long n) {
    final long bits = Long.SIZE;
    final long b1 = (long) Math.floor(Math.sqrt(bits));
    final long a1 = bits / b1;
    final long b2 = (long) Math.ceil(Math.sqrt(bits));
    final long a2 = bits / b2;
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
  }

  protected int mN = -1;
  {
    Benes.initSmall();
  }
  protected final Globals mGlobals = new Globals();
  protected final Lattice mLattice = Lattice.init2();

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    bitmapInit(mN);
    final LattEnum e = getEnum();
    e.doEnumeration();
    return e.getCount();
  }

  protected LattEnum getEnum() {
    return new LattEnum.LattEnumCount(mLattice, mN, 3, mGlobals);
  }

  /**
   * Run this sequence for the specified value of <code>n</code>.
   * @param args value to run
   */
  public static void main(final String... args) {
    final int n = Integer.parseInt(args[0]);
    final A006966 seq = new A006966();
    seq.mN = n - 1;
    System.out.println(seq.next());
  }
}
