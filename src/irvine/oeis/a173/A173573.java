package irvine.oeis.a173;

import irvine.oeis.FiniteSequence;

/**
 * A173573 3-Factorions: equal to the sum of the triple factorials of their digits in base 10.
 * @author Georg Fischer
 */
public class A173573 extends FiniteSequence {

  /** Construct the sequence. */
  public A173573() {
    super(1, 2, 3, 4, 81, 82, 83, 84);
  }
}
