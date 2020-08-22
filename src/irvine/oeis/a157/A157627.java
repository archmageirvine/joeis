package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157627 8000n - 6040.
 * @author Sean A. Irvine
 */
public class A157627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157627() {
    super(new long[] {-1, 2}, new long[] {1960, 9960});
  }
}
