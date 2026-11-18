package irvine.oeis.a350;

import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A350487 Triangle read by rows: T(n,k) is the number of acyclic digraphs on n labeled nodes with k arcs and a global source, n &gt;= 1, k = 0..n*(n-1)/2.
 * @author Gregory Morse
 */
public class A350487 extends Sequence1 {
  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 1);
  private int mN = 1;
  private int mM = -1;
  private final MemoryFunction1<Polynomial<Z>> mGf = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      if (n == 1) {
        return RING.one();
      }
      Polynomial<Z> sum = RING.zero();
      for (int k = 1; k < n; ++k) {
        final Polynomial<Z> links = RING.subtract(RING.pow(C, n - k), RING.one());
        final Polynomial<Z> term = RING.multiply(get(n - k), RING.pow(links, k));
        sum = RING.signedAdd((k & 1) == 1, sum, RING.multiply(term, Binomial.binomial(n, k)));
      }
      return sum;
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
