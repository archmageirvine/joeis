package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037915.
 * @author Sean A. Irvine
 */
public class A037915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037915() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 1, 2, 3, 4});
  }
}
