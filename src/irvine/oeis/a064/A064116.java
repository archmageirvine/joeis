package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A064116 Composite numbers whose sum of aliquot divisors as well as product of aliquot divisors is a perfect square.
 * @author Sean A. Irvine
 */
public class A064116 extends A002808 {

  private boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    if (fs.sigma().subtract(n).isSquare()) {
      Z prod = Z.ONE;
      for (final Z d : fs.divisors()) {
        if (!n.equals(d)) {
          prod = prod.multiply(d);
        }
      }
      return prod.isSquare();
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (is(t)) {
        return t;
      }
    }
  }
}

