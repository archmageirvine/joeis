package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008482 Coefficients in expansion of (x-1)*(1+x)^(n-1), n &gt; 0.
 * @author Sean A. Irvine
 */
public class A008482 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n == 0 || k < 0 || k > n) {
      return Z.ZERO;
    }
    if (n == 1) {
      return k == 1 ? Z.ONE : Z.NEG_ONE;
    }
    return get(n - 1, k - 1).add(get(n - 1, k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
