package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027694 a(n) = n^2 + n + 9.
 * @author Sean A. Irvine
 */
public class A027694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027694() {
    super(new long[] {1, -3, 3}, new long[] {9, 11, 15});
  }
}
