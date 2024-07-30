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
 * A319797 Number T(n,k) of partitions of n into exactly k positive triangular numbers; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A319797 extends Triangle {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A319797() {
    super(0);
    hasRAM(true);
  }

  private final MemoryFunction1<Integer> mH = new MemoryFunction1<>() {
    @Override
    protected Integer compute(final int n) {
      return n < 1 ? 0 : Predicates.SQUARE.is(8L * n + 1) ? Integer.valueOf(n) : get(n - 1);
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
  protected Z compute(final int n, final int k) {
    return mB.get(n, mH.get(n)).coeff(k);
  }
}
