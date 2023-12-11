package irvine.oeis.a029;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A029847 Gessel-Stanley triangle read by rows: triangle of coefficients of polynomials arising in connection with enumeration of intransitive trees by number of nodes and number of right nodes.
 * @author Sean A. Irvine
 */
public class A029847 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 0) {
      return Z.ZERO;
    }
    if (n == 0 && m == 0) {
      return Z.ONE;
    }
    Z sum = get(n - 1, m - 1);
    for (long l = 1; l < n; ++l) {
      for (long s = 1; s <= l; ++s) {
        sum = sum.add(Binomial.binomial(n - 1, l).multiply(s).multiply(get(l, s)).multiply(get(n - l - 1, m - s)));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = mN == 0 ? 0 : 1;
    }
    return get(mN, mM);
  }
}
