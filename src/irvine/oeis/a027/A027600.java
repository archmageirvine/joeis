package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a259.A259799;

/**
 * A027600 Number of partitions of <code>4^n-1</code> into n-th powers.
 * @author Sean A. Irvine
 */
public class A027600 extends A259799 {

  private int mN = 0;

  @Override
  protected Z t(final int n, final long k) {
    return get(Z.valueOf(k).pow(n).subtract(1).longValueExact(), k, (long) n);
  }

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
