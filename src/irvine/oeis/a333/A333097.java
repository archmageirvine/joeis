package irvine.oeis.a333;
// manually hygeom at 2022-08-06 17:54

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.oeis.HypergeometricSequence;

/**
 * A333097 a(n) = the n-th order Taylor polynomial (centered at 0) of c(x)^(5*n) evaluated at x = 1, where c(x) = (1 - sqrt(1 - 4*x))/(2*x) is the o.g.f. of the sequence of Catalan numbers A000108.
 * @author Georg Fischer
 */
public class A333097 extends HypergeometricSequence {

  /** Construct the sequence. */
  public A333097() {
    super(0, 3, 2, "[[1],[0,-6],[0,-1],[1/2,-7/2],[1,-7/2],[1/4]]", "1", (n, v) -> v.multiply(Binomial.binomial(7L * n - 1, n)).multiply(new Q(5, 6)).num());
  }
}
