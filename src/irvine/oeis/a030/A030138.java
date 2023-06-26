package irvine.oeis.a030;

import irvine.oeis.FiniteSequence;

/**
 * A030138 Number of one-sided triangular n-ominoes (or triominoes) on the icosahedron.
 * @author Georg Fischer
 */
public class A030138 extends FiniteSequence {

  /** Construct the sequence. */
  public A030138() {
    super(1, FINITE, 1, 1, 1, 4, 6, 14, 26, 58, 109, 225, 359, 532, 549, 433, 214, 89, 20, 6, 1, 1);
  }
}
