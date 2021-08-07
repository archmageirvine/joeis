package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049691 a(n)=T(n,n), array T as in A049687. Also a(n)=T(2n,2n), array T given by A049639.
 * @author Sean A. Irvine
 */
public class A049691 extends A049687 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN));
  }
}
