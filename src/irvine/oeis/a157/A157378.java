package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157378 <code>a(n) = 43046721*n^2 - 50729652*n + 14945957</code>.
 * @author Sean A. Irvine
 */
public class A157378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157378() {
    super(new long[] {1, -3, 3}, new long[] {7263026, 85673537, 250177490});
  }
}
