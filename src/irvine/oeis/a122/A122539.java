package irvine.oeis.a122;

import irvine.oeis.FiniteSequence;

/**
 * A122539 Number of benzenoids with 21 hexagons with D_(2h) symmetry and 60+2n carbons.
 * @author Georg Fischer
 */
public class A122539 extends FiniteSequence {

  /** Construct the sequence. */
  public A122539() {
    super(0, FINITE, 1, 3, 5, 8, 12, 16, 16, 42, 31, 43, 45, 73, 30, 40);
  }
}
