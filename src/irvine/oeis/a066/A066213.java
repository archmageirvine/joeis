package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066207.
 * @author Sean A. Irvine
 */
public class A066213 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n, final long[] divs, final int pos) {
    if (n == 0) {
      return true;
    }
    for (int k = pos; k < divs.length; ++k) {
      final long s = divs[k] * divs[k];
      if (s <= n && is(n - s, divs, k + 1)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN, ZUtils.toLong(Jaguar.factor(mN).divisors()), 0)) {
        return Z.valueOf(mN);
      }
    }
  }
}
