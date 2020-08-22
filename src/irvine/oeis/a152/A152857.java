package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152857 Periodic sequence [0,2,3,0,0] of period 5.
 * @author Sean A. Irvine
 */
public class A152857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152857() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {0, 2, 3, 0, 0});
  }
}
