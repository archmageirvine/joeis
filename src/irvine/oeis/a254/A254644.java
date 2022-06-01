package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254644 Fourth partial sums of fifth powers (A000584).
 * @author Sean A. Irvine
 */
public class A254644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254644() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 36, 381, 2336, 10326, 36552, 110022, 292512, 704847, 1567852});
  }
}
