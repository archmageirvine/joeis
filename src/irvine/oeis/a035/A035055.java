package irvine.oeis.a035;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000055;

/**
 * A035055 Number of forests of different trees.
 * @author Sean A. Irvine
 */
public class A035055 extends MemoryFunction2<Integer, Z> implements Sequence {

  private final MemorySequence mH = MemorySequence.cachedSequence(new A000055());
  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= n / m; ++j) {
      sum = sum.add(Binomial.binomial(mH.a(m), Z.valueOf(j)).multiply(get(n - m * j, m - 1)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
