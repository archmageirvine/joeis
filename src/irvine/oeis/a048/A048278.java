package irvine.oeis.a048;

import irvine.oeis.FiniteSequence;

/**
 * A048278 Positive numbers n such that the numbers <code>binomial(n,k)</code> are squarefree for all <code>k = 0..n</code>.
 * @author Georg Fischer
 */
public class A048278 extends FiniteSequence {

  /** Construct the sequence. */
  public A048278() {
    super(1, 2, 3, 5, 7, 11, 23);
  }
}
