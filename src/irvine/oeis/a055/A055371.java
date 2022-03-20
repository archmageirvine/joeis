package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055371 Column 1 of triangle A055370.
 * @author Sean A. Irvine
 */
public class A055371 extends A055370 {

  private long mN = -2;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
