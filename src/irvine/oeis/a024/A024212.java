package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024212 2nd elementary symmetric function of first n+1 positive integers congruent to 1 mod 3.
 * @author Sean A. Irvine
 */
public class A024212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024212() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {4, 39, 159, 445, 1005});
  }
}
