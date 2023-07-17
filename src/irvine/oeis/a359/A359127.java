package irvine.oeis.a359;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002378;

/**
 * A359127 Oblong numbers which are products of six distinct primes.
 * @author Sean A. Irvine
 */
public class A359127 extends A002378 {

  /** Construct the sequence. */
  public A359127() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final FactorSequence fs = Jaguar.factor(t);
      if (fs.bigOmega() == 6 && fs.omega() == 6) {
        return t;
      }
    }
  }
}

