package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211535.
 * @author Sean A. Irvine
 */
public class A211535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211535() {
    super(new long[] {1, -1, 0, 0, -1, 0, 1, 0, 0, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
