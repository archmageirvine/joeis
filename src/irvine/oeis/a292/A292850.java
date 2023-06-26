package irvine.oeis.a292;

import irvine.oeis.FiniteSequence;

/**
 * A292850 Lucas numbers that are also generalized heptagonal numbers.
 * @author Georg Fischer
 */
public class A292850 extends FiniteSequence {

  /** Construct the sequence. */
  public A292850() {
    super(1, FINITE, 1, 4, 7, 18);
  }
}
