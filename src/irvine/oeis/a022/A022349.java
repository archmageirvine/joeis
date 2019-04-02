package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022349 Fibonacci sequence beginning 0, 15.
 * @author Sean A. Irvine
 */
public class A022349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022349() {
    super(new long[] {1, 1}, new long[] {0, 15});
  }
}
