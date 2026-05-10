package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005811;

/**
 * A395179 Maximum number of runs in the binary expansion of integers obtained by changing a single 0-bit to 1 in the binary representation of n considering bits up to and including the first leading 0.
 * @author Sean A. Irvine
 */
public class A395179 extends Sequence1 {

  private final DirectSequence mGray = new A005811();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    final long end = mN << 1;
    for (long k = 1; k <= end; k <<= 1) {
      if ((mN & k) == 0) {
        max = max.max(mGray.a(mN + k));
      }
    }
    return max;
  }
}
