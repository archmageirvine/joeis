package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085577 Size of maximal subset of the n^2 cells in an n X n grid such that there are at least 3 edges between any pair of chosen cells.
 * @author Sean A. Irvine
 */
public class A085577 extends A085576 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN));
  }
}
