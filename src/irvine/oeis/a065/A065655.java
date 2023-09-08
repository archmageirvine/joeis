package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065640.
 * @author Sean A. Irvine
 */
public class A065655 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final FactorSequence fs = Jaguar.factor(t);
      if (fs.phi().add(2).multiply(fs.sigma()).isSquare()) {
        return t;
      }
    }
  }
}
