package irvine.oeis.a136;

import irvine.oeis.FiniteSequence;

/**
 * A136253 Highly composite numbers which are divisible by all smaller highly composite numbers.
 * @author Georg Fischer
 */
public class A136253 extends FiniteSequence {

  /** Construct the sequence. */
  public A136253() {
    super(1, FINITE, 1, 2, 4, 12, 24, 720, 5040);
  }
}
