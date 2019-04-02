package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022141 Fibonacci sequence beginning 5, 17.
 * @author Sean A. Irvine
 */
public class A022141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022141() {
    super(new long[] {1, 1}, new long[] {5, 17});
  }
}
