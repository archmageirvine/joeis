package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077323 Final terms of rows of A077321.
 * @author Sean A. Irvine
 */
public class A077323 extends A077321 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
