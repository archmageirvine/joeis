package irvine.oeis.a228;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A228343 The number of ordered trees with bicolored single edges on the boundary.
 * @author Georg Fischer
 */
public class A228343 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A228343() {
    // o.g.f. (Catalan(x)^5*x^2+1)/(1-2*x)
    // -(n+3)*(n-2)*a(n) +6*(n^2-2)*a(n-1) -4*n*(2*n-1)*a(n-2)=0.
    super(0, "[[0],[0, 4,-8],[-12, 0, 6],[6,-1,-1]]", "1, 2, 5, 15", 0);
  }
}
