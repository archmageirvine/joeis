package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046987 Multiply perfect numbers that are neither harmonic numbers nor arithmetic numbers.
 * @author Sean A. Irvine
 */
public class A046987 extends Sequence1 {

  private long mN = 119;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z sigma0 = fs.sigma0();
      final Z sigma1 = fs.sigma();
      if (sigma1.mod(mN) == 0 && !sigma1.mod(sigma0).isZero() && !sigma0.multiply(mN).mod(sigma1).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
