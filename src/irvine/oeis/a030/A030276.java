package irvine.oeis.a030;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030276 Shifts left under COMPOSE transform.
 * @author Sean A. Irvine
 */
public class A030276 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Z.ONE.shiftLeft(n);
    }
    if (m >= n) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(get(n - m, k)).shiftLeft(n - k));
    }
    return sum.multiply(m).divide(n);
  }

  @Override
  public Z next() {
    return get(++mN, 1);
  }
}
