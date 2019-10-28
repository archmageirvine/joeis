package irvine.oeis.a027;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027345 Triangular array T given by rows: <code>T(n,k) =</code> number of partitions of n into distinct odd parts, the least being k.
 * @author Sean A. Irvine
 */
public class A027345 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mM = 0;

  protected Z distinctOddPartsMinimum(final int n, final int leastPart) {
    if ((leastPart & 1) == 0) {
      return Z.ZERO; // not odd!
    }
    if (n == leastPart) {
      return Z.ONE;
    }
    if (leastPart > n) {
      return Z.ZERO;
    }
    Polynomial<Z> prod = RING.one();
    for (int k = leastPart + 2; k <= n - leastPart; k += 2) {
      prod = RING.multiply(prod, RING.onePlusXToTheN(k), n - leastPart);
    }
    prod = RING.subtract(prod, RING.one());
    return prod.coeff(n - leastPart);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return distinctOddPartsMinimum(mN, mM);
  }
}
