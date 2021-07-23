package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049227 Sigma(n) / d(n) is a perfect square associated with A049226.
 * @author Sean A. Irvine
 */
public class A049227 implements Sequence {

  private long mN = 118;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.bigOmega() > 1) {
        final Z sigma = fs.sigma();
        if (sigma.subtract(mN).isSquare()) {
          final Z[] qr = sigma.divideAndRemainder(fs.sigma0());
          if (qr[1].isZero() && qr[0].isSquare()) {
            return qr[0];
          }
        }
      }
    }
  }
}
