package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022364 Fibonacci sequence beginning 0, 30.
 * @author Sean A. Irvine
 */
public class A022364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022364() {
    super(new long[] {1, 1}, new long[] {0, 30});
  }
}
