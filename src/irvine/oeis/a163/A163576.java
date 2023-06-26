package irvine.oeis.a163;

import irvine.oeis.FiniteSequence;

/**
 * A163576 Near-factorions: equal to the sum of the factorials of all but one of their digits in base 10.
 * @author Georg Fischer
 */
public class A163576 extends FiniteSequence {

  /** Construct the sequence. */
  public A163576() {
    super(1, FINITE, 24, 5761, 5762);
  }
}
