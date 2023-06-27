package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024391 2nd elementary symmetric function of the first n+1 positive integers congruent to 2 mod 3.
 * @author Sean A. Irvine
 */
public class A024391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024391() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {10, 66, 231, 595, 1275});
  }
}
