package irvine.oeis.a132;
// Generated by gen_seq4.pl hologfm/hologf at 2022-12-01 18:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A132374 Expansion of c(7*x^2)/(1 - x*c(7*x^2)), where c(x) is the g.f. of A000108.
 * @author Georg Fischer
 */
public class A132374 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A132374() {
    // o.g.f. 1/14*(1-(-28*x^2+1)^(1/2))/x^2/(1-1/14/x*(1-(-28*x^2+1)^(1/2)))
    // recurrence -(n+1)*u(n)-(-8*n-8)*u(n-1)-(-28*n+56)*u(n-2)-(224*n-448)*u(n-3) = 0
    super(0, "[[0],[448,-224],[-56, 28],[8, 8],[-1,-1]]", "[1, 1, 8, 15]", 0);
  }
}
