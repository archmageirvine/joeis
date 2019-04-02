package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055610 A companion sequence to A011896.
 * @author Sean A. Irvine
 */
public class A055610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055610() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 1, -3, 3}, new long[] {0, 0, 0, 1, 2, 5, 9, 15, 24, 36});
  }
}
