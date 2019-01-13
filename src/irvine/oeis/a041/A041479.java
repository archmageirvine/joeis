package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041479.
 * @author Sean A. Irvine
 */
public class A041479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041479() {
    super(new long[] {-1, 0, 32, 0}, new long[] {1, 1, 31, 32});
  }
}
