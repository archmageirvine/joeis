package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101384 a(n) = n*(n-1)^3*(n^2-n-1)/2.
 * @author Sean A. Irvine
 */
public class A101384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101384() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 1, 60, 594, 3040, 10875});
  }
}
