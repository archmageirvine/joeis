package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014950 Numbers m such that m divides 10^m - 1.
 * @author Sean A. Irvine
 */
public class A014950 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long r = 1 % ++mN;
      long m = 1;
      for (long k = 0; k < mN; ++k) {
        m *= 10;
        m %= mN;
      }
      if (m == r) {
        return Z.valueOf(mN);
      }
    }
  }
}
