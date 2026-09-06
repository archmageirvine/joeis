package irvine.oeis.a086;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A086469 Sum of the distinct (smallest) prime signature divisors of n. In case of two or more divisors with the same prime signature the smallest is considered to evaluate the sum. Let this function be defined as psigma(n).
 * @author Sean A. Irvine
 */
public class A086469 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    final HashSet<Z> seen = new HashSet<>();
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      if (seen.add(FactorUtils.leastPrimeSignature(d))) {
        sum = sum.add(d);
      }
    }
    return sum;
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }
}

