package irvine.oeis.a101;

import irvine.oeis.FiniteSequence;

/**
 * A101697 Numbers n such that <code>phi(n)</code> is equal to <code>d_1!+d_2!+...+d_k!</code>, where <code>d_1 d_2 ... d_k</code> is the decimal expansion of <code>n</code>.
 * @author Georg Fischer
 */
public class A101697 extends FiniteSequence {

  /** Construct the sequence. */
  public A101697() {
    super(1, 67585, 84466, 854696);
  }
}
