package irvine.oeis.a054;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A054726 Number of graphs with n nodes on a circle without crossing edges.
 * Recurrence: a(n)=((12*n-30)*a(n-1)-(4*n-16)*a(n-2))/(n-1)
 * @author Georg Fischer
 */
public class A054726 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A054726() {
    super(0, "[[0],[16,-4],[-30, 12],[1,-1]]", "1, 1, 2, 8, 48, 352, 2880, 25216", 0);
  }
}
