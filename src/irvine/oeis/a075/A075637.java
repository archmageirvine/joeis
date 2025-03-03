package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075637 Initial terms of groups in A075635.
 * @author Sean A. Irvine
 */
public class A075637 extends A075635 {

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
