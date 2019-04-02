package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022106 Fibonacci sequence beginning 1, 16.
 * @author Sean A. Irvine
 */
public class A022106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022106() {
    super(new long[] {1, 1}, new long[] {1, 16});
  }
}
