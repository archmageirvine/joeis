package irvine.oeis.a304;

import irvine.oeis.FiniteSequence;

/**
 * A304206 Numbers from the "octagonal theorem of sixty".
 * @author Georg Fischer
 */
public class A304206 extends FiniteSequence {

  /** Construct the sequence. */
  public A304206() {
    super(1, FINITE, 1, 2, 3, 4, 6, 7, 9, 12, 13, 14, 18, 60);
  }
}
