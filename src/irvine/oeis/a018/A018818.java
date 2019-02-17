package irvine.oeis.a018;

import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018818.
 * @author Sean A. Irvine
 */
public class A018818 extends MemoryFunction3<Integer, Z> implements Sequence {

  private int mN = 0;

  @Override
  protected Z compute(final Integer n, final Integer m, final Integer k) {
    if (k > m) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    return get(n, m, k + 1).add(n % k == 0 ? get(n, m - k, k) : Z.ZERO);
  }

  @Override
  public Z next() {
    return get(++mN, mN, 1);
  }
}
