package irvine.oeis.a125;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A125790.
 * @author Sean A. Irvine
 */
public class A125790 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mK = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    return n == 0 || k == 0 ? Z.ONE : get(n, k - 1).add(get(n - 1, 2 * k));
  }

  @Override
  public Z next() {
    if (mK > mN) {
      ++mN;
      mK = 0;
    }
    return get(mN - mK, mK++);
  }

}

