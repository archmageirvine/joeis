package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054556 a(n) = 4*n^2 - 9*n + 6.
 * @author Sean A. Irvine
 */
public class A054556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054556() {
    super(new long[] {1, -3, 3}, new long[] {1, 4, 15});
  }
}
