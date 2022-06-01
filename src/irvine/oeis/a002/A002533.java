package irvine.oeis.a002;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A002533 a(n) = 2*a(n-1) + 5*a(n-2).
 * @author Sean A. Irvine
 */
public class A002533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002533() {
    super(new long[] {5, 2}, new long[] {1, 1});
  }
}
