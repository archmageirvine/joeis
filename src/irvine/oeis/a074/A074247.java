package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074247 Numbers n such that harmonic mean of the divisors of n is a prime.
 * @author Sean A. Irvine
 */
public class A074247 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z a = fs.sigma0().multiply(mN);
      final Z b = fs.sigma();
      if (a.mod(b).isZero() && a.divide(b).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
