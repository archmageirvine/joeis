package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000107.
 * @author Sean A. Irvine
 */
public class A000107 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final A000081 mSeq = new A000081();
  private Polynomial<Z> mPoly = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    // INVERT transform of A000081
    ++mN;
    mPoly = RING.add(mPoly, RING.monomial(mSeq.next().negate(), mN));
    return mN == 0 ? Z.ZERO : RING.coeff(RING.one(), mPoly, mN);
  }

}

