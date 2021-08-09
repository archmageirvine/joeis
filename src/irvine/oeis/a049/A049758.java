package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049758 a(n) = T(n,3), array T as in A049747.
 * @author Sean A. Irvine
 */
public class A049758 extends A049747 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, 3L));
  }
}
