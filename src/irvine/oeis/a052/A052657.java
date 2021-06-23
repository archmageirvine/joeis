package irvine.oeis.a052;
// manually 2021-06-23

import irvine.oeis.HolonomicRecurrence;

/**
 * A052657 E.g.f. x^2/((1-x)^2*(1+x)).
 * Recurrence: n*(n-1)^2*a(n-2)+n*a(n-1)-(n-2)*a(n)=0.
 * @author Georg Fischer
 */
public class A052657 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052657() {
    super(0, "[[0],[0, 1,-2, 1],[0, 1],[2,-1]]", "[0, 0, 2]");
  }
}
