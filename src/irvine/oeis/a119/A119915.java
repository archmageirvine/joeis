package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119915.
 * @author Sean A. Irvine
 */
public class A119915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119915() {
    super(new long[] {-1, -4, -2, 4}, new long[] {0, 1, 4, 13});
  }
}
