package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024495 a(n) = C(n,2) + C(n,5) + ... + C(n, 3*floor(n/3)+2).
 * @author Sean A. Irvine
 */
public class A024495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024495() {
    super(new long[] {2, -3, 3}, new long[] {0, 0, 1});
  }
}
