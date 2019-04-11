package irvine.oeis.a013;

import java.util.ArrayList;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a054.A054891;

/**
 * A013953 Expansion of the modular form of level 4 and weight <code>1/2</code>.
 * @author Sean A. Irvine
 */
public class A013953 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X4 = RING.monomial(Z.ONE, 4);
  private final ArrayList<Z> mE6 = new ArrayList<>();
  {
    mE6.add(Z.ONE);
  }
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final FactorSequence fs = Cheetah.factor(mN);
    mE6.add(fs.sigma(5).multiply(-504));
    final Polynomial<Z> e6z4 = RING.create(mE6).substitutePower(4, mN);
    final Polynomial<Z> del12 = RING.pow(RING.eta(X4, mN), 24, mN);
    final Polynomial<Z> kz = A054891.kz(mN);
    final Polynomial<Z> b2 = RING.series(RING.multiply(kz, e6z4, mN), del12, mN);
    final Polynomial<Z> t = RING.multiply(ThetaFunctions.theta3z(mN), Z.valueOf(60));
    return (mN >= 4 ? t.coeff(mN - 4) : Z.ZERO).add(b2.coeff(mN));
  }
}
