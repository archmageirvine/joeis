package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.LongDynamicLongArray;

/**
 * A063740 Number of integers k such that cototient(k) = n.
 * @author Sean A. Irvine
 */
public class A063740 extends Sequence2 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = 1;

  @Override
  public Z next() {
    long s = mN * mN;
    ++mN;
    while (++s <= mN * mN) {
      final long cophi = s - Functions.PHI.l(s);
      if (cophi > 1) {
        mA.increment(cophi);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}

