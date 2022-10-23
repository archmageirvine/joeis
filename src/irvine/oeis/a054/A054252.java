package irvine.oeis.a054;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054252 Triangle T(n,k) of n X n binary matrices with k=0..n^2 ones under action of dihedral group of the square D_4.
 * @author Sean A. Irvine
 */
public class A054252 extends Sequence0 {

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private static final Q ONE_EIGHTH = new Q(1, 8);
  private Polynomial<Q> mA = RING.one();
  private long mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mA.degree()) {
      CycleIndex ci = new CycleIndex();
      if ((++mN & 1) == 0) {
        ci.add(MultivariateMonomial.create(1, mN * mN, ONE_EIGHTH));
        ci.add(MultivariateMonomial.create(2, mN * mN / 2, ONE_EIGHTH));
        ci.add(MultivariateMonomial.create(4, mN * mN / 4, Q.ONE_QUARTER));
        ci.add(MultivariateMonomial.create(2, mN * mN / 2, Q.ONE_QUARTER));
        final MultivariateMonomial mm = MultivariateMonomial.create(1, mN, Q.ONE_QUARTER);
        mm.add(2, (mN * mN - mN) / 2);
        ci.add(mm);
      } else {
        ci.add(MultivariateMonomial.create(1, mN * mN - 1, ONE_EIGHTH));
        ci.add(MultivariateMonomial.create(2, (mN * mN - 1) / 2, ONE_EIGHTH));
        ci.add(MultivariateMonomial.create(4, (mN * mN - 1) / 4, Q.ONE_QUARTER));
        ci = ci.multiply(MultivariateMonomial.create(1, 1));
        final MultivariateMonomial mm = MultivariateMonomial.create(1, mN, Q.HALF);
        mm.add(2, mN * (mN - 1) / 2);
        ci.add(mm);
      }
      mA = ci.applyOnePlusXToTheN();
      mM = 0;
    }
    return mA.coeff(mM).toZ();
  }
}
