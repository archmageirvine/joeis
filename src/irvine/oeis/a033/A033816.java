package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033816 a(n) = 2*n^2 + 3*n + 3.
 * @author Sean A. Irvine
 */
public class A033816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033816() {
    super(new long[] {1, -3, 3}, new long[] {3, 8, 17});
  }
}
