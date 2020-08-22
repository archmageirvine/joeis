package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022359 Fibonacci sequence beginning 0, 25.
 * @author Sean A. Irvine
 */
public class A022359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022359() {
    super(new long[] {1, 1}, new long[] {0, 25});
  }
}
