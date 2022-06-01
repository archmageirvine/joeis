package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139700 Binomial transform of [1, 30, 30, 30, ...].
 * @author Sean A. Irvine
 */
public class A139700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139700() {
    super(new long[] {-2, 3}, new long[] {1, 31});
  }
}
