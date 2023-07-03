package irvine.oeis.a038;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A038150 Array of numbers used in exotic ternary numeration system, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A038150 extends MemoryFunction2Sequence<Long, Z> {

  private static final CR PHI2 = CR.PHI.multiply(CR.PHI);
  private long mN = 0;
  private long mK = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 1) {
      return CR.PHI.multiply(n - 1).floor().add(1);
    }
    return PHI2.multiply(get(n, m - 1)).floor().add(1);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
    }
    return get(mN - mK + 1, mK);
  }
}
