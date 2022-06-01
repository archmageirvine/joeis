package irvine.oeis.a294;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A294116 Fibonacci sequence beginning 2, 21.
 * @author Sean A. Irvine
 */
public class A294116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294116() {
    super(new long[] {1, 1}, new long[] {2, 21});
  }
}
