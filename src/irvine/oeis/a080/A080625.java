package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080625 Consider <code>3 X 3 X 3</code> Rubik cube, but only allow the anti-slice group to act; sequence gives number of positions that are exactly n moves from the start, up to equivalence under the full group of order 48 of the cube.
 * @author Georg Fischer
 */
public class A080625 extends FiniteSequence {

  /** Construct the sequence. */
  public A080625() {
    super(1, 1, 3, 10, 37, 93, 166, 147, 89, 21);
  }
}
