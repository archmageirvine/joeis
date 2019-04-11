package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130630 Periodic sequence with period <code>1 1 1 1 1 0 0 0 0</code>.
 * @author Sean A. Irvine
 */
public class A130630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130630() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 0, 0, 0, 0});
  }
}
