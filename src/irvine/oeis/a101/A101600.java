package irvine.oeis.a101;
// Generated by gen_seq4.pl holos [[0],[-6,-12],[2,1]] [1,6,45] 0 at 2020-03-14 22:45
// Recurrence: (n+2)*a[n+0]-6*(2*n+1)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A101600 Expansion of g.f. c(3x)^2, where c(x) is the g.f. of A000108.
 * @author Georg Fischer
 */
public class A101600 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A101600() {
    super(0, "[[0],[-6,-12],[2,1]]", "[1,6,45]", 0);
  }
}
