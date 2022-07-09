package irvine.oeis.a296;

import irvine.oeis.FiniteSequence;

/**
 * A296818 Squarefree values of k for which the quadratic field Q[ sqrt(k) ] possesses a norm-Euclidean ideal class.
 * @author Georg Fischer
 */
public class A296818 extends FiniteSequence {

  /** Construct the sequence. */
  public A296818() {
    super(-15, -11, -7, -5, -3, -2, -1, 2, 3, 5, 6, 7, 10, 11, 13, 15, 17, 19, 21, 29, 33, 37, 41, 57, 73, 85);
  }
}
