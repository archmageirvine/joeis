package irvine.oeis.a030;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A030017.
 * @author Sean A. Irvine
 */
public class A030017 implements Sequence {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mSeq = new A000040();
  private Polynomial<Z> mPoly = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mPoly = RING.add(mPoly, RING.monomial(mSeq.next().negate(), mN));
    }
    return mN == 0 ? Z.ONE : RING.coeff(RING.one(), mPoly, mN);
  }
}
