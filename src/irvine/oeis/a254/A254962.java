package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254962.
 * @author Sean A. Irvine
 */
public class A254962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254962() {
    super(new long[] {1, -1, -18, 18, 1}, new long[] {1, 2, 12, 31, 211});
  }
}
