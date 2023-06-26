package irvine.oeis.a097;

import irvine.oeis.FiniteSequence;

/**
 * A097642 Numbers k such that k = (d_1! + d_2! + ... + d_k!) - (d_1 + d_2 + ... + d_k) where d_1 d_2 ... d_k is the decimal expansion of k.
 * @author Georg Fischer
 */
public class A097642 extends FiniteSequence {

  /** Construct the sequence. */
  public A097642() {
    super(1, FINITE, 3, 115, 6576, 80855);
  }
}
