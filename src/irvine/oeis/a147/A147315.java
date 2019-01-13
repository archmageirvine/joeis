package irvine.oeis.a147;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A147315.
 * @author Sean A. Irvine
 */
public class A147315 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private Polynomial<Z> mPrev = RING.zero();
  private int mPos = 0;

  @Override
  public Z next() {
    if (++mPos > mPrev.degree()) {
      if (RING.zero().equals(mPrev)) {
        mPrev = RING.x();
      } else {
        final Polynomial<Z> d = RING.diff(mPrev);
        mPrev = RING.add(RING.add(mPrev, d), RING.divide(RING.diff(d), Z.TWO)).shift(1);
        //System.out.println(mPrev);
      }
      mPos = 1;
    }
    return mPrev.coeff(mPos);
  }
}

