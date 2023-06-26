package irvine.oeis.a307;

import irvine.oeis.FiniteSequence;

/**
 * A307991 Fibonacci numbers of the form k^2 - k - 1 with integer k.
 * @author Georg Fischer
 */
public class A307991 extends FiniteSequence {

  /** Construct the sequence. */
  public A307991() {
    super(1, FINITE, 1, 5, 55, 89);
  }
}
