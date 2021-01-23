package irvine.oeis.a152;

import irvine.oeis.FiniteSequence;

/**
 * A152169 Number of positions that are exactly n moves from the starting position in the 2 X 2 X 2 Rubik cube puzzle using only one-way quarter moves.
 * @author Georg Fischer
 */
public class A152169 extends FiniteSequence {

  /** Construct the sequence. */
  public A152169() {
    super(1, 3, 9, 27, 78, 216, 583, 1546, 4035, 10320, 25824, 62832, 146322, 321876, 635632, 988788, 958176, 450280, 66420, 1192);
  }
}
