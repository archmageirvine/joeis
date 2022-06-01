package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077237 Combined Diophantine Chebyshev sequences A054491 and A077234.
 * @author Sean A. Irvine
 */
public class A077237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077237() {
    super(new long[] {-1, 0, 4, 0}, new long[] {1, 2, 6, 9});
  }
}
