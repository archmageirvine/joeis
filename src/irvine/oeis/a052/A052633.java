package irvine.oeis.a052;
// manually 2021-06-23

import irvine.oeis.HolonomicRecurrence;

/**
 * A052633 E.g.f. x^2*(1+x-x^2)/(1-x)^2.
 * Recurrence: a(n) = a(n-1)*n^2/(n-1)
 * @author Georg Fischer
 */
public class A052633 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052633() {
    super(0, "[[0],[0, 0, 1],[1,-1]]", "[0, 0, 2, 18]");
  }
}
