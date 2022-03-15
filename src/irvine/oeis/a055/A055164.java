package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A055164 (n - phi(n)) | sigma(n) for composite n not congruent to 2 (mod 4).
 * @author Sean A. Irvine
 */
public class A055164 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.mod(4) != 2) {
        final FactorSequence fs = Cheetah.factor(n);
        if (fs.sigma().mod(n.subtract(fs.phi())).isZero()) {
          return n;
        }
      }
    }
  }
}
