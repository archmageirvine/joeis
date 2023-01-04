package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060856 Multi-dimensional Catalan numbers: diagonal T(n,n+2) of A060854.
 * @author Sean A. Irvine
 */
public class A060856 extends A060854 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, mN + 2);
  }
}
