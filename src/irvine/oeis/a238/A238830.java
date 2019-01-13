package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238830.
 * @author Sean A. Irvine
 */
public class A238830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238830() {
    super(new long[] {-1, 1, 6, 6, -1, -7, -1, 5, 1}, new long[] {0, 0, 0, 1, 2, 6, 15, 36, 91});
  }
}
