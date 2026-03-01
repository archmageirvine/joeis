package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080617 Consider a 3 X 3 X 3 Rubik cube, but only allow the moves M_R, D; sequence gives number of positions that are exactly n moves from the start.
 * @author Sean A. Irvine
 */
public class A080617 extends FiniteSequence {

  /** Construct the sequence. */
  public A080617() {
    super(0, FINITE, 1, 4, 10, 24, 58, 140, 338, 816, 1909, 4296, 8893, 17160, 28891, 37996, 37678, 27186, 13051, 4128, 1199, 372, 122, 36, 10, 2);
  }
}

