package irvine.oeis.a004;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004070.
 * @author Sean A. Irvine
 */
public class A004070 extends MemoryFunction2<Integer, Z> implements Sequence {

  @Override
  protected Z compute(final Integer n, final Integer k) {
    return n == 0 || k == 0 ? Z.ONE : get(n, k - 1).add(get(n - 1, k - 1));
  }

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN - mM, mM);
  }

}
