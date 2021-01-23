package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290990 p-INVERT of the nonnegative integers (A000027), where p(S) = 1 - S - S^2.
 * @author Sean A. Irvine
 */
public class A290990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290990() {
    super(new long[] {1, 2, -5, 4}, new long[] {0, 1, 2, 5});
  }
}
