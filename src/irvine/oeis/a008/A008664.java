package irvine.oeis.a008;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004013;
import irvine.oeis.a004.A004015;

/**
 * A008664 Theta series of direct sum of f.c.c. and b.c.c. lattices.
 * @author Sean A. Irvine
 */
public class A008664 extends A004013 {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(IntegerField.SINGLETON);
  private final QPolynomial<Z> mBcc = QPolynomial.create(Collections.emptyList());
  private final QPolynomial<Z> mFcc = QPolynomial.create(Collections.emptyList());
  private final Sequence mFccSeq = new A004015();
  private Q mN = Q.HALF.negate();

  @Override
  public Z next() {
    mN = mN.add(Q.HALF);
    if (mN.isInteger() && mN.toZ().isEven()) {
      mFcc.put(mN, mFccSeq.next());
    }
    mBcc.put(mN, super.next());
    return RING.multiply(mBcc, mFcc, mN).coeff(mN);
  }
}
