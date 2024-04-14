package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A069192.
 * @author Sean A. Irvine
 */
public class A069237 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      if (fs.phi().mod(fs.sigma0()).isZero()) {
        return n;
      }
    }
  }
}

