package irvine.oeis.a098;

import irvine.oeis.FiniteSequence;

/**
 * A098092 Unique solution to the [10,3] postage stamp problem (showing that V(10,3) = 155).
 * @author Georg Fischer
 */
public class A098092 extends FiniteSequence {

  /** Construct the sequence. */
  public A098092() {
    super(1, 2, 6, 8, 19, 28, 40, 43, 91, 103);
  }
}
