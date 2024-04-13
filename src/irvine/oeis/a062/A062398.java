package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a028.A028839;

/**
 * A062398 Numbers such that the product of the digits and the sum of the digits are squares.
 * @author Sean A. Irvine
 */
public class A062398 extends FilterSequence {

  /** Construct the sequence. */
  public A062398() {
    super(new A028839(), k -> Functions.DIGIT_PRODUCT.z(k).isSquare());
  }
}
