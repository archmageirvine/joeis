package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049228 sigma(n)-n is a perfect square associated with A049226.
 * @author Sean A. Irvine
 */
public class A049228 implements Sequence {

  private long mN = 118;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.bigOmega() > 1) {
        final Z sigma = fs.sigma();
        final Z s = sigma.subtract(mN);
        if (s.isSquare()) {
          final Z[] qr = sigma.divideAndRemainder(fs.sigma0());
          if (qr[1].isZero() && qr[0].isSquare()) {
            return s;
          }
        }
      }
    }
  }
}
