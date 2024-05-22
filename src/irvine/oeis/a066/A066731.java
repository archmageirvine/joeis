package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066731 f-triperfect numbers, where f(n) = sigma(n) and f-triperfect numbers are defined similarly to f-perfect numbers in A066218.
 * @author Sean A. Irvine
 */
public class A066731 extends Sequence1 {

  private Z mN = Z.ZERO;

  protected Z f(final Z n) {
    return Functions.SIGMA1.z(n);
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
