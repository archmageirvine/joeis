package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;

/**
 * A055344 Number of mobiles (circular rooted trees) with n nodes and 6 leaves.
 * @author Georg Fischer
 */
public class A055344 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055344() {
    super(7, A055278.computeRecurrence(6), "1, 6, 40, 184, 688, 2178, 6116, 15493, 36203, 78954, 162537, 318261, 596881, 1077561, 1881218, 3187222, 5257026, 8463247, 13329249, 20576809, 31189362, 46486870, 68222601, 98696480, 140898502, 198674609, 276933307", 0);
  }
}

