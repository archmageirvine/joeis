package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022096 Fibonacci sequence beginning 1, 6.
 * @author Sean A. Irvine
 */
public class A022096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022096() {
    super(new long[] {1, 1}, new long[] {1, 6});
  }
}
