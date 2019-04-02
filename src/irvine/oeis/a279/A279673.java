package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279673 The maximum number of coins that can be processed in n weighings where all coins are real except for one LHR-coin starting in the light state.
 * @author Sean A. Irvine
 */
public class A279673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279673() {
    super(new long[] {4, -1, 2}, new long[] {1, 3, 9});
  }
}
