package irvine.oeis.a297;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A297470 Number of maximal matchings in the n-barbell graph.
 * Recurrence: (n-3)*(n+1)*a(n) + (4*n-2)*a(n-1) - (n+2)*(n-2)*(n-1)^2*a(n-2) = 0
 * @author Georg Fischer
 */
public class A297470 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A297470() {
    super(1, "[[0],[-4,8,-3,-2,1],[2,-4],[3,2,-1]]", "1,2,9", 0);
  }
}
