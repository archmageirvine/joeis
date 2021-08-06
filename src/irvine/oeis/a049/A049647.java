package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049647 T(n,n+2), array T given by A049639.
 * @author Sean A. Irvine
 */
public class A049647 extends A049639 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN + 2));
  }
}
