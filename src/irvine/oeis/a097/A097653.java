package irvine.oeis.a097;

import irvine.oeis.FiniteSequence;

/**
 * A097653 Numbers n such that n=d_1!!+d_2!!+...+d_k!! where d_1 d_2 ... d_k is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A097653 extends FiniteSequence {

  /** Construct the sequence. */
  public A097653() {
    super(1, FINITE, 1, 2, 3, 107);
  }
}
