package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168419 a(n) = 9*floor(n/2).
 * @author Sean A. Irvine
 */
public class A168419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168419() {
    super(new long[] {-1, 1, 1}, new long[] {0, 9, 9});
  }
}
