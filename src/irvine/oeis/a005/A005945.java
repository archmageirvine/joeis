package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005945 Number of n-step mappings with 4 inputs.
 * @author Sean A. Irvine
 */
public class A005945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005945() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 15, 60});
  }
}

