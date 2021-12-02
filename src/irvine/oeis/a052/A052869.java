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
public class A052869 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mS = RING.x();

  @Override
  public Z next() {
    if (++mN > 1) {
      Polynomial<Q> b = RING.zero();
      for (int j = 1; j <= mN; ++j) {
        b = RING.signedAdd((j & 1) == 1, b, RING.divide(mS.substitutePower(j, mN), new Q(j)));
      }
      b = RING.exp(b, mN);
      final Polynomial<Q> c = b.shift(1);
      mS = RING.zero();
      for (int j = 1; j <= mN; ++j) {
        mS = RING.add(mS, RING.divide(c.substitutePower(j, mN), new Q(j)));
      }
      mS = RING.subtract(RING.exp(mS, mN), RING.one());
    }
    return mS.coeff(mN).toZ();
  }
}

