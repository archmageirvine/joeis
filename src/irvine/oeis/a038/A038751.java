package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A038751 A variant of the recurrence for A001190.
 * @author Sean A. Irvine
 */
public class A038751 extends MemorySequence {

  protected int mN = -1;

  @Override
  protected Z computeNext() {
    if (++mN == 0) {
      return Z.ZERO;
    } else if (mN == 1) {
      return Z.ONE;
    } else if ((mN & 1) == 0) {
      Z s = a(mN / 2).multiply(a(mN / 2).add(1)).divide2();
      for (int k = 1, j = size() - 1; k < mN / 2; ++k, --j) {
        s = s.add(a(k).multiply(a(j)));
      }
      return s;
    } else {
      Z s = Z.ZERO;
      for (int k = 1, j = size() - 1; k < (mN - 1) / 2; ++k, --j) {
        s = s.add(a(k).multiply(a(j)));
      }
      return s;
    }
  }
}
