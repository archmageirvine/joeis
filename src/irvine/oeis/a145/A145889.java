package irvine.oeis.a145;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A145889 Number of even entries that are followed by a smaller entry in all permutations of {1,2,...,n}.
 * Recurrence (-4*n+11)*a(n) +(9*n-25)*a(n-1) +(n-2)*(4*n^2-3*n-3)*a(n-2) -(n-2)*(n-3)*(5*n-7)*a(n-3)=0
 * @author Georg Fischer
 */
public class A145889 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A145889() {
    super(1, "[[0],[42,-65, 32,-5],[6, 3,-11, 4],[-25, 9],[11,-4]", "0, 1", 0);
  }
}
