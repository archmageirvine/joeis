package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022372 Fibonacci sequence beginning 2, 20.
 * @author Sean A. Irvine
 */
public class A022372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022372() {
    super(new long[] {1, 1}, new long[] {2, 20});
  }
}
