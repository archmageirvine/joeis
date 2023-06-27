package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157909 a(n) = 81*n^2 - 9.
 * @author Sean A. Irvine
 */
public class A157909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157909() {
    super(1, new long[] {1, -3, 3}, new long[] {72, 315, 720});
  }
}
