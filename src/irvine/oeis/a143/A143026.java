package irvine.oeis.a143;

import irvine.oeis.FiniteSequence;

/**
 * A143026 Positive integers k such that the fourth power of the number of positive divisors of k equals k.
 * @author Georg Fischer
 */
public class A143026 extends FiniteSequence {

  /** Construct the sequence. */
  public A143026() {
    super(1, FINITE, 1, 625, 6561, 4100625);
  }
}
