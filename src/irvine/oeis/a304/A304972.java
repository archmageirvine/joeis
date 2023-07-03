package irvine.oeis.a304;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A304972 Triangle read by rows of achiral color patterns (set partitions) for a row or loop of length n. T(n,k) is the number using exactly k colors (sets).
 * @author Sean A. Irvine
 */
public class A304972 extends MemoryFunction2Sequence<Integer, Z> {

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    Z res = n < 2 && n >= 0 && n.equals(k) ? Z.ONE : Z.ZERO;
    if (n > 1) {
      res = res.add(get(n - 2, k).multiply(k).add(get(n - 2, k - 1).add(get(n - 2, k - 2))));
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
