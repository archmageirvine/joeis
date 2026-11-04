package irvine.oeis.a267;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005153;

/**
 * A267124 Primitive practical numbers: practical numbers that are squarefree or practical numbers that when divided by any of its prime factors whose factorization exponent is greater than 1 is no longer practical.
 * @author Sean A. Irvine
 */
public class A267124 extends FilterSequence {

  /**
   * Test is a number is primitive practical (assuming it is already practical).
   * @param k number to test
   * @return true if primitive practical
   */
  public static boolean isPrimitivePractical(final Z k) {
    if (Predicates.SQUARE_FREE.is(k)) {
      return true;
    }
    final FactorSequence fs = Jaguar.factor(k);
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) > 1 && Predicates.PRACTICAL.is(k.divide(p))) {
        return false;
      }
    }
    return true;
  }

  /** Construct the sequence. */
  public A267124() {
    super(1, new A005153(), A267124::isPrimitivePractical);
  }
}

