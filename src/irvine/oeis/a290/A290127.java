package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290127.
 * @author Sean A. Irvine
 */
public class A290127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290127() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {40, 252, 1457, 6168, 20773, 59279, 149271, 340821, 719187});
  }
}
