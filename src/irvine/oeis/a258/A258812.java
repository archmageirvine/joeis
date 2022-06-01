package irvine.oeis.a258;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A258812 a(n) = n^11 - 1.
 * @author Sean A. Irvine
 */
public class A258812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258812() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {0, 2047, 177146, 4194303, 48828124, 362797055, 1977326742, 8589934591L, 31381059608L, 99999999999L, 285311670610L, 743008370687L});
  }
}
