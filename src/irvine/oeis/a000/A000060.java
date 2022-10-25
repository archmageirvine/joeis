package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000060 Number of signed trees with n nodes.
 * @author Sean A. Irvine
 */
public class A000060 extends A000151 {

  @Override
  public Z next() {
    Z r = super.next();
    if ((mN & 1) == 0) {
      r = r.add(a(mN / 2));
    }
    for (int k = 1; k < mN; ++k) {
      r = r.subtract(a(k).multiply(a(mN - k)));
    }
    return r;
  }
}

