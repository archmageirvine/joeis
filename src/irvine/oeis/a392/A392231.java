package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a373.A373387;

/**
 * A392231 Positive integers (not multiples of 10) whose constant congruence speed is smaller than the product of the constant congruence speeds of all their prime factors (see A373387 for the definition of "constant congruence speed").
 * @author Sean A. Irvine
 */
public class A392231 extends Sequence1 {

  private final DirectSequence mA = new A373387();
  private long mN = 13;

  private boolean is(final long n) {
    if (n % 10 == 0) {
      return false;
    }
    final Z cs = mA.a(Z.valueOf(n));
    final FactorSequence fs = Jaguar.factor(n);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mA.a(p).pow(fs.getExponent(p)));
      if (prod.compareTo(cs) > 0) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

