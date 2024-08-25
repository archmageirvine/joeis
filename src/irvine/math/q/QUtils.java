package irvine.math.q;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Utility functions.
 * @author Sean A. Irvine
 */
public final class QUtils {

  private QUtils() { }

  /**
   * The Sagher map for rationals.
   * The Sagher map sends <code>Product p_i^e_i / Product q_i^f_i</code> to <code>Product p_i^(2e_i) * Product q_i^(2f_i-1)</code>.
   * @param n rational
   * @return corresponding integer
   */
  public static Z sagher(final Q n) {
    Z prod = Z.ONE;
    final FactorSequence fsNum = Jaguar.factor(n.num());
    for (final Z p : fsNum.toZArray()) {
      prod = prod.multiply(p.pow(2L * fsNum.getExponent(p)));
    }
    final FactorSequence fsDen = Jaguar.factor(n.den());
    for (final Z p : fsDen.toZArray()) {
      prod = prod.multiply(p.pow(2L * fsDen.getExponent(p) - 1));
    }
    return prod;
  }

  /**
   * The inverse Sagher map.
   * @param n integer
   * @return corresponding rational
   */
  public static Q inverseSagher(final Z n) {
    Q prod = Q.ONE;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if ((e & 1) == 0) {
        prod = prod.multiply(p.pow(e / 2));
      } else {
        prod = prod.divide(p.pow((e + 1) / 2));
      }
    }
    return prod;
  }
}
