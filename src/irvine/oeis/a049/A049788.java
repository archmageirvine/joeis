package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049788 a(n) = T(n,n-3), array T as in A049783.
 * @author Sean A. Irvine
 */
public class A049788 extends A049783 {

  {
    setOffset(4);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN - 3));
  }
}
