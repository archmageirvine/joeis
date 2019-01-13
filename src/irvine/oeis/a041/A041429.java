package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041429.
 * @author Sean A. Irvine
 */
public class A041429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041429() {
    super(new long[] {-1, 0, 182, 0}, new long[] {1, 6, 181, 1092});
  }
}
