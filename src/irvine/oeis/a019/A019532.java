package irvine.oeis.a019;

import irvine.oeis.FiniteSequence;

/**
 * A019532 Numbers k such that Fibonacci(k) divides k!.
 * @author Sean A. Irvine
 */
public class A019532 extends FiniteSequence {

  /** Construct the sequence. */
  public A019532() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 8, 12, 24);
  }
}
