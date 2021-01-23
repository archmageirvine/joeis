package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157265 a(n) = 36*n^2 - 17*n + 2.
 * @author Sean A. Irvine
 */
public class A157265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157265() {
    super(new long[] {1, -3, 3}, new long[] {21, 112, 275});
  }
}
