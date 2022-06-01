package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022098 Fibonacci sequence beginning 1, 8.
 * @author Sean A. Irvine
 */
public class A022098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022098() {
    super(new long[] {1, 1}, new long[] {1, 8});
  }
}
