package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062547 a(n) is least odd integer not a partial sum of 1, 3, ..., a(n-1).
 * @author Sean A. Irvine
 */
public class A062547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062547() {
    super(new long[] {3, 3, -1}, new long[] {1, 3, 5});
  }
}
