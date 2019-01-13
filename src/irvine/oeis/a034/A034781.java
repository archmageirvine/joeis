package irvine.oeis.a034;

import irvine.math.MemoryFunction3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034781.
 * @author Sean A. Irvine
 */
public class A034781 extends MemoryFunction3<Integer, Z> implements Sequence {

  // After Alois P. Heinz

  @Override
  protected Z compute(final Integer n, final Integer i, final Integer k) {
    if (n == 0) {
      return Z.ONE;
    }
    if (i < 1 || k < 1) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    for (int j = 0; j <= n / i; ++j) {
      s = s.add(Binomial.binomial(get(i - 1, i - 1, k - 1).longValueExact() + j - 1, j).multiply(get(n - i * j, i - 1, k)));
    }
    return s;
  }

  protected Z t(final int n, final int d) {
    return get(n - 1, n - 1, d).subtract(get(n - 1, n - 1, d - 1));
  }

  private int mN = 1;
  private int mD = 0;

  @Override
  public Z next() {
    if (++mD >= mN) {
      ++mN;
      mD = 1;
    }
    return t(mN, mD);
  }

}
