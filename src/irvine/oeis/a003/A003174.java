package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003174 Positive integers D such that <code>Q[sqrt(D)]</code> is a quadratic field which is <code>norm-Euclidean</code>.
 * @author Sean A. Irvine
 */
public class A003174 extends FiniteSequence {

  /** Construct the sequence. */
  public A003174() {
    super(2, 3, 5, 6, 7, 11, 13, 17, 19, 21, 29, 33, 37, 41, 57, 73);
  }
}

