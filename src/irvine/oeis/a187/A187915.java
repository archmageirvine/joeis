package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187915.
 * @author Sean A. Irvine
 */
public class A187915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187915() {
    super(new long[] {-1, -4, -2, 4}, new long[] {3, 13, 45, 141});
  }
}
