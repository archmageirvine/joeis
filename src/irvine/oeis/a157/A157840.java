package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157840 103680000n^2 - 174211200n + 73180801.
 * @author Sean A. Irvine
 */
public class A157840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157840() {
    super(new long[] {1, -3, 3}, new long[] {2649601, 139478401, 483667201});
  }
}
