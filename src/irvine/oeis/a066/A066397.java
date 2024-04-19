package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A066397 Reversion of 1 / sqrt(1 - 4*x) (the o.g.f. for the central binomial coefficients A000984) as if it were an e.g.f.
 * @author Sean A. Irvine
 */
public class A066397 extends A000984 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mGf = RING.empty();
  private int mN = 0;
  {
    mGf.add(Q.ZERO);
  }

  @Override
  public Z next() {
    ++mN;
    mGf.add(new Q(super.next(), Functions.FACTORIAL.z(mN)));
    return RING.reversion(mGf, mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
