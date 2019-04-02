package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239035 Product of 8 consecutive integers.
 * @author Sean A. Irvine
 */
public class A239035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239035() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 40320, 362880, 1814400, 6652800, 19958400, 51891840, 121080960, 259459200});
  }
}
