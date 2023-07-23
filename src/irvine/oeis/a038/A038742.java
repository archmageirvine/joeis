package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038742 T(n,n-5), array T as in A038738.
 * @author Sean A. Irvine
 */
public class A038742 extends A038738 {

  {
    setOffset(5);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return t(++mN, mN - 5);
  }
}
