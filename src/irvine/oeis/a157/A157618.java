package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157618 a(n) = 625*n^2 - 886*n + 314.
 * @author Sean A. Irvine
 */
public class A157618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157618() {
    super(1, new long[] {1, -3, 3}, new long[] {53, 1042, 3281});
  }
}
