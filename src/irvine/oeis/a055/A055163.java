package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A055163 Composite numbers k such that (k - phi(k)) | sigma(k).
 * @author Sean A. Irvine
 */
public class A055163 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      if (fs.sigma().mod(n.subtract(fs.phi())).isZero()) {
        return n;
      }
    }
  }
}
