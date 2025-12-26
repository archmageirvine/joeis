package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156844 a(n) = 279841*n^2 - 394634*n + 139128.
 * @author Sean A. Irvine
 */
public class A156844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156844() {
    super(1, new long[] {1, -3, 3}, new long[] {24335, 469224, 1473795});
  }
}
