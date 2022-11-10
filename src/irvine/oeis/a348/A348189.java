package irvine.oeis.a348;
// manually hologf4/hologf at 2022-11-09 13:39

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A348189 Pseudo-involutory Riordan companion of 1 + 2*x*M(x), where M(x) is the g.f. of A001006.
 * @author Georg Fischer
 */
public class A348189 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A348189() {
    // o.g.f. (1-(-3*x^2-2*x+1)^(1/2))/x/(2+x-(-3*x^2-2*x+1)^(1/2))
    // recurrence -(3*n+3)*u(n)-6*u(n-1)-(-17*n+31)*u(n-2)-(-26*n+54)*u(n-3)-(-12*n+36)*u(n-4) = 0
    super(1, "[[0],[-36, 12],[-54, 26],[-31, 17],[-6],[-3,-3]]", "[1, 0, 0, 2]", 1);
  }
}
