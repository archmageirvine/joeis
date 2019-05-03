package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080629 Consider <code>3 X 3 X 3</code> Rubik cube, but consider only positions of corners; sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080629 extends FiniteSequence {

  /** Construct the sequence. */
  public A080629() {
    super(1, 18, 243, 2874, 28000, 205416, 1168516, 5402628, 20776176, 45391616, 15139616, 64736);
  }
}
