package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a373.A373387;

/**
 * A391695 Composite numbers k, not multiples of 10, whose (radix-10) constant congruence speed equals the minimum of the (radix-10) constant congruence speeds of all the prime factors of k.
 * @author Sean A. Irvine
 */
public class A391695 extends A002808 {

  private final DirectSequence mA = new A373387();

  private boolean is(final Z n) {
    if (n.mod(10) == 0) {
      return false;
    }
    final Z cs = mA.a(n);
    final FactorSequence fs = Jaguar.factor(n);
    Z min = null;
    for (final Z p : fs.toZArray()) {
      final Z cp = mA.a(p);
      if (min == null || cp.compareTo(min) < 0) {
        min = cp;
        if (min.compareTo(cs) < 0) {
          return false;
        }
      }
    }
    return min.equals(cs);
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

