package irvine.oeis.a091;

import irvine.oeis.FiniteSequence;

/**
 * A091403 Numbers n such that genus of group Gamma_0(n) is 1.
 * @author Georg Fischer
 */
public class A091403 extends FiniteSequence {

  /** Construct the sequence. */
  public A091403() {
    super(1, FINITE, 11, 14, 15, 17, 19, 20, 21, 24, 27, 32, 36, 49);
  }
}
