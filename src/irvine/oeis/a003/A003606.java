package irvine.oeis.a003;

import java.io.Serializable;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A003606 a(n) = number of types of conjugacy classes in GL(n,q) (this is independent of q).
 * @author Sean A. Irvine
 */
public class A003606 extends MemorySequence {

  private static class GFunction extends MemoryFunction1<Z> implements Serializable {
    @Override
    protected Z compute(final int n) {
      Z s = Z.ZERO;
      for (final Z dd : Jaguar.factor(n).divisors()) {
        final int d = dd.intValue();
        s = s.add(Functions.SIGMA1.z(n / d).multiply(Functions.PARTITIONS.z(d).multiply(d)));
      }
      return s;
    }
  }

  private final GFunction mG = new GFunction();

  {
    setOffset(1);
    add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z s = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      s = s.add(a(k).multiply(mG.get(n - k)));
    }
    return s.divide(n);
  }
}
