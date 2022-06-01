package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022383 Fibonacci sequence beginning 4, 14.
 * @author Sean A. Irvine
 */
public class A022383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022383() {
    super(new long[] {1, 1}, new long[] {4, 14});
  }
}
