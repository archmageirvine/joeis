package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290470 Number of minimal edge covers in the n-Moebius ladder.
 * @author Sean A. Irvine
 */
public class A290470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290470() {
    super(new long[] {1, -1, -2, -2, 2, 2, 6, 2, 1}, new long[] {3, 7, 15, 59, 143, 367, 1039, 2755, 7395});
  }
}
