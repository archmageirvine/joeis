package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026524 a(n) = T(n, n-4), T given by A026519. Also a(n) = number of integer strings s(0), ..., s(n), counted by T, such that s(n) = 4.
 * @author Sean A. Irvine
 */
public class A026524 extends A026519 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, mN - 4);
  }
}
