package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080627 Consider 3 X 3 X 3 Rubik cube, but only allow the squares group to act; sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080627 extends FiniteSequence {

  /** Construct the sequence. */
  public A080627() {
    super(1, 6, 27, 120, 519, 1932, 6484, 20310, 55034, 113892, 178495, 179196, 89728, 16176, 1488, 144);
  }
}
