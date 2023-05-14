package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152418 A sevens sequence: a(n) = (7^n - 1)/(2^(4 - 3*(n mod 2))).
 * @author Sean A. Irvine
 */
public class A152418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152418() {
    super(new long[] {-49, 0, 50, 0}, new long[] {0, 3, 3, 171});
  }
}
