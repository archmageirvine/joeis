package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A000260 Number of rooted simplicial 3-polytopes with n+3 nodes; or rooted 3-connected triangulations with 2n+2 faces; or rooted 3-connected trivalent maps with 2n+2 vertices.
 * @author Sean A. Irvine
 */
public class A000260 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mF.factorial(4 * mN + 1).multiply2().divide(mF.factorial(mN + 1)).divide(mF.factorial(3 * mN + 2));
  }
}
