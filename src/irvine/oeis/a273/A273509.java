package irvine.oeis.a273;

import irvine.oeis.FiniteSequence;

/**
 * A273509 Orders of the symmetry groups of the six convex regular 4-polytopes, in the order 5-cell, 8-cell, 16-cell, 24-cell, 120-cell, 600-cell.
 * @author Georg Fischer
 */
public class A273509 extends FiniteSequence {

  /** Construct the sequence. */
  public A273509() {
    super(1, FINITE, 120, 384, 384, 1152, 14400, 14400);
  }
}
