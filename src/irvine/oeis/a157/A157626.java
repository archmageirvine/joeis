package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157626 a(n) = 100n^2 - 151n + 57.
 * @author Sean A. Irvine
 */
public class A157626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157626() {
    super(1, new long[] {1, -3, 3}, new long[] {6, 155, 504});
  }
}
