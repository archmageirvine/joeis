package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077525 Last term of n-th row of A077526.
 * @author Sean A. Irvine
 */
public class A077525 extends A077526 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
