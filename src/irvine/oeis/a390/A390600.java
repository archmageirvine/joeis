package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a387.A373387;

/**
 * A390600 Composite numbers (not multiples of 10) whose constant congruence speed equals the sum of the constant congruence speeds of all its prime factors counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A390600 extends A002808 {

  private final DirectSequence mA = new A373387();

  private boolean is(final Z n) {
    if (n.mod(10) == 0) {
      return false;
    }
    final Z cs = mA.a(n);
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(mA.a(p).multiply(fs.getExponent(p)));
      if (sum.compareTo(cs) > 0) {
        return false;
      }
    }
    return sum.equals(cs);
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

