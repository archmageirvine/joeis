package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394053 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A394053 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Z> mP = RING.zero();

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      ++mN;
      int cnt = 0;
      for (final Z d : Jaguar.factor(mN).divisors()) {
        if (d.isOdd()) {
          ++cnt;
        }
      }
      mP = RING.add(mP, RING.monomial(Z.ONE, cnt));
      mM = 1;
    }
    return mP.coeff(mM);
  }
}

