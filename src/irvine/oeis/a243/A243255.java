package irvine.oeis.a243;
// Generated by gen_seq4.pl hologfm/hologf at 2022-12-01 18:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A243255 Expansion of 1/2 - (1/2)*(sqrt((2*sqrt(-3*x^2 - 2*x + 1) + 3*x - 2)/x)).
 * @author Georg Fischer
 */
public class A243255 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A243255() {
    // o.g.f. 1/2-1/2*((2*(-3*x^2-2*x+1)^(1/2)+3*x-2)/x)^(1/2)
    // recurrence -2*(2*n+1)*(5*n-1)*n*u(n)-(-145*(n-3)^3-1131*(n-3)^2-2786*n+6198)*u(n-1)-3*(n-2)*(50*(n-3)^2+265*n-531)*u(n-2)-63*(5*n+4)*(n-2)*(n-3)*u(n-3) = 0
    super(0, "[[0],[-1512,-630, 1323,-315],[-486, 33, 405,-150],[66,-85,-174, 145],[0, 2,-6,-20]]", "[0, 1, 2, 6, 20]", 0);
  }
}
