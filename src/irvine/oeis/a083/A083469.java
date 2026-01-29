package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083469 Smallest k such that n*k is a reverse concatenation of n consecutive natural numbers. a(n) = A083468(n)/n.
 * @author Sean A. Irvine
 */
public class A083469 extends A083468 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
