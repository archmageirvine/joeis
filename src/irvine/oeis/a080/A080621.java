package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080621 Consider 3 X 3 X 3 Rubik cube, but only allow the double anti-slice group to act; sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080621 extends FiniteSequence {

  /** Construct the sequence. */
  public A080621() {
    super(1, 9, 51, 265, 864, 1785, 2017, 1008, 144);
  }
}
