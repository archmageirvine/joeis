package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022376 Fibonacci sequence beginning 2, 28.
 * @author Sean A. Irvine
 */
public class A022376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022376() {
    super(new long[] {1, 1}, new long[] {2, 28});
  }
}
