package irvine.oeis.a027;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027436.
 * @author Sean A. Irvine
 */
public class A027436 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Z.ONE;
    }
    Z sum = Binomial.binomial(m, n - m).shiftLeft(2 * (n - m));
    for (int k = m + 1; k < n; ++k) {
      sum = sum.subtract(get(n, k).multiply(get(k, m)));
    }
    return sum.divide2();
  }

  @Override
  public Z next() {
    return get(++mN, 1);
  }
}
