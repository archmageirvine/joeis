package irvine.oeis.a075;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A075045 Coefficients A_n for the s=3 tennis ball problem.
 * Recurrence: a(n)=(6*(252*n^3+477*n^2+220*n+11)*a(n-1)-81*(63*n^3+72*n^2-7*n-8)*a(n-2))/(8*(14*n^3+37*n^2+26*n+3))
 * @author Georg Fischer
 */
public class A075045 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A075045() {
    super(0, "[[0],[648, 567,-5832,-5103],[66, 1320, 2862, 1512],[-24,-208,-296,-112]]", "1, 9, 69, 502, 3564, 24960, 173325, 1196748", 0);
  }
}
