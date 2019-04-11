package irvine.oeis.a048;

import irvine.oeis.FiniteSequence;

/**
 * A048981 Squarefree values of n for which the quadratic field Q[ <code>sqrt(n) ]</code> is norm-Euclidean.
 * @author Georg Fischer
 */
public class A048981 extends FiniteSequence {

  /** Construct the sequence. */
  public A048981() {
    super(-11, -7, -3, -2, -1, 2, 3, 5, 6, 7, 11, 13, 17, 19, 21, 29, 33, 37, 41, 57, 73);
  }
}
