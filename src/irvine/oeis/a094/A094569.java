package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094569 Associated with alternating row sums of array in A094568.
 * @author Sean A. Irvine
 */
public class A094569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094569() {
    super(new long[] {-1, 6, 6}, new long[] {2, 11, 78});
  }
}
