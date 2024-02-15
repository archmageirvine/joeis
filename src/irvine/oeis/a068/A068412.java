package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A068412 Composite numbers k such that phi(k) divides sigma(k) - 2*k.
 * @author Sean A. Irvine
 */
public class A068412 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next();
      final FactorSequence fs = Jaguar.factor(k);
      if (fs.sigma().subtract(k.multiply2()).mod(fs.phi()).isZero()) {
        return k;
      }
    }
  }
}

