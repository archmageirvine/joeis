package irvine.oeis.a030;

import irvine.oeis.FiniteSequence;

/**
 * A030137 Number of one-sided pentagonal n-ominoes (or pentominoes) on the dodecahedron.
 * @author Georg Fischer
 */
public class A030137 extends FiniteSequence {

  /** Construct the sequence. */
  public A030137() {
    super(1, 1, 2, 5, 9, 20, 13, 12, 5, 3, 1, 1);
  }
}
