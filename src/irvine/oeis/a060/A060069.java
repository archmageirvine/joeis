package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a059.A059530;

/**
 * A060068.
 * @author Sean A. Irvine
 */
public class A060069 extends A059530 {

  private int mN = -1;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    if (mN > 3) {
      int k = 2;
      while (true) {
        ++k;
        final Z t = get(k, mN).coeff(mN).coeff(k).multiply(F.factorial(k)).toZ();
        if (!sum.isZero() && t.isZero()) {
          break;
        }
        sum = sum.add(t);
      }
    }
    return sum;
  }
}
