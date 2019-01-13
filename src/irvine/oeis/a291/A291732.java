package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291732.
 * @author Sean A. Irvine
 */
public class A291732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291732() {
    super(new long[] {-4, 0, -8, 4, -4, 4}, new long[] {4, 12, 36, 104, 288, 780});
  }
}
