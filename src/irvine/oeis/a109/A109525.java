package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109525.
 * @author Sean A. Irvine
 */
public class A109525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109525() {
    super(new long[] {-1, -1, -1, -1, 2, 1, 1, 1}, new long[] {0, 2, 2, 4, 4, 9, 16, 31});
  }
}
