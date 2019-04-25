package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008302 Triangle of Mahonian numbers <code>T(n,k)</code>: coefficients in expansion of <code>Product_{i=0..n-1} (1 + x + ... + x^i),</code> where k ranges from 0 to A000217(n-1). Also enumerates permutations by their major index.
 * @author Sean A. Irvine
 */
public class A008302 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n == 1) {
      return k == 1 ? Z.ONE : Z.ZERO;
    }
    if (k < 0) {
      return Z.ZERO;
    }
    return get(n, k - 1).add(get(n - 1, k)).subtract(get(n - 1, k - n));
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2) {
      ++mN;
      mM = 0;
      return Z.ONE;
    }
    return get(mN, mM);
  }
}
