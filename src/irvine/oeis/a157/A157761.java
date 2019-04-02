package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157761 a(n) = 297754*n - 53000.
 * @author Sean A. Irvine
 */
public class A157761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157761() {
    super(new long[] {-1, 2}, new long[] {244754, 542508});
  }
}
