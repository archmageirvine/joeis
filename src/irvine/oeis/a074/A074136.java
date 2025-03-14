package irvine.oeis.a074;

import irvine.math.z.Z;

/**
 * A074136 Main diagonal of triangle A074135.
 * @author Sean A. Irvine
 */
public class A074136 extends A074135 {

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
