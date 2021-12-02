package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052890 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052890 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mS = RING.onePlusXToTheN(1);

  @Override
  public Z next() {
    if (++mN > 1) {
      final Polynomial<Q> c = mS.shift(1);
      Polynomial<Q> b = RING.zero();
      for (int j = 1; j <= mN; ++j) {
        b = RING.add(b, RING.divide(c.substitutePower(j, mN), new Q(j)));
      }
      b = RING.subtract(RING.exp(b, mN), RING.one());
      mS = RING.zero();
      for (int j = 1; j <= mN; ++j) {
        mS = RING.signedAdd((j & 1) == 1, mS, RING.divide(b.substitutePower(j, mN), new Q(j)));
      }
      mS = RING.exp(mS, mN);
    }
    return mS.coeff(mN).toZ();
  }
}

