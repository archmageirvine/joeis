package irvine.oeis.a114;

import irvine.oeis.FiniteSequence;

/**
 * A114747 a(1) = 1, a(2) = 1, a(n+1) = least Fibonacci number of the form k*(a(n-1)) - a(n), not included earlier.
 * @author Georg Fischer
 */
public class A114747 extends FiniteSequence {

  /** Construct the sequence. */
  public A114747() {
    super(1, FINITE, 1, 1, 2, 3, 5, 13, 377, 10946);
  }
}
