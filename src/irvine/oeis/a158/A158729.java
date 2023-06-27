package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158729 a(n) = 1156*n^2 - 34.
 * @author Sean A. Irvine
 */
public class A158729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158729() {
    super(1, new long[] {1, -3, 3}, new long[] {1122, 4590, 10370});
  }
}
