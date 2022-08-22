package irvine.oeis.a141;
// manually 2022-08-22

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A141253 Number of permutations that lie in the cyclic closure of Av(132)--i.e., at least one cyclic rotation of the permutation avoids the pattern 132.
 * Recurrence: (n-1)*(n-3)*(n+1)*a(n) -n*(5*n^2-16*n+9)*a(n-1) +2*n*(n-1)*(2*n-3)*a(n-2)=0.
 * @author Georg Fischer
 */
public class A141253 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A141253() {
    super(1, "[[0],[0, 6,-10, 4],[0,-9, 16,-5],[3,-1,-3, 1]]", "[1, 2, 6]", 0);
  }
}
