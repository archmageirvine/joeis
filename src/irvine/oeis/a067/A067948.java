package irvine.oeis.a067;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067948 Triangle of labeled rooted trees according to the number of increasing edges.
 * @author Sean A. Irvine
 */
public class A067948 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mGf = RING.zero();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mGf.degree()) {
      ++mN;
      mM = 0;
      mGf = RING.one();
      for (int k = 1; k < mN; ++k) {
        mGf = RING.multiply(mGf, Polynomial.create(mN - k, k), mN);
      }
    }
    return mGf.coeff(mM);
  }
}
