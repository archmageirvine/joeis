package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024378 a(n) = 2nd elementary symmetric function of the first n+1 positive integers congruent to 1 mod 4.
 * @author Sean A. Irvine
 */
public class A024378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024378() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {5, 59, 254, 730, 1675});
  }
}
