package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186423 Partial sums of A186421.
 * @author Sean A. Irvine
 */
public class A186423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186423() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {0, 1, 3, 4, 8, 11, 17});
  }
}
