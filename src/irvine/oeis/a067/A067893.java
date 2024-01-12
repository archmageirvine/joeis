package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067893 Nonprimes k such that tau(k)*sigma(k) &lt; prime(k) where tau(k) = A000005(k) and sigma(k) = A000203(k).
 * @author Sean A. Irvine
 */
public class A067893 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!mPrime.isPrime(++mN)) {
        final FactorSequence fs = Jaguar.factor(mN);
        if (fs.sigma0().multiply(fs.sigma()).compareTo(p) < 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
