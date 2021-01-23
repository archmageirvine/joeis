package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022351 Fibonacci sequence beginning 0, 17.
 * @author Sean A. Irvine
 */
public class A022351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022351() {
    super(new long[] {1, 1}, new long[] {0, 17});
  }
}
