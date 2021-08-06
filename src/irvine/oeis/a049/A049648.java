package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049648 T(n,n+1), array T as in A049687 and T(2n,2n+2), array T given by A049639.
 * @author Sean A. Irvine
 */
public class A049648 extends A049639 {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(t(mN, mN + 2));
  }
}
