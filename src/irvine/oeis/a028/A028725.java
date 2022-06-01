package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028725 a(n) = floor(n/2) * floor((n-1)/2) * floor((n-2)/2) * floor((n-3)/2) * floor((n-4)/2) / 12.
 * @author Sean A. Irvine
 */
public class A028725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028725() {
    super(new long[] {-1, 1, 5, -5, -10, 10, 10, -10, -5, 5, 1}, new long[] {0, 0, 0, 0, 0, 0, 1, 3, 12, 24, 60});
  }
}
