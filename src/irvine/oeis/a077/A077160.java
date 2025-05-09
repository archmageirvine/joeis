package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077160 Leading terms of rows of triangle in A077159.
 * @author Sean A. Irvine
 */
public class A077160 extends A077159 {

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

