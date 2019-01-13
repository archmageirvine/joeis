package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041285.
 * @author Sean A. Irvine
 */
public class A041285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041285() {
    super(new long[] {-1, 0, 0, 0, 498, 0, 0, 0}, new long[] {1, 2, 9, 20, 489, 998, 4481, 9960});
  }
}
