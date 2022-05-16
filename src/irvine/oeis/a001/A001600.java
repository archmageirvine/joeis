package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001600 Harmonic means of divisors of harmonic numbers.
 * @author Sean A. Irvine
 */
public class A001600 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z[] qr = fs.sigma0().multiply(mN).divideAndRemainder(fs.sigma());
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
