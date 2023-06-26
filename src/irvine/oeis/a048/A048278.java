package irvine.oeis.a048;

import irvine.oeis.FiniteSequence;

/**
 * A048278 Positive numbers n such that the numbers binomial(n,k) are squarefree for all k = 0..n.
 * @author Georg Fischer
 */
public class A048278 extends FiniteSequence {

  /** Construct the sequence. */
  public A048278() {
    super(1, FINITE, 1, 2, 3, 5, 7, 11, 23);
  }
}
