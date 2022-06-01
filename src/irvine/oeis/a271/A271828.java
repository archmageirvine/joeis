package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271828 a(n) = 4*n^3 - 18*n^2 + 27*n - 12.
 * @author Sean A. Irvine
 */
public class A271828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271828() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 15, 64});
  }
}
