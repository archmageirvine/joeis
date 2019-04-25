package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022133 Fibonacci sequence beginning 4, 15.
 * @author Sean A. Irvine
 */
public class A022133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022133() {
    super(new long[] {1, 1}, new long[] {4, 15});
  }
}
