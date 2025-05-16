package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077343 Final terms of rows in A077341.
 * @author Sean A. Irvine
 */
public class A077343 extends A077341 {

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

