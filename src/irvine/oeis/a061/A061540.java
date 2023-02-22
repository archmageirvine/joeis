package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a001.A001864;

/**
 * A061540 Number of connected labeled graphs with n nodes and n+1 edges.
 * @author Sean A. Irvine
 */
public class A061540 extends A001864 {

  @Override
  public Z next() {
    return super.next().multiply(14).negate().add(Z.valueOf(mN).pow(mN - 2).multiply(mN - 1).multiply(5L * mN * mN + 3L * mN + 2)).divide(24);
  }
}
