package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022387 Fibonacci sequence beginning 4, 30.
 * @author Sean A. Irvine
 */
public class A022387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022387() {
    super(new long[] {1, 1}, new long[] {4, 30});
  }
}
