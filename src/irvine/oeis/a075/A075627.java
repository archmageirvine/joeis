package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075627 Initial terms of groups in A075626.
 * @author Sean A. Irvine
 */
public class A075627 extends A075626 {

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
