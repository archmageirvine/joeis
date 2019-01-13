package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270205.
 * @author Sean A. Irvine
 */
public class A270205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270205() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 6, 36});
  }
}
