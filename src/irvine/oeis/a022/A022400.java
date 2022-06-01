package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022400 Fibonacci sequence beginning 1, 30.
 * @author Sean A. Irvine
 */
public class A022400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022400() {
    super(new long[] {1, 1}, new long[] {1, 30});
  }
}
