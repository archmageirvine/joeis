package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049787 a(n) = T(n,n-2), array T as in A049783.
 * @author Sean A. Irvine
 */
public class A049787 extends A049783 {

  {
    setOffset(3);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN - 2));
  }
}
