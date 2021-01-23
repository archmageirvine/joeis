package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080624 Consider 3 X 3 X 3 Rubik cube, but only allow the double slice group to act; sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080624 extends FiniteSequence {

  /** Construct the sequence. */
  public A080624() {
    super(1, 9, 51, 247, 428, 32);
  }
}
