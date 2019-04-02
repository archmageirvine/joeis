package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007920 Smallest number k such that n + k is prime.
 * @author Sean A. Irvine
 */
public class A007920 extends A007918 {

  @Override
  public Z next() {
    return super.next().subtract(mN);
  }
}
