package irvine.oeis.a319;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A319394 Number T(n,k) of partitions of n into exactly k positive Fibonacci numbers; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A319394 extends Triangle {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A319394(final int offset) {
    super(offset);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A319394() {
    super(1, 1, -1);
    hasRAM(true);
  }

  private final MemoryFunction1<Integer> mH = new MemoryFunction1<>() {
    @Override
    protected Integer compute(final int n) {
      if (n < 1) {
        return 0;
      }
      final int t = 5 * n * n;
      return Predicates.SQUARE.is(t + 4) || Predicates.SQUARE.is(t - 4) ? Integer.valueOf(n) : get(n - 1);
    }
  };

  private final MemoryFunctionInt2<Polynomial<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int i) {
      if (n == 0 || i == 1) {
        return RING.monomial(Z.ONE, n);
      }
      return RING.add(get(n, mH.get(i - 1)), RING.shift(get(n - i, mH.get(Math.min(i, n - i))), 1));
    }
  };

  @Override
  public Z compute(final int n, final int k) {
    return mB.get(n, mH.get(n)).coeff(k);
  }
}
