package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290911.
 * @author Sean A. Irvine
 */
public class A290911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290911() {
    super(new long[] {-1, 4, 0, 4}, new long[] {0, 6, 24, 96});
  }
}
