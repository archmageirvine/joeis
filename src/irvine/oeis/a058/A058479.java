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
 * A058479 Total number of interior nodes in all essentially parallel series-parallel networks with n labeled edges, multiple edges allowed.
 * @author Sean A. Irvine
 */
public class A058479 extends A000311 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;
  private final Sequence mUSeq = new PrependSequence(new A006351(), Z.ONE);
  private final Polynomial<Q> mA = RING.empty();
  private final Polynomial<Q> mU = RING.empty();
  private final Polynomial<Q> mUU = RING.empty();
  {
    mUU.add(Q.ZERO);
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA.add(new Q(super.next(), mF));
    mU.add(new Q(mUSeq.next(), mF));
    if (mN > 0) {
      mUU.add(mU.coeff(mN));
    }
    return RING.coeff(RING.multiply(RING.subtract(RING.diff(mA).shift(1), mA), mUU, mN), mU, mN).multiply(mF).toZ();
  }
}

