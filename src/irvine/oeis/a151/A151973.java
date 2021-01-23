package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151973 Numbers n such that n^2 - n is divisible by 24.
 * @author Sean A. Irvine
 */
public class A151973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151973() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 9, 16, 24});
  }
}
