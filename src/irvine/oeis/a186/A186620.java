package irvine.oeis.a186;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A186620 Fibonacci sequence beginning 12, 25.
 * @author Sean A. Irvine
 */
public class A186620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186620() {
    super(new long[] {1, 1}, new long[] {12, 25});
  }
}
