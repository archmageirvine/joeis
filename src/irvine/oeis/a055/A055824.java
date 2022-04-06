package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055824 a(n) = T(2*n,n), array T as in A055818.
 * @author Sean A. Irvine
 */
public class A055824 extends A055818 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
