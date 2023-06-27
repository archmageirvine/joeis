package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139698 Binomial transform of [1, 25, 25, 25, ...].
 * @author Sean A. Irvine
 */
public class A139698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139698() {
    super(1, new long[] {-2, 3}, new long[] {1, 26});
  }
}
