package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A064158.
 * @author Sean A. Irvine
 */
public class A064180 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final FactorSequence fs = Jaguar.factor(c);
      if (fs.sigma().subtract(c).subtract(1).isSquare() && c.pow(fs.sigma0().divide2().subtract(1)).isSquare()) {
        return c;
      }
    }
  }
}
