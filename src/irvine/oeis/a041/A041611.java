package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041611.
 * @author Sean A. Irvine
 */
public class A041611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041611() {
    super(new long[] {-1, 0, 36, 0}, new long[] {1, 1, 35, 36});
  }
}
