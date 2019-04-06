package irvine.oeis.a212;

import irvine.oeis.FiniteSequence;

/**
 * A212498 A finite sequence (of length 39) in which every permutation of [1..7] is a substring.
 * @author Georg Fischer
 */
public class A212498 extends FiniteSequence {

  /** Construct the sequence. */
  public A212498() {
    super(7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 7, 6, 1, 2, 3, 4, 7, 5, 6, 1, 2, 3, 7, 4, 5, 6, 1, 2, 7, 3, 4, 5, 6, 1, 2, 7);
  }
}
