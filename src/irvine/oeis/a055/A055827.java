package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055827 a(n) = T(2n+3,n), array T as in A055818.
 * @author Sean A. Irvine
 */
public class A055827 extends A055818 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN + 3, mN);
  }
}
