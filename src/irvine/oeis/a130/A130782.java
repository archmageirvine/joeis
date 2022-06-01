package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130782 Periodic sequence with period 1, 1, 2, 1, 1.
 * @author Sean A. Irvine
 */
public class A130782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130782() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, 2, 1, 1});
  }
}
