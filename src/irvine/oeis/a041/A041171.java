package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041171.
 * @author Sean A. Irvine
 */
public class A041171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041171() {
    super(new long[] {-1, 0, 0, 0, 78, 0, 0, 0}, new long[] {1, 1, 3, 4, 75, 79, 233, 312});
  }
}
