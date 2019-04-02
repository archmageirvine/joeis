package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022088 Fibonacci sequence beginning 0, 5.
 * @author Sean A. Irvine
 */
public class A022088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022088() {
    super(new long[] {1, 1}, new long[] {0, 5});
  }
}
