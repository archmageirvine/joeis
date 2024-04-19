package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000260 Number of rooted simplicial 3-polytopes with n+3 nodes; or rooted 3-connected triangulations with 2n+2 faces; or rooted 3-connected trivalent maps with 2n+2 vertices.
 * @author Sean A. Irvine
 */
public class A000260 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(4 * mN + 1).multiply2().divide(Functions.FACTORIAL.z(mN + 1)).divide(Functions.FACTORIAL.z(3 * mN + 2));
  }
}
