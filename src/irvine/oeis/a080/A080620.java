package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080620 Consider 3 X 3 X 3 Rubik cube, but only allow the anti-slice group to act; sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080620 extends FiniteSequence {

  /** Construct the sequence. */
  public A080620() {
    super(1, 6, 27, 120, 423, 1098, 1770, 1650, 851, 198);
  }
}
