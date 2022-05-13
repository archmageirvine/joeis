package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056898 a(n) = smallest number m such that m^2+n is prime.
 * @author Sean A. Irvine
 */
public class A056898 extends A056897 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
