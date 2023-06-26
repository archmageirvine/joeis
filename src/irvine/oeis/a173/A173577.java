package irvine.oeis.a173;

import irvine.oeis.FiniteSequence;

/**
 * A173577 7-Factorions: equal to the sum of the 7-fold factorials of their digits in base 10.
 * @author Georg Fischer
 */
public class A173577 extends FiniteSequence {

  /** Construct the sequence. */
  public A173577() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 19);
  }
}
