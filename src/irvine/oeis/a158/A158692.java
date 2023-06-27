package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158692 a(n) = 1089*n^2 - 33.
 * @author Sean A. Irvine
 */
public class A158692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158692() {
    super(1, new long[] {1, -3, 3}, new long[] {1056, 4323, 9768});
  }
}
