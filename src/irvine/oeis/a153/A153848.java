package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153848 a(n) = 7*(10^(2*n) - 1)/33.
 * @author Sean A. Irvine
 */
public class A153848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153848() {
    super(1, new long[] {-100, 101}, new long[] {21, 2121});
  }
}
