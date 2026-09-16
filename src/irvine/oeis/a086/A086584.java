package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086584 a(n) = A086582(2^n-1) for n&gt;=0.
 * @author Sean A. Irvine
 */
public class A086584 extends A086582 {

  private long mN = 0;

  @Override
  public Z next() {
    for (long k = 1; k < mN; ++k) {
      super.next();
    }
    mN = mN == 0 ? 1 : mN * 2;
    return super.next();
  }
}
