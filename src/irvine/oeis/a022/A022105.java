package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022105 Fibonacci sequence beginning 1, 15.
 * @author Sean A. Irvine
 */
public class A022105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022105() {
    super(new long[] {1, 1}, new long[] {1, 15});
  }
}
