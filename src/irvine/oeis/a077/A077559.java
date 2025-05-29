package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077559 Final terms of rows of A077558.
 * @author Sean A. Irvine
 */
public class A077559 extends A077558 {

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
