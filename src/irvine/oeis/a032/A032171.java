package irvine.oeis.a032;

import irvine.math.Mobius;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032171 Number of rooted compound windmills (mobiles) of n nodes with no symmetries.
 * @author Sean A. Irvine
 */
public class A032171 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mA = RING.one();
  private int mN = -1;

  static Polynomial<Q> chk(final Polynomial<Q> p, final int n) {
    final Polynomial<Q> s = RING.series(RING.one(), RING.subtract(RING.one(), p), n);
    Polynomial<Q> sum = RING.zero();
    for (int d = 1; d <= n; ++d) {
      final int m = Mobius.mobius(d);
      if (m != 0) {
        final Polynomial<Q> t = RING.log(s.substitutePower(d, n), n);
        sum = RING.signedAdd(m == 1, sum, RING.divide(t, new Q(d)));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    mA = RING.add(RING.one(), chk(mA.shift(1), ++mN));
    return mA.coeff(mN).toZ();
  }
}
