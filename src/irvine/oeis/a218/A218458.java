package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218458 a(n) = 2*n^3 - 163*n^2 + 2777*n - 11927.
 * @author Sean A. Irvine
 */
public class A218458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218458() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-11927, -9311, -7009, -5009});
  }
}
