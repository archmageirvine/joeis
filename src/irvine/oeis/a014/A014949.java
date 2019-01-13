package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014949.
 * @author Sean A. Irvine
 */
public class A014949 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long r = 1 % ++mN;
      long m = 1;
      for (long k = 0; k < mN; ++k) {
        m <<= 3;
        m %= mN;
      }
      if (m == r) {
        return Z.valueOf(mN);
      }
    }
  }
}
