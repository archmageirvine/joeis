package irvine.oeis.a359;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002378;

/**
 * A359304 Oblong numbers which are products of five distinct primes.
 * @author Sean A. Irvine
 */
public class A359304 extends A002378 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final FactorSequence fs = Jaguar.factor(t);
      if (fs.bigOmega() == 5 && fs.omega() == 5) {
        return t;
      }
    }
  }
}

