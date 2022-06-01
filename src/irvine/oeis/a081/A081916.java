package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081916 a(n) = 5^n*(n^3 - 3n^2 + 2n + 750)/750.
 * @author Sean A. Irvine
 */
public class A081916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081916() {
    super(new long[] {-625, 500, -150, 20}, new long[] {1, 5, 25, 126});
  }
}
