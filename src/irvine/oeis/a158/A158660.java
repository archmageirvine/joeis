package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158660 a(n) = 56*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158660() {
    super(new long[] {1, -3, 3}, new long[] {1, 57, 225});
  }
}
