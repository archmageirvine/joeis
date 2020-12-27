package irvine.math.z;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.factor.util.InfinitaryAliquotSequence;

/**
 * Infinitary divisors.
 * @author Sean A. Irvine
 */
public final class InfinitaryDivisors {

  private InfinitaryDivisors() { }

  /**
   * Compute the infinitary divisor sum.
   * @param n number to sum
   * @return infinitary divisor sum
   */
  public static Z infinitaryDivisorSum(final Z n) {
    Z sum = Z.ZERO;
    final FactorSequence fs = Cheetah.factor(n);
    for (final Z d : InfinitaryAliquotSequence.infinitaryDivisors(fs)) {
      sum = sum.add(d);
    }
    return sum.subtract(n);
  }

  /**
   * The number of infinitary divisors.
   * @param n number to count
   * @return number of infinitary divisors
   */
  public static Z infinitarySigma0(final Z n) {
    return Z.valueOf(InfinitaryAliquotSequence.infinitaryDivisors(Cheetah.factor(n)).size());
  }
}
