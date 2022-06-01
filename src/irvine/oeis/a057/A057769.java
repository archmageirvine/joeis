package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057769 a(n) = 4*n^4 + 8*n^3 - 4*n - 1 = (2*n^2 - 1)*(2*n^2 + 4*n + 1).
 * @author Sean A. Irvine
 */
public class A057769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057769() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {-1, 7, 119, 527, 1519});
  }
}
