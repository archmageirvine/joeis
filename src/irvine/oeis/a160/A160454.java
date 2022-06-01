package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160454 Number of isomorphism classes of 5-fold coverings of a connected graph with Betti number n.
 * @author Sean A. Irvine
 */
public class A160454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160454() {
    super(new long[] {-1382400, 1152000, -374304, 59440, -4670, 155}, new long[] {1, 7, 161, 14721, 1730861, 207388305});
  }
}
