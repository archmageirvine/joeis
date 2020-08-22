package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022092 Fibonacci sequence beginning 0, 9.
 * @author Sean A. Irvine
 */
public class A022092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022092() {
    super(new long[] {1, 1}, new long[] {0, 9});
  }
}
