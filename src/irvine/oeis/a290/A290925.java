package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290925.
 * @author Sean A. Irvine
 */
public class A290925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290925() {
    super(new long[] {-1, 7, -10, 7}, new long[] {3, 17, 92, 495});
  }
}
