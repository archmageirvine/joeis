package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077342 First column of A077341.
 * @author Sean A. Irvine
 */
public class A077342 extends A077341 {

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

