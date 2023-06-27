package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158539 a(n) = 121*n^2 - 11.
 * @author Sean A. Irvine
 */
public class A158539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158539() {
    super(1, new long[] {1, -3, 3}, new long[] {110, 473, 1078});
  }
}
