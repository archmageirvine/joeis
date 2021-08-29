package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051225 Numbers m such that the Bernoulli number B_{2*m} has denominator 30.
 * @author Sean A. Irvine
 */
public class A051225 extends A051226 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
