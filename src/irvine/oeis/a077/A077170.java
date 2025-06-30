package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077170 Final terms of rows of A077168.
 * @author Sean A. Irvine
 */
public class A077170 extends A077168 {

  {
    setOffset(0);
  }

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

