package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287471 Number of connected dominating sets in the n-crown graph.
 * @author Sean A. Irvine
 */
public class A287471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287471() {
    super(3, new long[] {-16, 68, -116, 101, -47, 11}, new long[] {13, 115, 666, 3234, 14379, 60981});
  }
}
