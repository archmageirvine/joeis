package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130630 Periodic sequence with period 1 1 1 1 1 0 0 0 0.
 * @author Sean A. Irvine
 */
public class A130630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130630() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 0, 0, 0, 0});
  }
}
