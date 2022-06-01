package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070336 a(n) = 2^n mod 25.
 * @author Sean A. Irvine
 */
public class A070336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070336() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 8, 16, 7, 14, 3, 6, 12, 24});
  }
}
