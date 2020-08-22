package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026523 a(n) = T(n,n-3), T given by A026519. Also a(n) = number of integer strings s(0),...,s(n), counted by T, such that s(n)=3.
 * @author Sean A. Irvine
 */
public class A026523 extends A026519 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
