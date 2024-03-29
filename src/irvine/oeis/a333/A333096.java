package irvine.oeis.a333;
// Generated by gen_seq4.pl hypergeon at 2023-11-10 15:47

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.oeis.HypergeometricSequence;

/**
 * A333096 a(n) = the n-th order Taylor polynomial (centered at 0) of c(x)^(4*n) evaluated at x = 1, where c(x) = (1 - sqrt(1 - 4*x))/(2*x) is the o.g.f. of the sequence of Catalan numbers A000108.
 * @author Georg Fischer
 */
public class A333096 extends HypergeometricSequence {

  /** Construct the sequence. */
  public A333096() {
    super(0, 3, 2, "[[1],[0,-5],[0,-1],[1/2,-3],[1,-3],[1/4]]", "1", (n, v) -> v.multiply(Binomial.binomial(6L * n - 1, n)).multiply(new Q(4, 5)).num());
  }
}
