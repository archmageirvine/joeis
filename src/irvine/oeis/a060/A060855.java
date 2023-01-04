package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060855 Multi-dimensional Catalan numbers: diagonal T(n,n+1) of A060854.
 * @author Sean A. Irvine
 */
public class A060855 extends A060854 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, mN + 1);
  }
}
