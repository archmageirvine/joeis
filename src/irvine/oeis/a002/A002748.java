package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;
import java.util.ArrayList;
import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.q.Q;
import irvine.math.polynomial.Polynomial;

/**
 * A002748.
 * @author Sean A. Irvine
 */
public class A002748 extends A000203 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private int mN = -1;
  private Z mF = Z.ONE;
  private final ArrayList<Q> mSeq = new ArrayList<>();

  @Override
  public Z next() {
    mSeq.add(new Q(super.next()));
    final Polynomial<Q> egf = RING.series(RING.create(mSeq), RING.exp(RING.x(), ++mN), mN);
    if (mN > 1) {
      mF = mF.multiply(mN);
    }
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
