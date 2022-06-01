package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022398 Fibonacci sequence beginning 1, 28.
 * @author Sean A. Irvine
 */
public class A022398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022398() {
    super(new long[] {1, 1}, new long[] {1, 28});
  }
}
