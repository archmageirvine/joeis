package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279259 Smallest positive integer m such that m, m+1, m+2, m+3 are divisible by 2n+1, 2n+3, 2n+5, 2n+7 respectively.
 * @author Sean A. Irvine
 */
public class A279259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279259() {
    super(new long[] {1, 0, 0, -5, 0, 0, 10, 0, 0, -10, 0, 0, 5, 0, 0}, new long[] {53, 159, 1735, 4508, 3222, 18238, 31499, 16965, 78013, 114722, 54348, 225124, 303425, 133515, 519187});
  }
}
