package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022381 Fibonacci sequence beginning 3, 15.
 * @author Sean A. Irvine
 */
public class A022381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022381() {
    super(new long[] {1, 1}, new long[] {3, 15});
  }
}
