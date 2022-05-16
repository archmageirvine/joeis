package irvine.oeis.a025;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002808;

/**
 * A025283 Composites that use the same digits as their prime factorization.
 * @author Sean A. Irvine
 */
public class A025283 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final String syndrome = ZUtils.syndrome(c);
      final StringBuilder flattened = new StringBuilder();
      final FactorSequence fs = Jaguar.factor(c);
      for (final Z p : fs.toZArray()) {
        flattened.append(p);
        if (fs.getExponent(p) > 1) {
          flattened.append(fs.getExponent(p));
        }
      }
      if (syndrome.equals(ZUtils.syndrome(flattened))) {
        return c;
      }
    }
  }
}
