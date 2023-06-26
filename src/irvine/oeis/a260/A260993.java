package irvine.oeis.a260;

import irvine.oeis.FiniteSequence;

/**
 * A260993 Numbers n such that the modular curve X_0(n) contains infinitely many rational points of degree 2.
 * @author Georg Fischer
 */
public class A260993 extends FiniteSequence {

  /** Construct the sequence. */
  public A260993() {
    super(1, FINITE, 22, 23, 26, 28, 29, 30, 31, 33, 35, 37, 39, 40, 41, 43, 46, 47, 48, 50, 53, 59, 61, 65, 71, 79, 83, 89, 101, 131);
  }
}
