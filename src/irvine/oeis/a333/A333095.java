package irvine.oeis.a333;
// manually hygeom at 2022-08-06 17:54

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A333095 a(n) = the n-th order Taylor polynomial (centered at 0) of c(x)^(3*n) evaluated at x = 1, where c(x) = (1 - sqrt(1 - 4*x))/(2*x) is the o.g.f. of the sequence of Catalan numbers A000108.
 * @author Georg Fischer
 */
public class A333095 extends HypergeometricSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A333095() {
    super(0, 3, 2, "[[1],[0,-4],[0,-1],[1/2,-5/2],[1,-5/2],[1/4]]");
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      super.next();
      return Z.ONE;
    } else {
      return super.nextQ().multiply(Binomial.binomial(5L * mN - 1, mN)).multiply(new Q(3, 4)).num();
    }
  }
}
