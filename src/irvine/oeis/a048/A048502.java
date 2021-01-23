package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048502 a(n) = 2^(n-1)*(9*n-16)+9.
 * @author Sean A. Irvine
 */
public class A048502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048502() {
    super(new long[] {4, -8, 5}, new long[] {1, 2, 13});
  }
}
