package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077173 Initial terms of rows of triangle in A077172.
 * @author Sean A. Irvine
 */
public class A077173 extends A077172 {

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

