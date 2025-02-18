package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075385 Final term of n-th group in A075383.
 * @author Sean A. Irvine
 */
public class A075385 extends A075383 {

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
