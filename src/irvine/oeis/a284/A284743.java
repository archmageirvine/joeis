package irvine.oeis.a284;

import irvine.oeis.FiniteSequence;

/**
 * A284743 Positive numbers that are not the sum of (any number of) distinct perfect powers (A001597).
 * @author Georg Fischer
 */
public class A284743 extends FiniteSequence {

  /** Construct the sequence. */
  public A284743() {
    super(1, FINITE, 2, 3, 6, 7, 11, 15, 19, 23);
  }
}
