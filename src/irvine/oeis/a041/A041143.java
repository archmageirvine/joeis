package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041143.
 * @author Sean A. Irvine
 */
public class A041143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041143() {
    super(new long[] {-1, 0, 18, 0}, new long[] {0, 1, 1, 17});
  }
}
