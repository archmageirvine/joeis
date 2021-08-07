package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049741 a(n)=T(n,n+1), array T as in A049735.
 * @author Sean A. Irvine
 */
public class A049741 extends A049735 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN + 1));
  }
}
