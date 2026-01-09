package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a373.A373387;

/**
 * A389981 Positive integers (not multiples of 10) whose constant congruence speed is greater than the product of the constant congruence speeds of all their prime factors (see A373387 for the definition of "constant congruence speed").
 * @author Sean A. Irvine
 */
public class A392233 extends A002808 {

  private final DirectSequence mA = new A373387();

  private boolean is(final Z n) {
    if (n.mod(10) == 0) {
      return false;
    }
    final Z cs = mA.a(n);
    final FactorSequence fs = Jaguar.factor(n);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mA.a(p).pow(fs.getExponent(p)));
      if (prod.compareTo(cs) > 0) {
        return false;
      }
    }
    return prod.equals(cs);
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (is(c)) {
        return c;
      }
    }
  }
}

