package irvine.oeis.a244;

import irvine.oeis.FiniteSequence;

/**
 * A244655 Least number k such that 3^k ends in exactly n consecutive decreasing digits.
 * @author Georg Fischer
 */
public class A244655 extends FiniteSequence {

  /** Construct the sequence. */
  public A244655() {
    super(1, FINITE, 1, 5, 27, 496, 4996, 49996, 499996, 4999996, 49999996);
  }
}
