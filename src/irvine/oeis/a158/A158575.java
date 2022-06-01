package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158575 a(n) = 32*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158575() {
    super(new long[] {1, -3, 3}, new long[] {1, 33, 129});
  }
}
