package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075641 Initial terms of groups in A075639.
 * @author Sean A. Irvine
 */
public class A075641 extends A075639 {

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
