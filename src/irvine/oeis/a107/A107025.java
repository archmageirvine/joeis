package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107025.
 * @author Sean A. Irvine
 */
public class A107025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107025() {
    super(new long[] {-1, 7, -15, 20, -15, 6}, new long[] {1, 1, 1, 1, 1, 2});
  }
}
