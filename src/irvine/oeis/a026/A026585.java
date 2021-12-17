package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026585 a(n) = T(n,n), T given by A026584. Also a(n) is the number of integer strings s(0), ..., s(n) counted by T, such that s(n)=0.
 * @author Sean A. Irvine
 */
public class A026585 extends A026584 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
