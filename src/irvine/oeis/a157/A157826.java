package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157826 103680000n^2 - 194428800n + 91152001.
 * @author Sean A. Irvine
 */
public class A157826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157826() {
    super(1, new long[] {1, -3, 3}, new long[] {403201, 117014401, 440985601});
  }
}
