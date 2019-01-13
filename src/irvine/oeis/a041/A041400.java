package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041400.
 * @author Sean A. Irvine
 */
public class A041400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041400() {
    super(new long[] {-1, 0, 0, 0, 88, 0, 0, 0}, new long[] {14, 15, 29, 44, 1261, 1305, 2566, 3871});
  }
}
