package irvine.oeis.a091;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A091074 Fibonacci sequence beginning 12, 67.
 * @author Sean A. Irvine
 */
public class A091074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091074() {
    super(1, new long[] {1, 1}, new long[] {12, 67});
  }
}
