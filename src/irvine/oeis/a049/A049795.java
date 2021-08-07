package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049795 a(n) = T(n,n-3), array T as in A049790.
 * @author Sean A. Irvine
 */
public class A049795 extends A049790 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN <= 3 ? Z.valueOf(mN) : Z.valueOf(t(mN, mN - 3));
  }
}
