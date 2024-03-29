package irvine.oeis.a200;
// Generated by gen_seq4.pl holos at 2021-06-24 22:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A200979 Number of ways to arrange n books on 4 consecutive bookshelves, leaving no shelf empty.
 * Recurrence: -(n-4)*a(n)+n*(n-1)*a(n-1)=0
 * @author Georg Fischer
 */
public class A200979 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A200979() {
    super(4, "[[0],[0,-1, 1],[4,-1]]", "[24]", 0);
  }
}
