package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168329 a(n) = (3/2)*(2*n - (-1)^n - 1).
 * @author Sean A. Irvine
 */
public class A168329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168329() {
    super(1, new long[] {-1, 1, 1}, new long[] {3, 3, 9});
  }
}
