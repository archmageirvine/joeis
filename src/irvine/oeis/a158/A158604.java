package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158604 a(n) = 42*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158604() {
    super(new long[] {1, -3, 3}, new long[] {1, 43, 169});
  }
}
