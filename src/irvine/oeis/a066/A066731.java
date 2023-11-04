package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036839.
 * @author Sean A. Irvine
 */
public class A066731 extends Sequence1 {

  private Z mN = Z.ZERO;

  protected Z f(final Z n) {
    return Jaguar.factor(n).sigma();
  }

  private Z d(final Z n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(f(d));
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (d(mN).equals(f(mN).multiply(3))) {
        return mN;
      }
    }
  }
}
