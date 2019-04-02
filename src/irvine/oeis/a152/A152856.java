package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152856 Periodic sequence [4,0,4,3,4] of period 5.
 * @author Sean A. Irvine
 */
public class A152856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152856() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {4, 0, 4, 3, 4});
  }
}
