package irvine.oeis.a033;

import irvine.oeis.FiniteSequence;

/**
 * A033822 Numbers of fixed points of elements of group M24.
 * @author Georg Fischer
 */
public class A033822 extends FiniteSequence {

  /** Construct the sequence. */
  public A033822() {
    super(1, 1, 1, 2, 2, 3, 2, 4, 4, 6, 8, 24);
  }
}
