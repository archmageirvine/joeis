package irvine.oeis.a054;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054242 Triangle read by rows: row n (n&gt;=0) gives the number of partitions of (n,0), (n-1,1), (n-2,2), ..., (0,n) respectively into sums of distinct pairs.
 * @author Sean A. Irvine
 */
public class A054242 implements Sequence {

  private static final PolynomialRing<Z> RING_Y = new PolynomialRing<>(Integers.SINGLETON);
  private static final PolynomialRing<Polynomial<Z>> RING_X = new PolynomialRing<>(RING_Y);
  private Polynomial<Polynomial<Z>> mA = RING_X.one();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      // Recompute GF limited to degree n
      mA = RING_X.one();
      for (int k = 0; k <= mN; ++k) {
        for (int j = 0; j <= mN; ++j) {
          mA = RING_X.multiply(mA, RING_X.onePlusXToTheN(RING_Y.monomial(Z.ONE, j), k), mN);
        }
      }
    }
    return mA.coeff(mN - mM).coeff(mM).divide2();
  }
}

