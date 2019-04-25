package irvine.oeis.a084;

import irvine.oeis.FiniteSequence;

/**
 * A084668 Brilliant Niven numbers, i.e., numbers with two prime factors of the same length <code>(in</code> decimal notation) which are also divisible by the sum of their digits.
 * @author Georg Fischer
 */
public class A084668 extends FiniteSequence {

  /** Construct the sequence. */
  public A084668() {
    super(4, 6, 9, 10, 21, 209, 247, 407, 481, 629, 803, 1387, 1679);
  }
}
