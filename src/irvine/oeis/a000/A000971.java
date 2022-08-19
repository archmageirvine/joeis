package irvine.oeis.a000;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A000971 Fermat coefficients.
 * @author Georg Fischer
 */
public class A000971 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A000971() {
    super(6, "[0, 1,-6, 15,-19, 9, 9,-18, 9, 9,-19, 15,-6, 1]", "[1, 9, 42, 132, 334, 728, 1428, 2584, 4389]", 0);
  }
}
