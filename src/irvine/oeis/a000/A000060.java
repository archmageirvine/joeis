package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000060.
 * @author Sean A. Irvine
 */
public class A000060 extends A000151 {

  @Override
  public Z next() {
    Z r = super.next();
    if ((mN & 1) == 0) {
      r = r.add(get(mN / 2));
    }
    for (int k = 1; k < mN; ++k) {
      r = r.subtract(get(k).multiply(get(mN - k)));
    }
    return r;
  }
}

