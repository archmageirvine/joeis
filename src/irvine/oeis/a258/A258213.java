package irvine.oeis.a258;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A258213 Number of permutations of {1, 2, 3,...,n} such that no even numbers are adjacent.
 * @author Georg Fischer
 */
public class A258213 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A258213() {
    // (4*(n-2)^2+24*n-80)*a(n)+(16*n+24)*a(n-1)-(n+2)*n*((n-2)^2+8*n-17)*a(n-2) = 0
    super(0, "[[0],[0, 26, 5,-6,-1],[24, 16],[-64, 8, 4]]", "1, 1", 0);
  }
}
