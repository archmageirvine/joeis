package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049699 a(n) = T(n,n+3), array T as in A049695.
 * @author Sean A. Irvine
 */
public class A049699 extends A049695 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN + 3));
  }
}
