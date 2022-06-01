package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022380 Fibonacci sequence beginning 3, 12.
 * @author Sean A. Irvine
 */
public class A022380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022380() {
    super(new long[] {1, 1}, new long[] {3, 12});
  }
}
