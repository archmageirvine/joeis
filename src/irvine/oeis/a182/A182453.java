package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182453 a(n) = 3^n - n*(n-1)/2.
 * @author Sean A. Irvine
 */
public class A182453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182453() {
    super(new long[] {-3, 10, -12, 6}, new long[] {1, 3, 8, 24});
  }
}
