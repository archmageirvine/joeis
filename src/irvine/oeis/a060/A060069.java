package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a059.A059530;

/**
 * A060069 Number of n-block T_0-tricoverings.
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
        final Z t = get(k, mN).coeff(mN).coeff(k).multiply(Functions.FACTORIAL.z(k)).toZ();
        if (!sum.isZero() && t.isZero()) {
          break;
        }
        sum = sum.add(t);
      }
    }
    return sum;
  }
}
