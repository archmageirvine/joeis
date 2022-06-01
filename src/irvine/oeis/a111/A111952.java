package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111952 a(n) = 3*n mod 7.
 * @author Sean A. Irvine
 */
public class A111952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111952() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {0, 3, 6, 2, 5, 1, 4});
  }
}
