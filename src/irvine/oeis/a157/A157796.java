package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157796 a(n) = 27225*n^2 - 12098*n + 1344.
 * @author Sean A. Irvine
 */
public class A157796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157796() {
    super(1, new long[] {1, -3, 3}, new long[] {16471, 86048, 210075});
  }
}
