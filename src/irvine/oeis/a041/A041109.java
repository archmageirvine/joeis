package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041109.
 * @author Sean A. Irvine
 */
public class A041109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041109() {
    super(new long[] {-1, 0, 0, 0, 126, 0, 0, 0}, new long[] {1, 1, 7, 8, 119, 127, 881, 1008});
  }
}
