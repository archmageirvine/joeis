package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039752 Ruth-Aaron numbers (2): sum of prime divisors of n = sum of prime divisors of n+1 (both taken with multiplicity).
 * @author Sean A. Irvine
 */
public class A039752 implements Sequence {

  private long mN = 4;

  private Z f(final long n) {
    final FactorSequence fs = Cheetah.factor(n);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(p.multiply(fs.getExponent(p)));
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      if (f(++mN).equals(f(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
