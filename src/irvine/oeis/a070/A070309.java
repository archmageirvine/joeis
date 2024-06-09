package irvine.oeis.a070;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a060.A060679;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070309 extends A060679 {

  @Override
  public Z next() {
    final long n = super.next().longValueExact();
    long cnt = 0;
    for (long k = 2; k <= n; ++k) {
      if (LongUtils.modPow(k, n, n) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
