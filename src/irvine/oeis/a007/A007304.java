package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007304 Sphenic numbers: products of 3 distinct primes.
 * @author Sean A. Irvine
 */
public class A007304 extends Sequence1 {

  private long mN = 29;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() == 3 && fs.omega() == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
