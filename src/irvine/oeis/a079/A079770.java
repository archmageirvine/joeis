package irvine.oeis.a079;

import irvine.oeis.FiniteSequence;

/**
 * A079770 Number of configurations that are exactly n moves from the starting position in the Bicube or Bandaged Rubik's Cube puzzle.
 * @author Georg Fischer
 */
public class A079770 extends FiniteSequence {

  /** Construct the sequence. */
  public A079770() {
    super(1, 9, 24, 54, 83, 91, 64, 58, 28, 16, 6, 3, 3);
  }
}
