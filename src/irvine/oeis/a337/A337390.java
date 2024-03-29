package irvine.oeis.a337;
// Generated by gen_seq4.pl hologfm/hologf at 2022-12-01 18:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A337390 Expansion of sqrt((1-2*x+sqrt(1-12*x+4*x^2)) / (2 * (1-12*x+4*x^2))).
 * @author Georg Fischer
 */
public class A337390 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A337390() {
    // o.g.f. ((1-2*x+(4*x^2-12*x+1)^(1/2))/(8*x^2-24*x+2))^(1/2)
    // recurrence -(4*n-5)*(2*n-1)*n*u(n)+4*(4*n-3)*(6*(n-2)^2+15*n-22)*u(n-1)-4*(4*n-1)*(2*n-3)*(n-1)*u(n-2) = 0
    super(0, "[[0],[12,-68, 88,-32],[-24, 140,-216, 96],[0,-5, 14,-8]]", "[1, 4, 34]", 0);
  }
}
