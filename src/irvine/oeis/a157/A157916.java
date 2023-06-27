package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157916 a(n) = 50*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A157916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157916() {
    super(1, new long[] {1, -3, 3}, new long[] {51, 201, 451});
  }
}
