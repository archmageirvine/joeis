package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049623 a(n) = T(n,n+3), array T as in A049615.
 * @author Sean A. Irvine
 */
public class A049623 extends A049615 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN + 3));
  }
}
