package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077665 Final term of n-th row of A077664.
 * @author Sean A. Irvine
 */
public class A077665 extends A077664 {

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
