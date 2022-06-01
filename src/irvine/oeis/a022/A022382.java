package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022382 Fibonacci sequence beginning 4, 10.
 * @author Sean A. Irvine
 */
public class A022382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022382() {
    super(new long[] {1, 1}, new long[] {4, 10});
  }
}
