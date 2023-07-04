package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A039621 Triangle of Lehmer-Comtet numbers of 2nd kind.
 * @author Sean A. Irvine
 */
public class A039621 extends MemoryFunctionInt3Sequence<Z> {

  // After Vladimir Kruchinin

  @Override
  protected Z compute(final int n, final int k, final int m) {
    if (k < 0 || n < 0) {
      return Z.ZERO;
    }
    if (k == 0) {
      return Z.ONE;
    }
    return get(n, k - 1, m).multiply(m).add(get(n - 1, k, m + 1));
  }

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final int k = mN - mM;
    final Z t = get(mM, k, k);
    return (k & 1) == 0 ? t : t.negate();
  }
}
