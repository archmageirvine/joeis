package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071567 Smallest k&gt;n such that n^2+n+1 divides k^2+k+1.
 * @author Sean A. Irvine
 */
public class A071567 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long s = ++mN * mN + mN + 1;
    long m = mN;
    while (true) {
      final long v = ++m * m + m + 1;
      if (v % s == 0) {
        return Z.valueOf(m);
      }
    }
  }
}

