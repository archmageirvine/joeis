package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077530 Final terms of rows of A077529.
 * @author Sean A. Irvine
 */
public class A077530 extends A077529 {

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
