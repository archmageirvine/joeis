package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174509.
 * @author Sean A. Irvine
 */
public class A174509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174509() {
    super(new long[] {1, 0, 0, -103, 0, 0, 103, 0, 0}, new long[] {1, 9, 101, 1, 1029, 10401, 1, 105049, 1060901});
  }
}
