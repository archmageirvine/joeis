package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143060 a(n) = (n^5 + 145*n^4 + 905*n^3 + 155*n^2 + 594*n + 120)/120.
 * @author Sean A. Irvine
 */
public class A143060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143060() {
    super(0, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 16, 96, 331, 842, 1782});
  }
}
