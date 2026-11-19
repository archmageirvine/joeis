package irvine.oeis.a057;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A057272 Triangle T(n,k) of number of digraphs with a quasi-source on n labeled nodes and with k arcs, k=0,1,..,n*(n-1).
 * @author Gregory Morse
 */
public class A057272 extends A057274 {
  // The recurrence of A049414, with each arc marked by y.
  private static final Polynomial<Q> E = RING_Y.onePlusXToTheN(1);
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Q> mRow;

  private final MemoryFunction1<Polynomial<Q>> mStrong = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Q> compute(final int n) {
      return RING_Y.multiply(strongD(n, n * (n - 1), E).coeff(n), new Q(Functions.FACTORIAL.z(n)));
    }
  };

  private final MemoryFunctionInt2<Polynomial<Q>> mLambda = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Q> compute(final int i, final int j) {
      return lambda(i, j, E, j * (i + j - 1)).get(j);
    }
  };

  private static Polynomial<Q> choices(final int n, final int k, final long arcs) {
    return RING_Y.multiply(RING_Y.pow(E, arcs), new Q(Binomial.binomial(n, k)));
  }

  private final MemoryFunctionInt3<Polynomial<Q>> mExtension = new MemoryFunctionInt3<>() {
    @Override
    protected Polynomial<Q> compute(final int i, final int j, final int k) {
      Polynomial<Q> sum = RING_Y.multiply(mLambda.get(i, k), RING_Y.pow(E, (long) j * k));
      for (int s = 0; s < k; ++s) {
        final Polynomial<Q> term = RING_Y.multiply(mLambda.get(i + s, k - s), get(i, j, s));
        sum = RING_Y.subtract(sum, RING_Y.multiply(term, new Q(Binomial.binomial(k, s))));
      }
      return sum;
    }
  };

  private Polynomial<Q> lambdaBar(final int i, final int j, final int k) {
    final Polynomial<Q> cross = RING_Y.pow(E, (long) i * j);
    return k == 0 ? RING_Y.subtract(cross, RING_Y.one()) : RING_Y.multiply(cross, mExtension.get(i, j, k));
  }

  private final MemoryFunctionInt2<Polynomial<Q>> mAlpha = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Q> compute(final int n, final int i) {
      Polynomial<Q> sum = mLambda.get(i, n - i);
      for (int j = 1; j <= n - i; ++j) {
        for (int k = 0; k <= n - i - j; ++k) {
          final Polynomial<Q> term = RING_Y.multiply(lambdaBar(j, i, n - i - j - k), get(j + k, j));
          final Polynomial<Q> c = RING_Y.multiply(choices(n - i - j, k, (long) k * (n - j - k)), new Q(Binomial.binomial(n - i, j)));
          sum = RING_Y.subtract(sum, RING_Y.multiply(term, c));
        }
      }
      return RING_Y.multiply(sum, mStrong.get(i));
    }
  };

  private Polynomial<Q> row(final int n) {
    Polynomial<Q> sum = RING_Y.zero();
    for (int i = 1; i <= n; ++i) {
      for (int j = 0; j <= n - i; ++j) {
        final Polynomial<Q> term = RING_Y.multiply(mLambda.get(i, n - i - j), mAlpha.get(i + j, i));
        final Polynomial<Q> c = RING_Y.multiply(choices(n - i, j, (long) j * (n - i - j)), new Q(Binomial.binomial(n, i)));
        sum = RING_Y.add(sum, RING_Y.multiply(term, c));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1)) {
      mRow = row(++mN);
      mM = 0;
    }
    return mRow.coeff(mM).toZ();
  }
}
