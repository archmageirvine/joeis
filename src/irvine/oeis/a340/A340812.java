package irvine.oeis.a340;

import irvine.math.MemoryFunction2;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A340812 Array read by antidiagonals: T(n,k) is the number of unlabeled oriented k-gonal 2-trees with n oriented polygons, n &gt;= 0, k &gt;= 2.
 * @author Sean A. Irvine
 */
public class A340812 extends MemoryFunction2<Integer, Z> implements Sequence {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private int mM = 0;
  protected final MemoryFunction2<Integer, Z> mB = new A340814();

  protected Polynomial<Z> b(final int n, final int k) {
    final Polynomial<Z> b = RING.empty();
    for (int j = 0; j <= n; ++j) {
      b.add(mB.get(j, k - 2));
    }
    return b;
  }

  protected Polynomial<Z> c(final Polynomial<Z> p, final int n, final int k) {
    return RING.add(RING.subtract(p, RING.pow(p, k, n).shift(1)),
      RING.divide(RING.sumdiv(k,
          d -> RING.multiply(RING.pow(p.substitutePower(d, n), k / d, n), Euler.phi(Z.valueOf(d)))),
        Z.valueOf(k)).shift(1));
  }

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (n <= 2) {
      return Z.ONE;
    }
    return c(b(n, k), n, k).coeff(n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM + 2);
  }
}

