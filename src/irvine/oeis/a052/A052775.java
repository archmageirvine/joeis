package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052869 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052775 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mS = RING.one();

  @Override
  public Z next() {
    if (++mN >= 1) {
      final Polynomial<Q> b = RING.pow(mS, 4, mN).shift(1);
      mS = RING.zero();
      for (int k = 1; k <= mN; ++k) {
        mS = RING.signedAdd((k & 1) == 1, mS, RING.divide(b.substitutePower(k, mN), new Q(k)));
      }
      mS = RING.exp(mS, mN);
    }
    return mS.coeff(mN).toZ();
  }
}

