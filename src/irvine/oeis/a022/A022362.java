package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022362 Fibonacci sequence beginning 0, 28.
 * @author Sean A. Irvine
 */
public class A022362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022362() {
    super(new long[] {1, 1}, new long[] {0, 28});
  }
}
