package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137256 Binomial transform of <code>2^n, 2^n, 2^n</code>.
 * @author Sean A. Irvine
 */
public class A137256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137256() {
    super(new long[] {3, -3, 3}, new long[] {1, 2, 4});
  }
}
