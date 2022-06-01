package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187532 a(n) = 4^n mod 19.
 * @author Sean A. Irvine
 */
public class A187532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187532() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 16, 7, 9, 17, 11, 6, 5});
  }
}
