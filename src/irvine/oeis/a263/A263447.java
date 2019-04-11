package irvine.oeis.a263;

import irvine.oeis.FiniteSequence;

/**
 * A263447 Arrange the 26 sporadic simple groups in increasing order; <code>a(n) =</code> number of sporadic simple groups which are subquotients of the n-th largest sporadic simple group.
 * @author Georg Fischer
 */
public class A263447 extends FiniteSequence {

  /** Construct the sequence. */
  public A263447() {
    super(1, 2, 1, 1, 1, 3, 3, 1, 5, 3, 1, 1, 4, 3, 7, 6, 4, 5, 4, 1, 6, 12, 6, 9, 12, 20);
  }
}
