package irvine.oeis.a084;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A084225 Numerators of successive approximations to zeta(3) = Sum_{k&gt;0} 1/k^3, using Zeilberger's formula with s=3.
 * @author Sean A. Irvine
 */
public class A084225 extends LambdaSequence {

  /** Construct the sequence. */
  public A084225() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(1, 72).multiply(Z.NEG_ONE.pow(k)).multiply(Z.valueOf(5265L * k).add(13878).multiply(k).add(13761).multiply(k).add(6120).multiply(k).add(1040)).divide(Binomial.binomial(3L * k, k).multiply(Binomial.binomial(4L * k, k)).multiply(4 * k + 1).multiply(4 * k + 3).multiply(k + 1).multiply(Z.valueOf(3 * k + 1).square()).multiply(Z.valueOf(3 * k + 2).square()))).num());
  }
}
