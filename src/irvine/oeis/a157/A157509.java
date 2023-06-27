package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157509 a(n) = 13122*n^2 - 324*n + 1.
 * @author Sean A. Irvine
 */
public class A157509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157509() {
    super(1, new long[] {1, -3, 3}, new long[] {12799, 51841, 117127});
  }
}
