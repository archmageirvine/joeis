package irvine.oeis.a262;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A262480 Number of trivial c-Wilf equivalence classes in the symmetric group S_n.
 * Recurrence: -(n-3)*a(n) + n*(n-3)*a(n-1) + (n-1)^2*a(n-2) - (n-2)*(n-1)^2*a(n-3) = 0
 * @author Georg Fischer
 */
public class A262480 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A262480() {
    super(0, "[[0],[2,-5,4,-1],[1,-2,1],[0,-3,1],[3,-1]]", "[1,1,1,2,8]", 0);
  }
}
