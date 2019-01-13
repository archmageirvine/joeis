package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293505.
 * @author Sean A. Irvine
 */
public class A293505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293505() {
    super(new long[] {-1, -1, 1, 0, 0, 0, 1, 1}, new long[] {0, 0, 0, 1, 2, 2, 4, 6});
  }
}
