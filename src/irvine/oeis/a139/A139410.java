package irvine.oeis.a139;

import irvine.oeis.FiniteSequence;

/**
 * A139410 Numbers n such that n = 4^d_1 + 4^d_2 + ... + 4^d_k where d_1d_2...d_k is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A139410 extends FiniteSequence {

  /** Construct the sequence. */
  public A139410() {
    super(1, FINITE, 4624, 595968);
  }
}
