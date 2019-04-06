package irvine.oeis.a101;

import irvine.oeis.FiniteSequence;

/**
 * A101697 Numbers n such that phi(n) is equal to d_1!+d_2!+...+d_k!, where d_1 d_2 ... d_k is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A101697 extends FiniteSequence {

  /** Construct the sequence. */
  public A101697() {
    super(1, 67585, 84466, 854696);
  }
}
