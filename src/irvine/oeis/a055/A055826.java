package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055826 a(n) = T(2n+2,n), array T as in A055818.
 * @author Sean A. Irvine
 */
public class A055826 extends A055818 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN + 2, mN);
  }
}
