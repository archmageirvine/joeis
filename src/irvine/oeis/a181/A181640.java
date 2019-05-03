package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181640 Partial sums of <code>floor(n^2/5) (A118015)</code>.
 * @author Sean A. Irvine
 */
public class A181640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181640() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {0, 0, 0, 1, 4, 9, 16, 25});
  }
}
