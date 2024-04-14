package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;

/**
 * A069236 Integers m, not a perfect square, such that the squarefree part of m divides phi(m).
 * @author Sean A. Irvine
 */
public class A069236 extends A000037 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      if (fs.phi().mod(fs.core()).isZero()) {
        return n;
      }
    }
  }
}

