package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A061272 Squares such that (1) each digit is a square, (2) the sum of squares of the digits is a square.
 * @author Sean A. Irvine
 */
public class A061272 extends FilterSequence {

  /** Construct the sequence. */
  public A061272() {
    super(1, new A000290(), k -> (Functions.SYNDROME.i(k) & 0b0111101100) == 0 && Predicates.SQUARE.is(Functions.DIGIT_SUM_SQUARES.l(k)));
  }
}
