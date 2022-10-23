package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014957 Positive integers k that divide 16^k - 1.
 * @author Sean A. Irvine
 */
public class A014957 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long r = 1 % ++mN;
      long m = 1;
      for (long k = 0; k < mN; ++k) {
        m <<= 4;
        m %= mN;
      }
      if (m == r) {
        return Z.valueOf(mN);
      }
    }
  }
}
