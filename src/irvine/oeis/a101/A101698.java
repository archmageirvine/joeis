package irvine.oeis.a101;

import irvine.oeis.FiniteSequence;

/**
 * A101698 Numbers n such that <code>n =</code> d_1*d_1!+d_2*d_2!+...+d_k*d_k!, where d_1 d_2 <code>...</code> d_k is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A101698 extends FiniteSequence {

  /** Construct the sequence. */
  public A101698() {
    super(0, 1, 684817, 3371797);
  }
}
