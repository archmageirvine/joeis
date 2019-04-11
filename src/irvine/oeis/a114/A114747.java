package irvine.oeis.a114;

import irvine.oeis.FiniteSequence;

/**
 * A114747 <code>a(1) = 1, a(2) = 1, a(n+1) =</code> least Fibonacci number of the form k*(a(n-1)) <code>- a(n),</code> not included earlier.
 * @author Georg Fischer
 */
public class A114747 extends FiniteSequence {

  /** Construct the sequence. */
  public A114747() {
    super(1, 1, 2, 3, 5, 13, 377, 10946);
  }
}
