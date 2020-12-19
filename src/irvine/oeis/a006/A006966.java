package irvine.oeis.a006;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import gebhardt.Benes;
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

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private static int SMALL = 7;

  protected int mN = -1;
  {
    Benes.initSmall();
  }

  protected LattEnum getEnum(final Lattice lattice, final int minSize) {
    return new LattEnum.LattEnumCount(lattice, mN, minSize, new Globals());
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }

    if (mN >= SMALL) {
      final LattEnum.LattAccumulate accumulate = new LattEnum.LattAccumulate(Lattice.init2(), SMALL, 3, new Globals());
      accumulate.doEnumeration();
      //System.out.println("Precomputed lattices = " + accumulate.mLattices.size());
      final ForkJoinPool forkJoinPool = new ForkJoinPool(THREADS);
      try {
        System.out.println("Running with " + THREADS + " threads");
        return forkJoinPool.submit(() -> accumulate.mLattices.parallelStream().map(lattice -> {
          final LattEnum et = getEnum(lattice, SMALL + 1);
          et.doEnumeration();
          return et.getCount();
          }
        )).get().reduce(Z.ZERO, Z::add);
      } catch (final InterruptedException | ExecutionException e) {
        throw new RuntimeException(e);
      }
    }

    final LattEnum e = getEnum(Lattice.init2(), 3);
    e.doEnumeration();
    return e.getCount();
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
