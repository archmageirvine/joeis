package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051229 Numbers m such that the Bernoulli number B_{2*m} has denominator 66.
 * @author Sean A. Irvine
 */
public class A051229 extends A051230 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
