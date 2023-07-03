package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.MemoryFunction2;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A007561 Number of asymmetric rooted connected graphs where every block is a complete graph.
 * @author Sean A. Irvine
 */
public class A007561 extends MemoryFunction2Sequence<Long, Z> {

  // After Alois P. Heinz

  private long mN = -1;
  private final ArrayList<Z> mA = new ArrayList<>();

  // g function
  @Override
  protected Z compute(final Long n, final Long k) {
    if (n == 0) {
      return Z.ONE;
    }
    if (k < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    final Z ak = mA.get(k.intValue());
    for (long j = 0; j <= n / k; ++j) {
      sum = sum.add(Binomial.binomial(ak, Z.valueOf(j)).multiply(get(n - k * j, k - 1)));
    }
    return sum;
  }

  private final class BFunction extends MemoryFunction2<Long, Z> {

    @Override
    protected Z compute(final Long n, final Long k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (k < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final Z ak = A007561.this.get(k, k);
      for (long j = 0; j <= n / k; ++j) {
        sum = sum.add(Binomial.binomial(ak, Z.valueOf(j)).multiply(get(n - k * j, k - 1)));
      }
      return sum;
    }
  }

  private final BFunction mB = new BFunction();

  @Override
  public Z next() {
    if (++mN < 1) {
      mA.add(Z.ZERO);
    } else {
      mA.add(mB.get(mN - 1, mN - 1));
    }
    return mA.get(mA.size() - 1);
  }
}
