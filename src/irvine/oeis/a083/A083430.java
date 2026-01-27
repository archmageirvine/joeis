package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083430 Smallest k such that k*n is a number that is a permutation of the digits of first n numbers. a(n) = A083429(n)/n.
 * @author Sean A. Irvine
 */
public class A083430 extends A083429 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
