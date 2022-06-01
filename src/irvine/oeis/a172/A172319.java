package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172319 10th column of A172119.
 * @author Sean A. Irvine
 */
public class A172319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172319() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512});
  }
}
