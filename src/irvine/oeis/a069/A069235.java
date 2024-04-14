package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;

/**
 * A069235 Numbers k, not perfect squares, such that the squarefree part of k divides sigma(k).
 * @author Sean A. Irvine
 */
public class A069235 extends A000037 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      if (fs.sigma().mod(fs.core()).isZero()) {
        return n;
      }
    }
  }
}

