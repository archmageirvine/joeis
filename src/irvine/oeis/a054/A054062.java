package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054062 Least k for which the integers Floor(k/m^2) for m=1,2,...,n are distinct.
 * @author Sean A. Irvine
 */
public class A054062 extends Sequence1 {

  private long mN = 0;
  private long mK = 1;

  @Override
  public Z next() {
    ++mN;
    final TreeSet<Long> seen = new TreeSet<>();
    while (true) {
      seen.clear();
      for (long m = 1; m <= mN; ++m) {
        if (!seen.add(mK / (m * m))) {
          break;
        }
      }
      if (seen.size() == mN) {
        return Z.valueOf(mK);
      }
      ++mK;
    }
  }
}
