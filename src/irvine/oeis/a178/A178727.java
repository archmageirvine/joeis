package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178727 Smallest nonnegative integer whose English name has no letters in common with the English name of the previous term (starting with 8).
 * @author Georg Fischer
 */
public class A178727 extends FiniteSequence {

  /** Construct the sequence. */
  public A178727() {
    super(1, FINITE, 8, 4, 6, 0, 50, 1, 30, 7, 2, 5, 2000);
  }
}
