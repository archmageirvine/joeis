package irvine.oeis.a227;

import irvine.oeis.FiniteSequence;

/**
 * A227007 Numbers n such that n-1 is squarefree and every prime divisor of n-1 is in the sequence.
 * @author Georg Fischer
 */
public class A227007 extends FiniteSequence {

  /** Construct the sequence. */
  public A227007() {
    super(2, 3, 4, 7, 8, 15, 22, 43, 44, 87, 130, 259, 302, 603, 904, 1807);
  }
}
