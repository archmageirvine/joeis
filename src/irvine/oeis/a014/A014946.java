package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014946 Numbers k that divide 6^k-1.
 * @author Sean A. Irvine
 */
public class A014946 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long r = 1 % ++mN;
      long m = 1;
      for (long k = 0; k < mN; ++k) {
        m *= 6;
        m %= mN;
      }
      if (m == r) {
        return Z.valueOf(mN);
      }
    }
  }
}
