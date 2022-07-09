package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051449 Number of fibered rational knots with n crossings.
 * @author Sean A. Irvine
 */
public class A051449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051449() {
    super(new long[] {-1, -2, -2, -2, 1, 2, 2, 0}, new long[] {1, 1, 1, 2, 3, 4, 7, 10});
  }
}
