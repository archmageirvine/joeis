package irvine.oeis.a350;

import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a081.A081064;

/**
 * A350909 Triangle read by rows: T(n,k) is the number of weakly connected acyclic digraphs on n labeled nodes with k arcs.
 * @author Gregory Morse
 */
public class A350909 extends Sequence1 {
  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final A081064 mDags = new A081064();
  private int mN = 1;
  private int mM = -1;
  private final MemoryFunction1<Polynomial<Z>> mGf = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      Polynomial<Z> sum = mDags.row(n);
      for (int k = 1; k < n; ++k) {
        final Polynomial<Z> term = RING.multiply(get(k), mDags.row(n - k));
        sum = RING.subtract(sum, RING.multiply(term, Binomial.binomial(n - 1, k - 1)));
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
