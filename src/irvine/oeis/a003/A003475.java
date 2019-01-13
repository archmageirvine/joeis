package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A003475.
 * @author Sean A. Irvine
 */
public class A003475 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;
  private final ArrayList<Polynomial<Z>> mP = new ArrayList<>();
  private Polynomial<Z> mGf = null;
  private int mM = 0;

  private Polynomial<Z> p(final int n) {
    while (n >= mP.size()) {
      final int m = mP.size();
      if (m == 0) {
        mP.add(RING.one());
      } else {
        mP.add(RING.multiply(mP.get(m - 1), RING.oneMinusXToTheN(2 * m - 1)));
      }
    }
    return mP.get(n);
  }

  @Override
  public Z next() {
    ++mN;
    if (mM * mM <= mN) {
      ++mM;
      mGf = RING.zero();
      final int l = mM * mM;
      for (int k = 1; k <= mM; ++k) {
        mGf = RING.signedAdd((k & 1) == 0, mGf, RING.series(RING.monomial(Z.ONE, k * k), p(k), l));
      }
    }
    return mGf.coeff(mN).negate();
  }
}

