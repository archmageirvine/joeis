package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277984 a(n) = 6*n*(9*n-5).
 * @author Sean A. Irvine
 */
public class A277984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277984() {
    super(new long[] {1, -3, 3}, new long[] {0, 24, 156});
  }
}
