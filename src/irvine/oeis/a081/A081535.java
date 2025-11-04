package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081535 Sum of row n of triangle in A081536.
 * @author Sean A. Irvine
 */
public class A081535 extends Sequence1 {

  private static final long[] SMALL = {1, 0, 6, 14};
  private int mN = 0;

  static long gpp(final long k) {
    long max = 1;
    final FactorSequence fs = Jaguar.factor(k);
    for (final Z p : fs.toZArray()) {
      final long pp = p.pow(fs.getExponent(p)).longValue();
      if (pp > max) {
        max = pp;
      }
    }
    return max;
  }

  @Override
  public Z next() {
    if (++mN <= SMALL.length) {
      return Z.valueOf(SMALL[mN - 1]);
    }
    final long lim = mN * (mN - 1L) / 2;
    long k = mN * (mN + 1L) / 2;
    while (true) {
      if (k - gpp(k) >= lim) {
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}
