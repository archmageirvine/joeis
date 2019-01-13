package irvine.oeis.a005;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

/**
 * A005753.
 * @author Sean A. Irvine
 */
public class A005753 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private final LongDynamicArray<Z> mA = new LongDynamicArray<>();
  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n == 0) {
      return Z.ONE;
    }
    if (k < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    final Z m = mA.get(k).multiply2();
    for (long j = 0; j <= n / k; ++j) {
      sum = sum.add(Binomial.binomial(m, Z.valueOf(j)).multiply(get(n - k * j, k - 1)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.set(mN + 1, Z.ONE);
      return Z.ONE;
    }
    final Z z = get(mN, mN);
    mA.set(mN + 1, z);
    return z;
  }

}
