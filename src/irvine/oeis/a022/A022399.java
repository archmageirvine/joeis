package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022399 Fibonacci sequence beginning 1, 29.
 * @author Sean A. Irvine
 */
public class A022399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022399() {
    super(new long[] {1, 1}, new long[] {1, 29});
  }
}
