package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003601 Numbers n such that the average of the divisors of n is an integer: <code>sigma_0(n)</code> divides <code>sigma_1(n)</code>. Alternatively, <code>tau(n) (A000005(n))</code> divides <code>sigma(n) (A000203(n))</code>.
 * @author Sean A. Irvine
 */
public class A003601 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z sigma1 = fs.sigma();
      final long sigma0 = fs.sigma0AsLong();
      if (sigma1.mod(sigma0) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
