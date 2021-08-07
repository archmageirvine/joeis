package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049794 a(n) = T(n,n-2), array T as in A049790.
 * @author Sean A. Irvine
 */
public class A049794 extends A049790 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN <= 2 ? Z.valueOf(mN) : Z.valueOf(t(mN, mN - 2));
  }
}
