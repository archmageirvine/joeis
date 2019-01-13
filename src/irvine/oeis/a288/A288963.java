package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288963.
 * @author Sean A. Irvine
 */
public class A288963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288963() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 36, 288, 1320, 4464, 12348});
  }
}
