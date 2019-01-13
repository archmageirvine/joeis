package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211534.
 * @author Sean A. Irvine
 */
public class A211534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211534() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 0, 0, 0, 0, 0, 1});
  }
}
