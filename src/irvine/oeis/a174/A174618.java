package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174618.
 * @author Sean A. Irvine
 */
public class A174618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174618() {
    super(new long[] {1, 0, 0, 0, -1, 0, 2, 0}, new long[] {0, 1, 0, 1, 1, 1, 2, 1});
  }
}
