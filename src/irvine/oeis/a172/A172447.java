package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172447 a(n) = (-1 + 5*2^(2*n + 1) - 3*n)/9.
 * @author Sean A. Irvine
 */
public class A172447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172447() {
    super(new long[] {4, -9, 6}, new long[] {1, 4, 17});
  }
}
