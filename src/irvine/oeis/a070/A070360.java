package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070360 a(n) = 3^n mod 38.
 * @author Sean A. Irvine
 */
public class A070360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070360() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 3, 9, 27, 5, 15, 7, 21, 25, 37});
  }
}
