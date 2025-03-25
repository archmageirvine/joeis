package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081905 Third binomial transform of binomial(n+6, 6).
 * @author Sean A. Irvine
 */
public class A081905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081905() {
    super(new long[] {16384, -28672, 21504, -8960, 2240, -336, 28}, new long[] {1, 10, 79, 552, 3567, 21810, 127905});
  }
}
