package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055906 Column 0 of triangle A055905.
 * @author Sean A. Irvine
 */
public class A055906 extends A055905 {

  private long mN = -1;

  @Override
  public Z next() {
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    ++mN;
    return super.next();
  }
}
