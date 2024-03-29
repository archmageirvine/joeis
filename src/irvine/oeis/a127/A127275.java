package irvine.oeis.a127;
// Generated by gen_seq4.pl hologfm/hologf at 2022-12-01 18:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A127275 Expansion of (sqrt(1-4x)-x)/(1-4x).
 * @author Georg Fischer
 */
public class A127275 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A127275() {
    // o.g.f. ((1-4*x)^(1/2)-x)/(1-4*x)
    // recurrence -n*u(n)-(-8*n+6)*u(n-1)-(16*n-24)*u(n-2) = 0
    super(0, "[[0],[24,-16],[-6, 8],[0,-1]]", "[1, 1, 2]", 0);
  }
}
