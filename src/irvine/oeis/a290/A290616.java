package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290616.
 * @author Sean A. Irvine
 */
public class A290616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290616() {
    super(new long[] {-1, 0, -2, 2, 1, 2}, new long[] {2, 5, 12, 31, 80, 205});
  }
}
