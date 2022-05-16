package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001599 Harmonic or Ore numbers: numbers n such that the harmonic mean of the divisors of n is an integer.
 * @author Sean A. Irvine
 */
public class A001599 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().multiply(mN).mod(fs.sigma()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
