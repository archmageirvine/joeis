package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068317 Numbers n such that n*tau(n) &gt; omega(n)*prime(n) where tau(n) is the number of divisors of n and omega(n) the number of distinct prime factors of n.
 * @author Sean A. Irvine
 */
public class A068317 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().multiply(mN).compareTo(p.multiply(fs.omega())) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
