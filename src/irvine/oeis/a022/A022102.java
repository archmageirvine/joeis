package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022102 Fibonacci sequence beginning 1, 12.
 * @author Sean A. Irvine
 */
public class A022102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022102() {
    super(new long[] {1, 1}, new long[] {1, 12});
  }
}
