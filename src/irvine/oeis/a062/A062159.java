package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062159.
 * @author Sean A. Irvine
 */
public class A062159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062159() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {-1, 0, 21, 182, 819, 2604});
  }
}
