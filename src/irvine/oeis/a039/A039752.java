package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
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
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(p.multiply(fs.getExponent(p)));
    }
    return sum;
  }

  protected Z select(final long n, final Z sum) {
    return Z.valueOf(n);
  }

  @Override
  public Z next() {
    while (true) {
      final Z sum = f(++mN);
      if (sum.equals(f(mN + 1))) {
        return select(mN, sum);
      }
    }
  }
}
