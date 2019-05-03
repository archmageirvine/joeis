package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080626 Consider <code>3 X 3 X 3</code> Rubik cube, but only allow the double anti-slice group to act; sequence gives number of positions that are exactly n moves from the start, up to equivalence under the full group of order 48 of the cube.
 * @author Georg Fischer
 */
public class A080626 extends FiniteSequence {

  /** Construct the sequence. */
  public A080626() {
    super(1, 2, 5, 25, 75, 152, 184, 108, 16);
  }
}
