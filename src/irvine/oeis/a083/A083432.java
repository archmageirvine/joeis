package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083432 Largest k such that n*k is a number that is formed using all the digits of first n numbers. a(n) = A083431(n)/n.
 * @author Sean A. Irvine
 */
public class A083432 extends A083431 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
