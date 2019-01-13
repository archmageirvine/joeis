package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290900.
 * @author Sean A. Irvine
 */
public class A290900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290900() {
    super(new long[] {-1, 6, -14, 19, -14, 6}, new long[] {0, 1, 5, 17, 51, 149});
  }
}
