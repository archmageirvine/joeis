package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065876 a(n) is the smallest m &gt; n such that n^2 + 1 divides m^2 + 1.
 * @author Sean A. Irvine
 */
public class A065876 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long s = ++mN * mN + 1;
    long m = mN;
    while (true) {
      if ((++m * m + 1) % s == 0) {
        return Z.valueOf(m);
      }
    }
  }
}

