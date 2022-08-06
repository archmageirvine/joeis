package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000311;
import irvine.oeis.a006.A006351;

/**
 * A058478 Total number of interior nodes in all essentially series series-parallel networks with n labeled edges, multiple edges allowed.
 * @author Sean A. Irvine
 */
public class A058478 extends A000311 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;
  private final Sequence mUSeq = new PrependSequence(new A006351(), Z.ONE);
  private final Polynomial<Q> mA = RING.empty();
  private final Polynomial<Q> mU = RING.empty();

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA.add(new Q(super.next(), mF));
    mU.add(new Q(mUSeq.next(), mF));
    return RING.coeff(RING.subtract(RING.diff(mA).shift(1), mA), mU, mN).multiply(mF).toZ();
  }
}

