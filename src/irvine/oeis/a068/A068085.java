package irvine.oeis.a068;
// manually 2021-02-25

import irvine.oeis.HolonomicRecurrence;

/**
 * A068085 Numbers k such that k and 10*k are both triangular numbers.
 * Signature (1, 0, 1442,-1442, 0,-1, 1)
 * @author Georg Fischer
 */
public class A068085 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A068085() {
    super(1, "[0, 1,-1, 0,-1442, 1442, 0, 1,-1]", "[0, 1, 21, 78, 1540, 30381, 112575, 2220778]", 0);
  }

}
