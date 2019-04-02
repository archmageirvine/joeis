package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139577 a(n) = n*(2*n + 11).
 * @author Sean A. Irvine
 */
public class A139577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139577() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 30});
  }
}
