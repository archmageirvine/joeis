package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077165 Leading terms of rows in A077164.
 * @author Sean A. Irvine
 */
public class A077165 extends A077164 {

  private long mN = -2;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}

