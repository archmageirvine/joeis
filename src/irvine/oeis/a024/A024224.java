package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024224 a(n) = floor((4th elementary symmetric function of S(n))/(3rd elementary symmetric function of S(n))), where S(n) = {first n+3 positive integers congruent to 1 mod 3}.
 * @author Sean A. Irvine
 */
public class A024224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024224() {
    super(new long[] {1, -3, 4, -4, 4, -4, 4, -4, 3}, new long[] {0, 2, 4, 7, 11, 16, 22, 28, 35});
  }
}
