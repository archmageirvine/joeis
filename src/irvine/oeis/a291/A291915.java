package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291915.
 * @author Sean A. Irvine
 */
public class A291915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291915() {
    super(new long[] {-1, -4, -2, 8, 5, -8, -2, 4}, new long[] {0, 0, 0, 2, 22, 82, 268, 742});
  }
}
