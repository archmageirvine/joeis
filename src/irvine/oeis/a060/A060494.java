package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060494.
 * @author Sean A. Irvine
 */
public class A060494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060494() {
    super(new long[] {1, -4, 6, -4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 4, -6, 4}, new long[] {0, 0, 0, 1, 4, 9, 20, 37, 64, 102, 156, 228, 324, 446, 600, 791, 1024, 1305, 1640, 2036});
  }
}
