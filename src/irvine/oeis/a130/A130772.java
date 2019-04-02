package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130772 Periodic sequence with period 2 2 0 -2 -2 0.
 * @author Sean A. Irvine
 */
public class A130772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130772() {
    super(new long[] {-1, 1}, new long[] {2, 2});
  }
}
