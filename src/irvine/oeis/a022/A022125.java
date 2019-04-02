package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022125 Fibonacci sequence beginning 3, 14.
 * @author Sean A. Irvine
 */
public class A022125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022125() {
    super(new long[] {1, 1}, new long[] {3, 14});
  }
}
