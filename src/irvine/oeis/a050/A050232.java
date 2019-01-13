package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050232.
 * @author Sean A. Irvine
 */
public class A050232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050232() {
    super(new long[] {-2, -1, -1, -1, 3}, new long[] {0, 0, 0, 1, 3});
  }
}
