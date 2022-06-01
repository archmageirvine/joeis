package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022354 Fibonacci sequence beginning 0, 20.
 * @author Sean A. Irvine
 */
public class A022354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022354() {
    super(new long[] {1, 1}, new long[] {0, 20});
  }
}
