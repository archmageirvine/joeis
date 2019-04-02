package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287811 Number of septenary sequences of length n such that no two consecutive terms have distance 5.
 * @author Sean A. Irvine
 */
public class A287811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287811() {
    super(new long[] {3, 6}, new long[] {1, 7});
  }
}
