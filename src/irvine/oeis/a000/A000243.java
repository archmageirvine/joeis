package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000243.
 * @author Sean A. Irvine
 */
public class A000243 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;
  private Polynomial<Z> mNum = RING.zero();
  private Polynomial<Z> mDen = RING.one();
  private final A000081 mSeq = new A000081();
  {
    mSeq.next();
  }

  @Override
  public Z next() {
    do {
      ++mN;
      final Polynomial<Z> term = RING.monomial(mSeq.next(), mN);
      mNum = RING.add(mNum, term);
      mDen = RING.subtract(mDen, term);
    } while (mN < 2);
    return RING.coeff(RING.pow(mNum, 2, mN), mDen, mN);
  }
}

