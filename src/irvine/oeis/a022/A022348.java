package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022348 Fibonacci sequence beginning <code>0, 14</code>.
 * @author Sean A. Irvine
 */
public class A022348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022348() {
    super(new long[] {1, 1}, new long[] {0, 14});
  }
}
