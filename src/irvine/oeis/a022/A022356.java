package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022356 Fibonacci sequence beginning 0, 22.
 * @author Sean A. Irvine
 */
public class A022356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022356() {
    super(new long[] {1, 1}, new long[] {0, 22});
  }
}
