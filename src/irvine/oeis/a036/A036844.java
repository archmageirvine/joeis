package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036844 Numbers k such that k / sopfr(k) is an integer, where sopfr = sum-of-prime-factors, A001414.
 * @author Sean A. Irvine
 */
public class A036844 extends Sequence1 {

  private long mN = 1;

  protected long sumOfPrimeFactors(final long n) {
    long sum = 0;
    final FactorSequence fs = Jaguar.factor(n);
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
