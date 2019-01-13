package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107479.
 * @author Sean A. Irvine
 */
public class A107479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107479() {
    super(new long[] {1, 1, 1, 1, 1, 1, 0}, new long[] {0, 1, 1, 2, 3, 5, 8});
  }
}
