package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055470 Smallest number x &gt; 1 such that phi(x) + sigma(x) = k*d(x)^n, i.e., the left-hand side is divisible by the n-th power of the number of divisors.
 * @author Sean A. Irvine
 */
public class A055470 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final FactorSequence fs = Jaguar.factor(++k);
      if (fs.phi().add(fs.sigma()).mod(fs.sigma0().pow(mN)).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
