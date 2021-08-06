package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049644 T(n,n), array T given by A049639.
 * @author Sean A. Irvine
 */
public class A049644 extends A049639 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN));
  }
}
