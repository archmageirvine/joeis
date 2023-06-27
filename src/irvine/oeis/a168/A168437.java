package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168437 a(n) = 3 + 10*floor(n/2).
 * @author Sean A. Irvine
 */
public class A168437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168437() {
    super(1, new long[] {-1, 1, 1}, new long[] {3, 13, 13});
  }
}
