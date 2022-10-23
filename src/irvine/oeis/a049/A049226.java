package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049226 Composite numbers n such that the sum of divisors of n, sigma(n), divided by the number of divisors, d(n) and sigma(n) minus n are both rational squares.
 * @author Sean A. Irvine
 */
public class A049226 extends Sequence1 {

  private long mN = 118;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() > 1) {
        final Z sigma = fs.sigma();
        if (sigma.subtract(mN).isSquare()) {
          final Z[] qr = sigma.divideAndRemainder(fs.sigma0());
          if (qr[1].isZero() && qr[0].isSquare()) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
