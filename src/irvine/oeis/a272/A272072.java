package irvine.oeis.a272;

import irvine.oeis.FiniteSequence;

/**
 * A272072 Nonnegative integers n such that 10^n is not of the form x^3 + y^3 + z^3 where x &gt; y &gt; z &gt; 0.
 * @author Georg Fischer
 */
public class A272072 extends FiniteSequence {

  /** Construct the sequence. */
  public A272072() {
    super(1, FINITE, 0, 1, 2, 3, 4, 5, 7, 10);
  }
}
