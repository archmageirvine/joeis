package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239095.
 * @author Sean A. Irvine
 */
public class A239095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239095() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 0, 8, 72, 360, 1312, 3888});
  }
}
