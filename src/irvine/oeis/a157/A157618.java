package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157618 625n^2 - 886n + 314.
 * @author Sean A. Irvine
 */
public class A157618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157618() {
    super(new long[] {1, -3, 3}, new long[] {53, 1042, 3281});
  }
}
