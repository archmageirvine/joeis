package irvine.oeis.a258;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001694;

/**
 * A258565 Arithmetic derivative of powerful numbers, cf. A001694.
 * @author Georg Fischer
 */
public class A258565 extends A001694 {

  @Override
  public Z next() {
    final Z term = super.next();
    final FactorSequence fs = Jaguar.factor(term);
    Z s = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      s = s.add(term.divide(p).longValueExact() * fs.getExponent(p));
    }
    return s;
  }
}
