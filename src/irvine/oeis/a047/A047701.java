package irvine.oeis.a047;

import irvine.oeis.FiniteSequence;

/**
 * A047701 All positive numbers that are not the sum of 5 nonzero squares.
 * @author Georg Fischer
 */
public class A047701 extends FiniteSequence {

  /** Construct the sequence. */
  public A047701() {
    super(1, FINITE, 1, 2, 3, 4, 6, 7, 9, 10, 12, 15, 18, 33);
  }
}
