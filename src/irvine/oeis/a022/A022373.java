package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022373 Fibonacci sequence beginning 2, 22.
 * @author Sean A. Irvine
 */
public class A022373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022373() {
    super(new long[] {1, 1}, new long[] {2, 22});
  }
}
