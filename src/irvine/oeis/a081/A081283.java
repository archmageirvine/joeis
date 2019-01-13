package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081283.
 * @author Sean A. Irvine
 */
public class A081283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081283() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 1, 1, 5, 6, 16, 20, 40});
  }
}
