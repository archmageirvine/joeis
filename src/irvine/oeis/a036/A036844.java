package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036844 Numbers n such that <code>n / sopfr(n)</code> is an integer, where <code>sopfr = sum-of-prime-factors, A001414</code>.
 * @author Sean A. Irvine
 */
public class A036844 implements Sequence {

  private long mN = 1;

  protected long sumOfPrimeFactors(final long n) {
    long sum = 0;
    final FactorSequence fs = Cheetah.factor(n);
    for (final Z p : fs.toZArray()) {
      sum += p.longValue() * fs.getExponent(p);
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      final long sopf = sumOfPrimeFactors(++mN);
      if (mN % sopf == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
