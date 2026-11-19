package irvine.oeis.a361;

import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003030;
import irvine.oeis.triangle.Triangle;

/**
 * A361455 Triangle read by rows: T(n,k) is the number of simple digraphs on labeled n nodes with k strongly connected components.
 * @author Gregory Morse
 */
public class A361455 extends Triangle {
  protected static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final DirectSequence mStrong = DirectSequence.create(new A003030());

  // Signed sets of source components, with their vertices isolated from each other.
  private final MemoryFunction1<Polynomial<Z>> mSources = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      if (n == 0) {
        return RING.one();
      }
      Polynomial<Z> sum = RING.zero();
      for (int k = 1; k <= n; ++k) {
        final Polynomial<Z> term = RING.multiply(component(k), get(n - k));
        sum = RING.subtract(sum, RING.multiply(term, Binomial.binomial(n - 1, k - 1)));
      }
      return sum;
    }
  };

  private final MemoryFunction1<Polynomial<Z>> mGraphs = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      if (n == 0) {
        return RING.one();
      }
      Polynomial<Z> sum = RING.zero();
      for (int k = 1; k <= n; ++k) {
        final Z choices = Binomial.binomial(n, k).shiftLeft((long) k * (n - k));
        sum = RING.subtract(sum, RING.multiply(RING.multiply(mSources.get(k), get(n - k)), choices));
      }
      return sum;
    }
  };

  protected final Z strong(final int n) {
    return mStrong.a(n);
  }

  protected final Polynomial<Z> sourceSets(final int n) {
    return mSources.get(n);
  }

  protected Polynomial<Z> component(final int n) {
    return RING.monomial(strong(n), 1);
  }

  protected final Polynomial<Z> row(final int n) {
    return mGraphs.get(n);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return row(n).coeff(k);
  }
}
