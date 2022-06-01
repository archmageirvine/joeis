package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022104 Fibonacci sequence beginning 1, 14.
 * @author Sean A. Irvine
 */
public class A022104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022104() {
    super(new long[] {1, 1}, new long[] {1, 14});
  }
}
