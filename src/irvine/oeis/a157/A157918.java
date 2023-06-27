package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157918 a(n) = 625*n^2 - 25.
 * @author Sean A. Irvine
 */
public class A157918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157918() {
    super(1, new long[] {1, -3, 3}, new long[] {600, 2475, 5600});
  }
}
