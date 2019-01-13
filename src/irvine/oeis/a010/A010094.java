package irvine.oeis.a010;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010094.
 * @author Sean A. Irvine
 */
public class A010094 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    return get(n, k - 1).add(get(n - 1, n - k));
  }

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return get(mN, mM);
  }
}
