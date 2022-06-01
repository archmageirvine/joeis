package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137256 Binomial transform of 2^n, 2^n, 2^n.
 * @author Sean A. Irvine
 */
public class A137256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137256() {
    super(new long[] {3, -3, 3}, new long[] {1, 2, 4});
  }
}
