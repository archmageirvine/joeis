package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052814 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052814 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mS = RING.x();

  @Override
  public Z next() {
    if (++mN > 1) {
      Polynomial<Q> c = RING.zero();
      for (int k = 1; k <= mN; ++k) {
        final Polynomial<Q> log = RING.log(RING.series(RING.one(), RING.subtract(RING.one(), mS.substitutePower(k, mN)), mN), mN);
        c = RING.add(c, RING.multiply(log, new Q(Functions.PHI.l((long) k), k)));
      }
      Polynomial<Q> b = RING.zero();
      for (int k = 1; k <= mN; ++k) {
        b = RING.signedAdd((k & 1) == 1, b, RING.divide(c.substitutePower(k, mN), new Q(k)));
      }
      mS = RING.exp(b, mN).shift(1);
    }
    return mS.coeff(mN).toZ();
  }
}

