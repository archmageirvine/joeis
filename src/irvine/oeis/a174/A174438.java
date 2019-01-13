package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174438.
 * @author Sean A. Irvine
 */
public class A174438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174438() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 5, 8, 9});
  }
}
