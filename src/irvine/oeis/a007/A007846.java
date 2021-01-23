package irvine.oeis.a007;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007846 There are three equivalent descriptions: 1. Number of (horizontally or vertically) connected arrays of 1..n on rectangular grid (otherwise zero) with only one local maximum. 2. Number of n-polyominoes labeled 1...n such that each successive labeled cell is the neighbor of a previously labeled cell. 3. Number of connected n-step paths on a rectangular lattice, diagonal or repeated steps not allowed.
 * @author Sean A. Irvine
 */
public class A007846 implements Sequence {

  private final ParallelHunter mHunter = new ParallelHunter(4, Lattices.Z2, false);
  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
