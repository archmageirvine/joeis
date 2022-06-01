package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061804 a(n) = 2*n*(2*n^2 + 1).
 * @author Sean A. Irvine
 */
public class A061804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061804() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 6, 36, 114});
  }
}
