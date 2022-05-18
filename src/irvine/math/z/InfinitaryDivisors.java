package irvine.math.z;

import irvine.factor.factor.Jaguar;
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
  public static Z infinitarySigma(final Z n) {
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(n);
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
    return Z.valueOf(InfinitaryAliquotSequence.infinitaryDivisors(Jaguar.factor(n)).size());
  }

  /**
   * The 3-infinitary divisor sum of a number.
   * @param n number
   * @return sigma
   */
  public static Z infinitary3Sigma(final Z n) {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      int e = fs.getExponent(p);
      Z k = Z.ONE;
      while (e != 0) {
        prod = prod.multiply(p.pow(k.multiply(e % 3 + 1)).subtract(1).divide(p.pow(k).subtract(1)));
        k = k.multiply(3);
        e /= 3;
      }
    }
    return prod;
  }
}
