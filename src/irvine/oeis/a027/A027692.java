package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027692 a(n) = n^2 + n + 7.
 * @author Sean A. Irvine
 */
public class A027692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027692() {
    super(new long[] {1, -3, 3}, new long[] {7, 9, 13});
  }
}
