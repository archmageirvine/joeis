package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065876 a(n) is the smallest m &gt; n such that n^2 + 1 divides m^2 + 1.
 * @author Sean A. Irvine
 */
public class A071546 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long s = ++mN * mN + 1;
    long m = mN;
    while (true) {
      final long v = ++m * m + 1;
      if (v % s == 0) {
        return Z.valueOf(v / s);
      }
    }
  }
}

