package irvine.oeis.a038;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006125;

/**
 * A038097 Number of rooted connected graphs on n labeled nodes where the root has degree 3.
 * @author Sean A. Irvine
 */
public class A038097 extends A038096 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Sequence mCSeq = new A006125();
  private final Polynomial<Q> mC = RING.create(Arrays.asList(new Q(mCSeq.next()), new Q(mCSeq.next()), new Q(mCSeq.next(), Z.TWO), new Q(mCSeq.next(), Z.SIX)));
  private final Polynomial<Q> mB = RING.empty();
  private Z mF = Z.SIX;
  private int mN = 3;
  {
    mB.add(Q.ZERO);
    mB.add(Q.ZERO);
    mB.add(Q.ZERO);
    mB.add(Q.ZERO);
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mC.add(new Q(mCSeq.next(), mF));
    mB.add(new Q(super.next(), mF));
    return RING.coeff(mB, mC, mN).multiply(mF).toZ();
  }
}
