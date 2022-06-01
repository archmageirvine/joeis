package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022127 Fibonacci sequence beginning 3, 17.
 * @author Sean A. Irvine
 */
public class A022127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022127() {
    super(new long[] {1, 1}, new long[] {3, 17});
  }
}
