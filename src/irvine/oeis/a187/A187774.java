package irvine.oeis.a187;

import irvine.oeis.FiniteSequence;

/**
 * A187774 Positive values of n for which the quadratic field <code>Q(n^(1/4))</code> is <code>norm-Euclidean</code>.
 * @author Georg Fischer
 */
public class A187774 extends FiniteSequence {

  /** Construct the sequence. */
  public A187774() {
    super(2, 3, 5, 7, 12, 13, 20, 28, 52, 61, 116, 436);
  }
}
