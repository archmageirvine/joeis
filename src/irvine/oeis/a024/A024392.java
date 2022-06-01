package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024392 a(n) = 3rd elementary symmetric function of the first n+2 positive integers congruent to 2 mod 3.
 * @author Sean A. Irvine
 */
public class A024392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024392() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {80, 806, 4040, 14155, 39655, 95200, 204036});
  }
}
