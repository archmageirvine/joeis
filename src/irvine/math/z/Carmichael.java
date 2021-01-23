package irvine.math.z;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;

/**
 * Carmichael lambda function.
 * @author Sean A. Irvine
 */
public final class Carmichael {

  private Carmichael() { }

  private static final PrimeDivision FACTOR = new PrimeDivision();

  /**
   * The Carmichael lambda function
   * @param n parameter
   * @return Carmichael lambda
   */
  public static Z lambda(final Z n) {
    final FactorSequence fs = FACTOR.factorize(n);
    Z lambda = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (Z.TWO.equals(p)) {
        if (e > 2) {
          lambda = lambda.lcm(Z.ONE.shiftLeft(e - 2));
        } else if (e == 2) {
          lambda = lambda.lcm(Z.TWO);
        }
      } else {
        lambda = lambda.lcm(p.subtract(1).multiply(p.pow(e - 1)));
      }
    }
    return lambda;
  }

  /**
   * The Carmichael lambda function
   * @param n parameter
   * @return Carmichael lambda
   */
  public static Z lambda(final long n) {
    return lambda(Z.valueOf(n));
  }
}
