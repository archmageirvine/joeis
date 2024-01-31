package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054216 Numbers m such that m^2 is a concatenation of two consecutive decreasing numbers.
 * @author Sean A. Irvine
 */
public class A054216 extends A054215 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}

