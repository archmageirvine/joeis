package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022128 Fibonacci sequence beginning 3, 19.
 * @author Sean A. Irvine
 */
public class A022128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022128() {
    super(new long[] {1, 1}, new long[] {3, 19});
  }
}
