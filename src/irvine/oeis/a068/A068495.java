package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A068495 Composite n such that n reduced mod(phi(n)) = sigma(n) reduced mod(n).
 * @author Sean A. Irvine
 */
public class A068495 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      final Z phi = fs.phi();
      if (n.mod(phi).equals(fs.sigma().mod(n))) {
        return n;
      }
    }
  }
}

