package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041715.
 * @author Sean A. Irvine
 */
public class A041715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041715() {
    super(new long[] {-1, 0, 0, 0, 466, 0, 0, 0}, new long[] {1, 2, 5, 12, 461, 934, 2329, 5592});
  }
}
