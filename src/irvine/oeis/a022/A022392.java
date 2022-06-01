package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022392 Fibonacci sequence beginning 1, 22.
 * @author Sean A. Irvine
 */
public class A022392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022392() {
    super(new long[] {1, 1}, new long[] {1, 22});
  }
}
