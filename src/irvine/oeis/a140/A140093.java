package irvine.oeis.a140;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A140093 G.f. satisfies: A(x - x^3) = x^3 - x^9.
 * @author Georg Fischer
 */
public class A140093 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A140093() {
    // Recurrence: 4*(n-2)*(n+2)*(n+1)*a(n)-3*(3*n-4)*(3*n-2)*n*a(n-2) = 0
    super(3, "[[0],[0,-24, 54,-27],[0],[-16,-16, 4, 4]]", "1, 0, 3", 3);
  }
}
