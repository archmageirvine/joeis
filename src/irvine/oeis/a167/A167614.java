package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167614 a(n) = (n^2 + 3*n + 8)/2.
 * @author Sean A. Irvine
 */
public class A167614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167614() {
    super(new long[] {1, -3, 3}, new long[] {6, 9, 13});
  }
}
