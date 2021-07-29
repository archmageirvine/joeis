package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014741 Numbers k such that k divides 2^(k+1) - 2.
 * @author Sean A. Irvine
 */
public class A014741 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long r = 2 % ++mN;
      long m = 1;
      for (long k = 0; k <= mN; ++k) {
        m <<= 1;
        m %= mN;
      }
      if (m == r) {
        return Z.valueOf(mN);
      }
    }
  }
}
