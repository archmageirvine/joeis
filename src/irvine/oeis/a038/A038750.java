package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A038750 A variant of the recurrence for A001190.
 * @author Sean A. Irvine
 */
public class A038750 extends MemorySequence {

  protected int mN = -1;

  @Override
  protected Z computeNext() {
    if (++mN == 0) {
      return Z.ZERO;
    } else if (mN < 4) {
      return Z.ONE;
    } else if ((mN & 1) == 0) {
      Z s = get(mN / 2).multiply(get(mN / 2).add(1)).divide2();
      for (int k = 1, j = size() - 1; k < mN / 2; ++k, --j) {
        s = s.add(get(k).multiply(get(j)));
      }
      return s;
    } else {
      Z s = Z.ZERO;
      for (int k = 1, j = size() - 1; k < (mN - 1) / 2; ++k, --j) {
        s = s.add(get(k).multiply(get(j)));
      }
      return s;
    }
  }
}
