package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290593.
 * @author Sean A. Irvine
 */
public class A290593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290593() {
    super(new long[] {1, 0, 1, 1}, new long[] {3, 12, 15, 31});
  }
}
