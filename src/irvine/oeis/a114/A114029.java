package irvine.oeis.a114;

import irvine.oeis.FiniteSequence;

/**
 * A114029 Rearrangement of Fibonacci numbers so that the n-th partial concatenation is a multiple of the n-th Fibonacci number.
 * @author Georg Fischer
 */
public class A114029 extends FiniteSequence {

  /** Construct the sequence. */
  public A114029() {
    super(1, 1, 2, 5, 55, 144, 13, 28657, 46368);
  }
}
