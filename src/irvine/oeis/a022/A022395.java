package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022395 Fibonacci sequence beginning 1, 25.
 * @author Sean A. Irvine
 */
public class A022395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022395() {
    super(new long[] {1, 1}, new long[] {1, 25});
  }
}
