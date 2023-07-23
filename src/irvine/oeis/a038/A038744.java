package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038744 T(2n,n), array T as in A038738.
 * @author Sean A. Irvine
 */
public class A038744 extends A038738 {

  {
    setOffset(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return t(2 * ++mN + 1, mN + 1);
  }
}
