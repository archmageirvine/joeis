package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a004.A004111;

/**
 * A052817 Cycles of rooted trees t where for each t all subtrees at root are distinct. n is total number of nodes.
 * @author Sean A. Irvine
 */
public class A052817 extends A004111 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mA = RING.empty();

  @Override
  public Z next() {
    ++mN;
    mA.add(new Q(super.next()));
    Polynomial<Q> s = RING.zero();
    for (int k = 1; k <= mN; ++k) {
      final Polynomial<Q> log = RING.log(RING.series(RING.one(), RING.subtract(RING.one(), mA.substitutePower(k, mN)), mN), mN);
      s = RING.add(s, RING.multiply(log, new Q(Euler.phiAsLong(k), k)));
    }
    return s.coeff(mN).toZ();
  }
}

