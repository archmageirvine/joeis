package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264892 a(n) = n*(3*n - 2)*(9*n^2 - 6*n - 2).
 * @author Sean A. Irvine
 */
public class A264892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264892() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 176, 1281, 4720});
  }
}
