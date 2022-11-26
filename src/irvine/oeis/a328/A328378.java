package irvine.oeis.a328;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A328378 Number of permutations of length n that possess the maximal sum of distances between contiguous elements.
 * Recurrence: - (12*n-20)*a(n) + 4*a(n-1) + (3*n-2)*(n-3)*(n-2)*a(n-2) = 0
 * @author Georg Fischer
 */
public class A328378 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A328378() {
    super(0, "[[0],[-12,28,-17,3],[4],[20,-12]]", "1,1,2,4", 0);
  }
}
