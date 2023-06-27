package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077414 a(n) = n*(n - 1)*(n + 2)/2.
 * @author Sean A. Irvine
 */
public class A077414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077414() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {0, 4, 15, 36});
  }
}
