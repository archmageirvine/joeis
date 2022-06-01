package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055346 Number of mobiles (circular rooted trees) with n nodes and 8 leaves.
 * @author Georg Fischer
 */
public class A055346 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055346() {
    super(9, A055278.computeRecurrence(8), "1, 8, 80, 524, 2696, 11398, 41674, 135315, 398912, 1083702, 2746382, 6552828, 14833263, 32050976, 66448542, 132748327, 256487544, 480786785, 876729065, 1558922942, 2708486023, 4606366231, 7681025200, 12575626106, 20241643485", 0);
  }
}

