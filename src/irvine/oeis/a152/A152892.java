package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152892 Periodic sequence [0,3,1,0,1] of period 5.
 * @author Sean A. Irvine
 */
public class A152892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152892() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {0, 3, 1, 0, 1});
  }
}
