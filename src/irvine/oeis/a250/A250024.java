package irvine.oeis.a250;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A250024 a(n) = 40*n - 21.
 * @author Sean A. Irvine
 */
public class A250024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A250024() {
    super(1, new long[] {-1, 2}, new long[] {19, 59});
  }
}
