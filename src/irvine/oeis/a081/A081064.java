package irvine.oeis.a081;

import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081064 Irregular array, read by rows: T(n,k) is the number of labeled acyclic digraphs with n nodes and k arcs (n &gt;= 0, 0 &lt;= k &lt;= n*(n-1)/2).
 * @author Sean A. Irvine
 */
public class A081064 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 1);
  private int mN = 0;
  private int mM = -1;
  private final MemoryFunction1<Polynomial<Z>> mGf = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      if (n == 0) {
        return RING.one();
      }
      Polynomial<Z> res = RING.zero();
      for (int m = 1; m <= n; ++m) {
        res = RING.signedAdd((m & 1) == 1, res, RING.multiply(RING.multiply(get(n - m), Binomial.binomial(n, m)), RING.pow(C, (long) m * (n - m))));
      }
      return res;
    }
  };

  @Override
  public Z next() {
    if (++mM > mGf.get(mN).degree()) {
      ++mN;
      mM = 0;
    }
    return mGf.get(mN).coeff(mM);
  }
}
