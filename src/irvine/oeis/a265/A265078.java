package irvine.oeis.a265;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A265078 Partial sums of A072154.
 * @author Sean A. Irvine
 */
public class A265078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265078() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {1, 4, 9, 16, 25, 37, 52});
  }
}
