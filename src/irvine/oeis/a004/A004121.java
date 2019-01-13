package irvine.oeis.a004;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004121.
 * @author Sean A. Irvine
 */
public class A004121 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final ArrayList<Q> mT = new ArrayList<>();
  {
    mT.add(Q.ONE);
  }
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mT.add(new Q(Z.ONE.shiftLeft(mN * (mN + 1) / 2), mF).negate());
    return RING.coeff(RING.one(), RING.create(mT), mN).multiply(mF).toZ();
  }
}
