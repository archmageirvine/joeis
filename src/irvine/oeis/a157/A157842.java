package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157842 a(n) = 3600*n^2 - 5599*n + 2177.
 * @author Sean A. Irvine
 */
public class A157842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157842() {
    super(1, new long[] {1, -3, 3}, new long[] {178, 5379, 17780});
  }
}
