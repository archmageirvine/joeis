package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a373.A373387;

/**
 * A391434 allocated for Marco Rip\u00e0.
 * @author Sean A. Irvine
 */
public class A391434 extends A002808 {

  private final DirectSequence mA = new A373387();

  private boolean is(final Z n) {
    if (n.mod(10) == 0) {
      return false;
    }
    final Z cs = mA.a(n);
    final FactorSequence fs = Jaguar.factor(n);
    Z max = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      max = max.max(mA.a(p));
    }
    return max.equals(cs);
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

