package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139635 Binomial transform of [1, 11, 11, 11, ...].
 * @author Sean A. Irvine
 */
public class A139635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139635() {
    super(1, new long[] {-2, 3}, new long[] {1, 12});
  }
}
