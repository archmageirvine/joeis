package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080622 Consider 3 X 3 X 3 Rubik cube, but only allow the slice group to act; sequence gives number of positions that are exactly n moves from the start, up to equivalence under the full group of order 48 of the cube.
 * @author Georg Fischer
 */
public class A080622 extends FiniteSequence {

  /** Construct the sequence. */
  public A080622() {
    super(1, 1, 2, 6, 16, 15, 9);
  }
}
