package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248619 a(n) = (n*(n+1))^4.
 * @author Sean A. Irvine
 */
public class A248619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248619() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 16, 1296, 20736, 160000, 810000, 3111696, 9834496, 26873856});
  }
}
