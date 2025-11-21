package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390606 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A390606 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;

  private final MemoryFunction1<Long> mB = new MemoryFunction1<>() {
    @Override
    protected Long compute(final int n) {
      final FactorSequence fs = Jaguar.factor(n);
      long d = 1;
      for (final Z p : fs.toZArray()) {
        d *= fs.getExponent(p) + 1;
      }
      return d - 1;
    }
  };

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    long a = 0;
    for (final Z p : fs.toZArray()) {
      long m = mN * fs.getExponent(p);
      for (int k = 2; ; ++k) {
        final long b = mB.get(k);
        if (b * k < m - 1) {
          a += b;
          m -= k * b;
        } else {
          a += m / k;
          break;
        }
      }
    }
    return Z.valueOf(a);
  }
}
