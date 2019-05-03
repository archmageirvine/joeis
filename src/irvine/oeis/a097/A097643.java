package irvine.oeis.a097;

import irvine.oeis.FiniteSequence;

/**
 * A097643 Numbers n such that <code>n=(d_1!!+d_2!!+...+d_k!!)-(d_1+d_2+...+d_k)</code> where <code>d_1 d_2</code> ... <code>d_k</code> is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A097643 extends FiniteSequence {

  /** Construct the sequence. */
  public A097643() {
    super(4, 46, 478, 944);
  }
}
