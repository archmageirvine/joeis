package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022377 Fibonacci sequence beginning 2, 30.
 * @author Sean A. Irvine
 */
public class A022377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022377() {
    super(new long[] {1, 1}, new long[] {2, 30});
  }
}
