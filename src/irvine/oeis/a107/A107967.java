package irvine.oeis.a107;
// Generated by gen_seq4.pl holos [[-1440,-6072,-11164,-11806,-7939,-3527,-1036,-194,-21,-1],[1440]] [1,30] 0 at 2020-03-14 22:45
// Recurrence: 1440*a[n+0]=(n+1)(n+2)^3*(n+3)^2*(n+4)(n^2+4*n+5)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A107967 a(n) = (n+1)(n+2)^3*(n+3)^2*(n+4)(n^2 + 4n + 5)/1440.
 * @author Georg Fischer
 */
public class A107967 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A107967() {
    super(0, "[[-1440,-6072,-11164,-11806,-7939,-3527,-1036,-194,-21,-1],[1440]]", "[1,30]", 0);
  }
}
