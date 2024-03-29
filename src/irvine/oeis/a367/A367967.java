package irvine.oeis.a367;
// Generated by gen_seq4.pl 2023-12-14/holos at 2023-12-19 19:21

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A367967 a(n) = 3/4*(3^(n + 1) - 2*n - 4*n^2 - 3).
 * @author Georg Fischer
 */
public class A367967 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A367967() {
    super(0, "[[0],[-3],[10],[-12],[6],[-1]]", "0,0,3,27", 0);
  }
}
