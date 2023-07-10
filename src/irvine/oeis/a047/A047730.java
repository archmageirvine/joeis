package irvine.oeis.a047;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Euler;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A047730 Number of score sequences in tournament with n players, when 4 points are awarded in each game.
 * @author Sean A. Irvine
 */
public class A047730 extends AbstractSequence {

  // After Qihao Ye

  private final int mJ;
  private int mN;

  protected A047730(final int offset, final int points) {
    super(offset);
    mN = offset - 1;
    mJ = points;
  }

  protected A047730(final int points) {
    this(1, points);
  }

  /** Construct the sequence. */
  public A047730() {
    this(4);
  }

  private Z g(final long j, final long k) {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(k).divisors()) {
      final long d = dd.longValue();
      final Z t = Euler.phi(k / d).multiply(Binomial.binomial((j + 1L) * d, d));
      sum = sum.signedAdd((((k - d) * j) & 1) == 0, t);
    }
    return sum.divide((j + 1) * k);
  }

  private final MemoryFunctionInt2<Z> mF = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int j, final int n) {
      return n == 0 ? Z.ONE : Integers.SINGLETON.sum(1, n, k -> g(j, k).multiply(get(j, n - k))).divide(n);
    }
  };

  @Override
  public Z next() {
    return mF.get(mJ, ++mN);
  }
}
