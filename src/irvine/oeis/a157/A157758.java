package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157758 a(n) = 297754*n - 244754.
 * @author Sean A. Irvine
 */
public class A157758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157758() {
    super(1, new long[] {-1, 2}, new long[] {53000, 350754});
  }
}
