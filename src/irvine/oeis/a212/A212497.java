package irvine.oeis.a212;

import irvine.oeis.FiniteSequence;

/**
 * A212497 A finite sequence (of length <code>12)</code> in which every permutation of <code>[1</code>..4] is a substring.
 * @author Georg Fischer
 */
public class A212497 extends FiniteSequence {

  /** Construct the sequence. */
  public A212497() {
    super(4, 1, 2, 3, 4, 1, 2, 4, 3, 1, 2, 4);
  }
}
