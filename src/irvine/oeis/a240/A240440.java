package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240440.
 * @author Sean A. Irvine
 */
public class A240440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240440() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 15, 105, 420, 1260, 3150});
  }
}
