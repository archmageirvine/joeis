package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072357 Cubefree nonsquares whose factorization into a product of primes contains exactly one square.
 * @author Sean A. Irvine
 */
public class A072357 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.omega() > 1 && fs.bigOmega() - fs.omega() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
