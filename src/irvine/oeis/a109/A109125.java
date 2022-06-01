package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109125 Column 7 of array illustrated in A089574 and related to A034261.
 * @author Sean A. Irvine
 */
public class A109125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109125() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {2, 41, 292, 1283, 4253, 11712, 28261, 61738, 124763});
  }
}
