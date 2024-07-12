package irvine.oeis.a071;

import irvine.math.z.Z;

/**
 * A071324 Alternating sum of all divisors of n; divisors nonincreasing, starting with n.
 * @author Sean A. Irvine
 */
public class A071324 extends A071323 {

  @Override
  public Z next() {
    return super.next().abs();
  }
}
