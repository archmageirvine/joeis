package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070340 a(n) = 2^n mod 39.
 * @author Sean A. Irvine
 */
public class A070340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070340() {
    super(new long[] {1, -1, 0, 0, 1, -1, 0, 0, 1}, new long[] {1, 2, 4, 8, 16, 32, 25, 11, 22});
  }
}
