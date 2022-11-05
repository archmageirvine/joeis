package irvine.oeis.a179;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A179533 Expansion of (1/(1-x-2x^2))*c(x/(1-x-2x^2)), c(x) the g.f. of A000108.
 * @author Georg Fischer
 */
public class A179533 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A179533() {
    // (n+1)*u(n)+(-6*n+2)*u(n-1)+(n-1)*u(n-2)+(12*n-20)*u(n-3)+(4*n-12)*u(n-4) = 0
    super(0, "[[0],[-12,4],[-20,12],[-1,1],[2,-6],[1,1]]", "1,2,7", 0);
  }
}
