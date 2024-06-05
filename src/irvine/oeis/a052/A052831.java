package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052831 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052831 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mS = RING.x();

  @Override
  public Z next() {
    if (++mN > 1) {
      Polynomial<Q> b = RING.zero();
      for (int k = 1; k <= mN; ++k) {
        b = RING.signedAdd((k & 1) == 1, b, RING.divide(mS.substitutePower(k, mN), new Q(k)));
      }
      b = RING.exp(b, mN);
      final Polynomial<Q> c = b.shift(1);
      mS = RING.zero();
      for (int k = 1; k <= mN; ++k) {
        final Polynomial<Q> log = RING.log(RING.series(RING.one(), RING.subtract(RING.one(), c.substitutePower(k, mN)), mN), mN);
        mS = RING.add(mS, RING.multiply(log, new Q(Functions.PHI.l(k), k)));
      }
    }
    return mS.coeff(mN).toZ();
  }
}

