package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064500 Smallest number with n decimal digits such that the product of its digits equals n * the sum of its digits, or 0 if impossible.
 * @author Sean A. Irvine
 */
public class A064500 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(10).add(1);
    }
    if (Jaguar.factor(mN).largestPrimeFactor().compareTo(Z.TEN) > 0) {
      return Z.ZERO;
    }
    Z t = mA;
    while (true) {
      if (Functions.DIGIT_SUM.l(t) * mN == Functions.DIGIT_PRODUCT.l(t)) {
        return t;
      }
      t = t.add(1);
    }
  }
}
