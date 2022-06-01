package irvine.oeis.a222;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A222716 Numbers which are both the sum of n+1 consecutive triangular numbers and the sum of the n-1 immediately following triangular numbers.
 * @author Sean A. Irvine
 */
public class A222716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222716() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 10, 100, 460, 1460, 3710});
  }
}
