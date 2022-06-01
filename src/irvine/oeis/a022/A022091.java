package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022091 Fibonacci sequence beginning 0, 8.
 * @author Sean A. Irvine
 */
public class A022091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022091() {
    super(new long[] {1, 1}, new long[] {0, 8});
  }
}
