package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022379 Fibonacci sequence beginning 3, 9.
 * @author Sean A. Irvine
 */
public class A022379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022379() {
    super(new long[] {1, 1}, new long[] {3, 9});
  }
}
