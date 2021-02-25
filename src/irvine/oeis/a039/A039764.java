package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039764 D-analogs of Bell numbers.
 * @author Sean A. Irvine
 */
public class A039764 extends A039760 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}

