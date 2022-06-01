package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022123 Fibonacci sequence beginning 3, 11.
 * @author Sean A. Irvine
 */
public class A022123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022123() {
    super(new long[] {1, 1}, new long[] {3, 11});
  }
}
