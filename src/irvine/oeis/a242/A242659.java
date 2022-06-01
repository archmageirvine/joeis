package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242659 a(n) = n*(n^2 - 3*n + 4).
 * @author Sean A. Irvine
 */
public class A242659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242659() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 2, 4, 12});
  }
}
