package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107767.
 * @author Sean A. Irvine
 */
public class A107767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107767() {
    super(new long[] {9, -12, 0, 4}, new long[] {0, 1, 4, 16});
  }
}
