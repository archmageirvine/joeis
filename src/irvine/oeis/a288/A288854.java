package irvine.oeis.a288;

import irvine.oeis.FiniteSequence;

/**
 * A288854 The unique longest sequence of squares where each number (after the first) is obtained by prefixing a single digit to its predecessor.
 * @author Georg Fischer
 */
public class A288854 extends FiniteSequence {

  /** Construct the sequence. */
  public A288854() {
    super(25, 625, 5625, 75625, 275625);
  }
}
