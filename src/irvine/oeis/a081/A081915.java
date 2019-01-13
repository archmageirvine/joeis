package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081915.
 * @author Sean A. Irvine
 */
public class A081915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081915() {
    super(new long[] {-256, 256, -96, 16}, new long[] {1, 4, 16, 65});
  }
}
