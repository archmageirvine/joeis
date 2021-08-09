package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049707 a(n) = T(n,n+3), array T as in A049704.
 * @author Sean A. Irvine
 */
public class A049707 extends A049704 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN + 3));
  }
}
