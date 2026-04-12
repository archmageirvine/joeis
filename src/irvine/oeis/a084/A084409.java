package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084409 Main diagonal of triangle A084408.
 * @author Sean A. Irvine
 */
public class A084409 extends A084408 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
