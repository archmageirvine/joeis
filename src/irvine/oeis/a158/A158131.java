package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158131 a(n) = 121*n + 1.
 * @author Sean A. Irvine
 */
public class A158131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158131() {
    super(1, new long[] {-1, 2}, new long[] {122, 243});
  }
}
