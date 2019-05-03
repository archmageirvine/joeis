package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080619 Consider <code>3 X 3 X 3</code> Rubik cube, but only allow the slice group to act; sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080619 extends FiniteSequence {

  /** Construct the sequence. */
  public A080619() {
    super(1, 6, 27, 120, 287, 258, 69);
  }
}
