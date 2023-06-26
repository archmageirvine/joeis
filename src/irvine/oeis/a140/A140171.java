package irvine.oeis.a140;

import irvine.oeis.FiniteSequence;

/**
 * A140171 Numbers n such that n=prime(prime(d_1!+d_2!+...+d_k!)) where d_1d_2...d_k is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A140171 extends FiniteSequence {

  /** Construct the sequence. */
  public A140171() {
    super(1, FINITE, 18303877, 91744613);
  }
}
