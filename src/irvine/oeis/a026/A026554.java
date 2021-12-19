package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026554 a(n) = T(n,n-1), T given by A026552. Also a(n) is the number of integer strings s(0),...,s(n) counted by T, such that s(n)=1.
 * @author Sean A. Irvine
 */
public class A026554 extends A026552 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
