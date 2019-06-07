package irvine.oeis.a097;

import irvine.oeis.FiniteSequence;

/**
 * A097642 Numbers n such that <code>n=(d_1!+d_2!+...+d_k!)-(d_1+d_2+...+d_k)</code> where <code>d_1 d_2 ... d_k</code> is the decimal expansion of <code>n</code>.
 * @author Georg Fischer
 */
public class A097642 extends FiniteSequence {

  /** Construct the sequence. */
  public A097642() {
    super(3, 115, 6576, 80855);
  }
}
