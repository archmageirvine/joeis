package irvine.oeis.a001;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A001898 Denominators of Bernoulli polynomials B(n)(x).
 * @author Sean A. Irvine
 */
public class A001898 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final BernoulliSequence mB = new BernoulliSequence(0);
  private final ArrayList<Polynomial<Q>> mBPoly = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mBPoly.add(RING.one());
    } else {
      Polynomial<Q> sum = RING.zero();
      for (int t = 1; t <= mN; ++t) {
        final Polynomial<Q> b = RING.multiply(mBPoly.get(mN - t), mB.get(t).multiply(Binomial.binomial(mN, t)));
        sum = RING.signedAdd((t & 1) == 0, sum, b);
      }
      mBPoly.add(RING.shift(RING.multiply(sum, new Q(-1, mN)), 1));
    }
    final Polynomial<Q> p = mBPoly.get(mBPoly.size() - 1);
    Z den = Z.ONE;
    for (int k = 0; k <= p.degree(); ++k) {
      den = den.lcm(p.coeff(k).den());
    }
    return den;
  }
}
