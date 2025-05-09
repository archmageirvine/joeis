package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077161 Final terms of rows of triangle in A077159.
 * @author Sean A. Irvine
 */
public class A077161 extends A077159 {

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

