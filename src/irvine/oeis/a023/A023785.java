package irvine.oeis.a023;

import irvine.oeis.FiniteSequence;

/**
 * A023785 Katadromes: digits in base 3 are in strict descending order.
 * @author Georg Fischer
 */
public class A023785 extends FiniteSequence {

  /** Construct the sequence. */
  public A023785() {
    super(1, FINITE, 0, 1, 2, 3, 6, 7, 21);
  }
}
