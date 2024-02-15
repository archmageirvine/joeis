package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A068418 Composite numbers k such that k - phi(k) divides sigma(k) - k.
 * @author Sean A. Irvine
 */
public class A068418 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next();
      final FactorSequence fs = Jaguar.factor(k);
      if (fs.sigma().subtract(k).mod(k.subtract(fs.phi())).isZero()) {
        return k;
      }
    }
  }
}

