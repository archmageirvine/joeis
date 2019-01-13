package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187321.
 * @author Sean A. Irvine
 */
public class A187321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187321() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 0, 1, 1, 3});
  }
}
