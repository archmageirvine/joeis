package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187497.
 * @author Sean A. Irvine
 */
public class A187497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187497() {
    super(new long[] {1, 0, 0, 3, 0, 0, 0, 0, 0}, new long[] {0, 1, 0, 1, 0, 1, 0, 2, 1});
  }
}
