package irvine.oeis.a194;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A194237 a(n) = [Sum_{k=1..n} (3k/8)], where [ ]=floor, ( )=fractional part.
 * Recurrence: a(n)=a(n-1)+a(n-16)-a(n-17)
 * @author Georg Fischer
 */
public class A194237 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A194237() {
    super(1, "[[0],[-1],[1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[1],[-1]]", "0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 10", 0);
  }
}
