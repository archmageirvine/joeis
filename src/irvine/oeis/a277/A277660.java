package irvine.oeis.a277;
// manually hologf4/hologf at 2022-11-09 13:39

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A277660 2nd-order coefficients of the 1/N-expansion of traces of negative powers of complex Wishart matrices with parameter c=2.
 * @author Georg Fischer
 */
public class A277660 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A277660() {
    // o.g.f. 2*x^2/(x^2-6*x+1)^(5/2)
    // recurrence -(n-3)*u(n-1)-n*u(n-3)-(-6*n+9)*u(n-2) = 0
    super(0, "[[0],[-1,-1],[-3, 6],[2,-1]]", "[0, 0, 2]", 0);
  }
}
