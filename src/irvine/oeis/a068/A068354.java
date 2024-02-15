package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068354 Numbers n such that sigma(n)*tau(n) &gt; prime(2*n) where sigma(n) is the sum of divisors of n and tau(n) the number of divisors of n (A000005).
 * @author Sean A. Irvine
 */
public class A068354 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      super.next();
      final Z p = super.next();
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().multiply(fs.sigma()).compareTo(p) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
