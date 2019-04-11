package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158539 <code>a(n) = 121*n^2 - 11</code>.
 * @author Sean A. Irvine
 */
public class A158539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158539() {
    super(new long[] {1, -3, 3}, new long[] {110, 473, 1078});
  }
}
