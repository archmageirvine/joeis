package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136395 Binomial transform of [1, 3, 4, 3, 2, 0, 0, 0,...].
 * @author Sean A. Irvine
 */
public class A136395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136395() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 4, 11, 25, 51});
  }
}
