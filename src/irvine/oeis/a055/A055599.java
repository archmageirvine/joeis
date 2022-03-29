package irvine.oeis.a055;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055599 Triangle T(n,k)r read by rows, giving the number of n X n binary matrices with no zero rows or columns and with k=0..n^2 ones.
 * @author Sean A. Irvine
 */
public class A055599 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(1, 1);
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Z> mA = RING.zero();

  @Override
  public Z next() {
    if (++mM > mA.degree()) {
      ++mN;
      mM = 0;
      mA = RING.zero();
      for (int k = 0; k <= mN; ++k) {
        mA = RING.signedAdd(((mN - k) & 1) == 0, mA, RING.multiply(RING.pow(RING.subtract(RING.pow(C1, k), RING.one()), mN), Binomial.binomial(mN, k)));
      }
    }
    return mA.coeff(mM);
  }
}
