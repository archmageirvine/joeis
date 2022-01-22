package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054061 Least k for which the integers Floor(k/(m*(m+1))) for m=1,2,...,n are distinct.
 * @author Sean A. Irvine
 */
public class A054061 implements Sequence {

  private long mN = 0;
  private long mK = 0;

  @Override
  public Z next() {
    ++mN;
    final TreeSet<Long> seen = new TreeSet<>();
    while (true) {
      seen.clear();
      ++mK;
      for (long m = 1; m <= mN; ++m) {
        if (!seen.add(mK / (m * (m + 1)))) {
          break;
        }
      }
      if (seen.size() == mN) {
        return Z.valueOf(mK);
      }
    }
  }
}
