package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153894 a(n) = 5*2^n - 1.
 * @author Sean A. Irvine
 */
public class A153894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153894() {
    super(new long[] {-2, 3}, new long[] {4, 9});
  }
}
