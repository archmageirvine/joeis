package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a120.A120348;

/**
 * A003093 Number of planar 2-trees with n nodes.
 * @author Sean A. Irvine
 */
public class A003093 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final A003092 mP = new A003092();
  private final A120348 mA120348 = new A120348();
  private final List<Q> mT = new ArrayList<>();
  private Z mF = Z.TWO;
  private int mN = 2;

  {
    mT.add(Q.ZERO);
    mT.add(new Q(mA120348.next()));
    mT.add(new Q(mA120348.next(), mF));
    mP.next();
    mP.next();
  }


  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN);
    mT.add(new Q(mA120348.next(), mF));
    final Polynomial<Q> t = RING.create(mT);
    final Polynomial<Q> a = RING.subtract(RING.series(RING.one(), RING.subtract(RING.one(), t.substitutePower(2, mN)), mN), RING.one()).shift(2);
    final Polynomial<Q> b = RING.series(RING.one(), RING.pow(RING.subtract(RING.one(), t.substitutePower(3, mN)), 2, mN), mN).shift(3);
    final Q ct = a.coeff(mN).divide(2).add(b.coeff(mN).multiply(2).divide(3));
    final Q cp = new Q(mP.next(), mF);
    return ct.add(cp).toZ();
  }
}
