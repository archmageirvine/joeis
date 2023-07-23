package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060051 Number of n-block r-bicoverings.
 * @author Sean A. Irvine
 */
public class A060051 extends A060052 {

  {
    setOffset(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN == 2) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    int k = 1;
    while (true) {
      final Z t = t(++k, mN);
      if (k > mN && t.isZero()) {
        break;
      }
      sum = sum.add(t);
    }
    return sum;
  }
}
