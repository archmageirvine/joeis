package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174474.
 * @author Sean A. Irvine
 */
public class A174474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174474() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 0, -1, 3, 0});
  }
}
