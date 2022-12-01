package irvine.oeis.a229;
// manually hologfm/hologf at 2022-12-01 17:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A229463 Expansion of 1/((1-x)^2*(1-26*x)).
 * @author Georg Fischer
 */
public class A229463 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A229463() {
    // o.g.f. 1/(1-x)^2/(1-26*x)
    // recurrence -(-27*n-1)*u(n-1)-(26*n+26)*u(n-2)-n*u(n) = 0
    super(1, "[[0],[-26,-26],[1, 27],[0,-1]]", "[1, 28, 731]", 1);
  }
}
