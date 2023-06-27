package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257449 a(n) = 75*(2^n - 1) - 4*n^3 - 18*n^2 - 52*n.
 * @author Sean A. Irvine
 */
public class A257449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257449() {
    super(1, new long[] {2, -9, 16, -14, 6}, new long[] {1, 17, 99, 373, 1115});
  }
}
