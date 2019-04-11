package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157370 <code>a(n) = 2401*n^2 - 3822*n + 1520</code>.
 * @author Sean A. Irvine
 */
public class A157370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157370() {
    super(new long[] {1, -3, 3}, new long[] {99, 3480, 11663});
  }
}
