package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183863.
 * @author Sean A. Irvine
 */
public class A183863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183863() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {1, 3, 6, 10, 14, 20, 26});
  }
}
