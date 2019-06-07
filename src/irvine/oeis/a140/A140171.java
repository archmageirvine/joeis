package irvine.oeis.a140;

import irvine.oeis.FiniteSequence;

/**
 * A140171 Numbers n such that <code>n=prime(prime(d_1!+d_2!+...+d_k!))</code> where <code>d_1d_2...d_k</code> is the decimal expansion of <code>n</code>.
 * @author Georg Fischer
 */
public class A140171 extends FiniteSequence {

  /** Construct the sequence. */
  public A140171() {
    super(18303877, 91744613);
  }
}
