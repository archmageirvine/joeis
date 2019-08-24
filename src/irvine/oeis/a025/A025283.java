package irvine.oeis.a025;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002808;

/**
 * A025283.
 * @author Sean A. Irvine
 */
public class A025283 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final String syndrome = ZUtils.syndrome(c);
      final StringBuilder flattened = new StringBuilder();
      final FactorSequence fs = Cheetah.factor(c);
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
