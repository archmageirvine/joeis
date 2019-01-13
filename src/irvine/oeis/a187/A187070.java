package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187070.
 * @author Sean A. Irvine
 */
public class A187070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187070() {
    super(new long[] {-1, 0, 1, 0, 2, 0}, new long[] {0, 0, 1, 1, 1, 2});
  }
}
