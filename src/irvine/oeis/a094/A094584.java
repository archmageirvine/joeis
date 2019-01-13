package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094584.
 * @author Sean A. Irvine
 */
public class A094584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094584() {
    super(new long[] {1, 1, -3, -1, 3}, new long[] {1, 5, 14, 34, 74});
  }
}
