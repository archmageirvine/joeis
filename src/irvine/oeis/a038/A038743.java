package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038743 T(n,n-6), array T as in A038738.
 * @author Sean A. Irvine
 */
public class A038743 extends A038738 {

  {
    setOffset(6);
  }

  private long mN = 6;

  @Override
  public Z next() {
    return t(++mN, mN - 6);
  }
}
