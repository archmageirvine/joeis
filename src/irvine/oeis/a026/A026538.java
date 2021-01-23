package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026538 a(n)=T(n,n-1), T given by A026536. Also a(n) = number of integer strings s(0),...,s(n), counted by T, such that s(n)=1.
 * @author Sean A. Irvine
 */
public class A026538 extends A026536 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
