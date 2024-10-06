package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072501 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prodAbove = Z.ONE;
    Z prodBelow = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      final int c = d.square().compareTo(mN);
      // c == 0 cancels in ratio
      if (c < 0) {
        prodBelow = prodBelow.multiply(d);
      } else if (c > 0) {
        prodAbove = prodAbove.multiply(d);
      }
    }
    return prodAbove.divide(prodBelow);
  }
}

