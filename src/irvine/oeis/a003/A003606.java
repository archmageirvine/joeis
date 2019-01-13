package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.math.MemoryFunction1;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

import java.io.Serializable;

/**
 * A003606.
 * @author Sean A. Irvine
 */
public class A003606 extends MemorySequence {

  private static class GFunction extends MemoryFunction1<Z> implements Serializable {
    @Override
    protected Z compute(final int n) {
      Z s = Z.ZERO;
      for (final Z dd : Cheetah.factor(n).divisors()) {
        final int d = dd.intValue();
        s = s.add(Cheetah.factor(n / d).sigma().multiply(IntegerPartition.partitions(d).multiply(d)));
      }
      return s;
    }
  }

  private final GFunction mG = new GFunction();

  {
    add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z s = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      s = s.add(get(k).multiply(mG.get(n - k)));
    }
    return s.divide(n);
  }
}
