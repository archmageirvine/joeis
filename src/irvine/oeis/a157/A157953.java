package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157953 a(n) = 81n^2 - n.
 * @author Sean A. Irvine
 */
public class A157953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157953() {
    super(new long[] {1, -3, 3}, new long[] {80, 322, 726});
  }
}
