package irvine.oeis.a067;

import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067081.
 * @author Sean A. Irvine
 */
public class A067150 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> seen = new HashSet<>();
    for (long k = 1; k < mN; ++k) {
      long f0 = 1;
      long f1 = k;
      while (f1 <= mN) {
        if (f1 == mN) {
          seen.add(f0);
        }
        final long t = LongUtils.numbralMultiply(3, f1) + f0;
        f0 = f1;
        f1 = t;
      }
    }
    return Z.valueOf(seen.size());
  }
}
