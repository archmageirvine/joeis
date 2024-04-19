package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008793 The problem of the calissons: number of ways to tile a hexagon of edge n with diamonds of side 1. Also number of plane partitions whose Young diagrams fit inside an n X n X n box.
 * @author Sean A. Irvine
 */
public class A008793 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(Functions.FACTORIAL.z(2 * mN + k - 1).multiply(Functions.FACTORIAL.z(k - 1))).divide(Functions.FACTORIAL.z(mN + k - 1).square());
    }
    return prod;
  }
}


