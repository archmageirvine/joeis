package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022117 Fibonacci sequence beginning 2, 15.
 * @author Sean A. Irvine
 */
public class A022117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022117() {
    super(new long[] {1, 1}, new long[] {2, 15});
  }
}
