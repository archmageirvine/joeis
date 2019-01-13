package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212765.
 * @author Sean A. Irvine
 */
public class A212765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212765() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {0, 1, 2, 16, 24, 81, 108, 256, 320});
  }
}
