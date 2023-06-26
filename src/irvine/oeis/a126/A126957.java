package irvine.oeis.a126;

import irvine.oeis.FiniteSequence;

/**
 * A126957 Numbers n with all digits distinct, no 0 or 1 digits and such that n is divisible by the product of its digits.
 * @author Georg Fischer
 */
public class A126957 extends FiniteSequence {

  /** Construct the sequence. */
  public A126957() {
    super(1, FINITE, 2, 3, 4, 5, 6, 7, 8, 9, 24, 36, 384, 432, 624, 672, 735, 3276);
  }
}
