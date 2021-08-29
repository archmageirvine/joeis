package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051227 Numbers m such that the Bernoulli number B_{2*m} has denominator 42.
 * @author Sean A. Irvine
 */
public class A051227 extends A051228 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
