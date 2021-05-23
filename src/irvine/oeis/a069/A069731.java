package irvine.oeis.a069;

import irvine.oeis.HolonomicRecurrence;

/**
 * A069731 Number of unicursal planar maps with n edges rooted at a vertex of odd valency.
 * D-finite with recurrence: 4*(2*n+1)*a(n-1) - (n+2)*a(n) = 0, a(1) = 1.
 * @author Georg Fischer
 */
public class A069731 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A069731() {
    super(1, "[[0],[4, 8]],[-2,-1]]", "[1, 5]", 0);
  }
}
