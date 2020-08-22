package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022357 Fibonacci sequence beginning 0, 23.
 * @author Sean A. Irvine
 */
public class A022357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022357() {
    super(new long[] {1, 1}, new long[] {0, 23});
  }
}
