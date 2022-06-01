package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024381 a(n) = sum of squares of first n positive integers congruent to 1 mod 4.
 * @author Sean A. Irvine
 */
public class A024381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024381() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 26, 107, 276});
  }
}
