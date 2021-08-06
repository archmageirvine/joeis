package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049620 a(n) = T(n,n), array T as in A049615.
 * @author Sean A. Irvine
 */
public class A049620 extends A049615 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN));
  }
}
