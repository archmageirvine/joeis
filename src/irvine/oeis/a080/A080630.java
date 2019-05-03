package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080630 Consider <code>3 X 3 X 3</code> Rubik cube, but consider only positions of corners; sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080630 extends FiniteSequence {

  /** Construct the sequence. */
  public A080630() {
    super(1, 12, 114, 924, 6539, 39528, 199926, 806136, 2761740, 8656152, 22334112, 32420448, 18780864, 2166720, 6624);
  }
}
