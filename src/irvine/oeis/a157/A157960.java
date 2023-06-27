package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157960 a(n) = 121*n^2 - n.
 * @author Sean A. Irvine
 */
public class A157960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157960() {
    super(1, new long[] {1, -3, 3}, new long[] {120, 482, 1086});
  }
}
