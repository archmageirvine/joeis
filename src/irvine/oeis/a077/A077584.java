package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077584 Last term of n-th row of A077583.
 * @author Sean A. Irvine
 */
public class A077584 extends A077583 {

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
