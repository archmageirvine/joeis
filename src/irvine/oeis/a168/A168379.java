package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168379 a(n) = 4*n - 2*(-1)^n + 1.
 * @author Sean A. Irvine
 */
public class A168379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168379() {
    super(1, new long[] {-1, 1, 1}, new long[] {7, 7, 15});
  }
}
