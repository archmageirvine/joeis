package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254870 Seventh partial sums of fourth powers (A000583).
 * @author Sean A. Irvine
 */
public class A254870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254870() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 23, 221, 1355, 6239, 23465, 75803, 217373, 566150, 1361802, 3063502, 6508450});
  }
}
