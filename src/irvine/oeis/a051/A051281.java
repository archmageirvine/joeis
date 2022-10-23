package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051281 Sum of divisors of n, sigma(n) (A000203), is a power of number of divisors of n, d(n) (A000005).
 * @author Sean A. Irvine
 */
public class A051281 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s0 = fs.sigma0();
      Z s = fs.sigma();
      while (true) {
        if (s.equals(Z.ONE)) {
          return Z.valueOf(mN);
        }
        final Z[] qr = s.divideAndRemainder(s0);
        if (!qr[1].isZero()) {
          break;
        }
        s = qr[0];
      }
    }
  }
}
