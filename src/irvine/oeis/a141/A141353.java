package irvine.oeis.a141;
// manually hologf4/hologf at 2022-11-10 10:21

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A141353 a(n) = Catalan(n) + 2^n - 0^n.
 * @author Georg Fischer
 */
public class A141353 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A141353() {
    // o.g.f. 1/2*(1-(1-4*x)^(1/2))/x+2*x/(-2*x+1)
    // recurrence -(n-3)*(n+1)*u(n)-(-6*(n-2)^2-6*n+18)*u(n-1)-4*(2*n-3)*(n-2)*u(n-2) = 0
    super(0, "[[0],[-24,28,-8],[6,-18,6],[3,2,-1]]", "[1,3,6,13]", 0);
  }
}
