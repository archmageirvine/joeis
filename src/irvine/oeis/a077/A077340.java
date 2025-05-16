package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077340 Final terms of rows in A077339.
 * @author Sean A. Irvine
 */
public class A077340 extends A077339 {

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

