package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022139 Fibonacci sequence beginning 5, 14.
 * @author Sean A. Irvine
 */
public class A022139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022139() {
    super(new long[] {1, 1}, new long[] {5, 14});
  }
}
