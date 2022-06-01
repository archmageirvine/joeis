package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130875 Absolute difference of final digits of two consecutive cubes.
 * @author Sean A. Irvine
 */
public class A130875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130875() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 1, 3, 1, 1, 3, 1, 7, 9});
  }
}
